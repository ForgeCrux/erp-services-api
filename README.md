# erp-services-api

Generated Spring Boot application from OpenAPI specification.

## Project Details
- **Group ID**: com.probestack.forgestudio.design
- **Artifact ID**: erp-services-api
- **Version**: 1.0.0
- **Base Package**: com.probestack.forgestudio.design

## Building the Project
```bash
mvn clean install
```

## Running the Application
```bash
mvn spring-boot:run
```

## API Documentation
Once the application is running, access the Swagger UI at:
- http://localhost:8080/swagger-ui.html

## API Docs (OpenAPI)
- Source spec: `src/main/resources/openapi.yaml`
- Runtime docs: http://localhost:8080/v3/api-docs

## Postman Collection
Import the generated collection from:
- `postman/erp-services-api.postman_collection.json`

Set the `baseUrl` collection variable to:
- Local: `http://localhost:8080`
- Cloud Run: your deployed service URL

## Default API Behavior
Generated APIs are Mongo-backed scaffolds:
- `POST` operations persist request data and return `201`
- list `GET` operations return persisted records
- `GET /{id}` operations return a persisted record or `404`
- `DELETE /{id}` operations delete persisted records and return `204`
- domain-specific business operations return `501 NOT_IMPLEMENTED` until implemented

## MongoDB Persistence
Generated services use MongoDB database `ps-code-generator-db`.
Collections are prefixed by application name to avoid collisions, for example:
- `my_service_accounts`
- `my_service_transactions`

## Cloud Run Deployment
This generated project includes GitHub Actions CI/CD for Google Cloud Run.

- Workflow: `.github/workflows/ci-cd.yml`
- Service name: `erp-services-api`
- GCP project: `probestack-prod`
- Region: `us-central1`
- Artifact Registry repository: `us-central1-docker.pkg.dev/probestack-prod/probestack-prod-apps`

On every GitHub push, the workflow builds the application, publishes a Docker image, deploys to Cloud Run, and verifies `/actuator/health`.

See `DEPLOYMENT.md` for setup instructions.
