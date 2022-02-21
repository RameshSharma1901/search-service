# Simple Search Service

An HTTP Service that returns random search results back no matter what JSON a client sends to it.

## Running the app
You can run the app - locally with Maven, or in your IDE.

**Prerequisites**
These instructions assume you have the following installed: 
- Maven
- Java
- JDK

Installation instructions for the above are readily available online.

**Running via Maven**

- Clone the repo to your development machine
- cd into the project folder once cloned
- mvn spring-boot:run

Once running, you can interact with the local server via localhost:8080

## API Docs

Detailed API Docs are provided by Swagger - available locally at http://localhost:8080/swagger-ui/index.html when the
app is running

## Example Interaction

**Request**

`curl --header "Content-Type: application/json" --request POST --data '{"searchTerm": "test"}' http://localhost:8080/api/search`

**Response**

`[{"title": "Title1","description": "A description","tags": ["tag1","tag2"],"weight": 3 },{"title": "Title2","description": "A description","tags": ["tag1","tag2"],"weight": 1 }, {"title": "Title3","description": "A description","tags": ["tag1","tag2"],"weight": 2 }, {"title": "Title4","description": "A description","tags": ["tag1","tag2"],"weight": 4 }]`

## Monitoring

Micrometer has been included in the application, and a prometheus scraper endpoint exposed to allow observation of the
app.

Scraper Endpoint: http://localhost:8080/actuator/prometheus

## For UI click [here](https://github.com/RameshSharma1901/search-service/blob/main/src/main/ui/README.md)

