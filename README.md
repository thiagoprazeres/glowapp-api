# GlowApp: Wellness beauty
## Brilhe por dentro e por fora com o GlowApp
WebApp: [glowapp-staging.netlify.app](https://glowapp-staging.netlify.app/)

# Ferramenta para o backend

* Spring Boot 2.7.11
* Java 11
* Maven 3.9.2
* Lombok
* PostgreSQL
* Flyway
* JPA / Hibernate
* Bean Validation

# Instalar dependências

`mvn install`

# Rodar projeto

`mvn spring-boot:run`

# Documentação com OpenAPI

SpringDoc: [/swagger-ui.html](https://glowapp-api.azurewebsites.net/swagger-ui/index.html)

# Deploy para Azure Aplicativo Web

`mvn package azure-webapp:deploy`