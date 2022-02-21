import TextField from "@mui/material/TextField";
import Button from "@mui/material/Button";
import Stack from "@mui/material/Stack";
import { useState } from "react";
import axios from "axios";
import TermDetais from "../termDetails/TermDetais";

/* Home component*/
export default function Home() {
  const [searchTerm, setSearchTerm] = useState("");
  const [data, setData] = useState([]);

  /* Function to call search API */
  function search() {
    const payload = {
      method: "POST",
      body: JSON.stringify({ searchTerm: { searchTerm } }),
    };

    axios
      .post("http://localhost:8080/api/search", {
        payload,
      })
      .then(function (response) {
        /* If response retrieved */
        setData(
          /* Sort the data on weights */
          response.data.sort((a, b) => {
            return b.weight - a.weight;
          })
        );
      })
      .catch(function (error) {
        /* In case if error */
        alert(error);
      });
  }

  return (
    <>
      <Stack
        style={{ marginTop: "10px", marginLeft: "10px" }}
        spacing={1}
        direction="row"
      >
        <TextField
          id="outlined-basic"
          label="Search Term"
          variant="outlined"
          onChange={(e) => setSearchTerm(e.target.value)}
        />
        <Button variant="outlined" onClick={search}>
          Search
        </Button>
      </Stack>
      <Stack>{data && <TermDetais data={data} />}</Stack>
    </>
  );
}
