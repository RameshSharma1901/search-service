package eu.pjmoore.searchservice.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class SearchRequest {

    private final String searchTerm;

    @JsonCreator
    public SearchRequest(@JsonProperty("searchTerm") String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchRequest that = (SearchRequest) o;
        return Objects.equals(searchTerm, that.searchTerm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchTerm);
    }

    @Override
    public String toString() {
        return "SearchRequest{" +
                "searchTerm='" + searchTerm + '\'' +
                '}';
    }
}
