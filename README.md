# Global Weather API

Global Weather API is a Java backend project that provides weather information for locations around the world.

The goal of this project is to build a clean, portfolio-ready REST API using Java and Spring Boot. The API will fetch weather data from an external weather provider and expose simple endpoints for users to get current weather and forecasts.

## Project Goals

- Build a REST API with Java and Spring Boot
- Fetch worldwide weather data from an external API
- Allow users to search weather by city name
- Allow users to search weather by latitude and longitude
- Return clean JSON responses
- Add validation and useful error messages
- Write tests for important application logic
- Document the API clearly
- Use Git and GitHub properly during development

## Planned Features

- Current weather by city
- Current weather by coordinates
- Weather forecast by city
- Location search / geocoding
- Error handling for invalid input
- Service layer for business logic
- External API client layer
- Unit and integration tests
- GitHub Actions CI pipeline

## Planned API Endpoints

```http
GET /api/v1/weather/current?city=Ljubljana
GET /api/v1/weather/current?latitude=46.0569&longitude=14.5058
GET /api/v1/weather/forecast?city=Tokyo&days=7
GET /api/v1/locations/search?query=Berlin