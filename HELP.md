# Read Me First
The following was discovered as part of building this project:

* The JVM level was changed from '25' to '24' as the Kotlin version does not support Java 25 yet.
* The original package name 'ch.br1ghtt.spring-jooq-db-insert' is invalid and this project uses 'ch.br1ghtt.spring_jooq_db_insert' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/4.0.1/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/4.0.1/maven-plugin/build-image.html)
* [Spring Boot Testcontainers support](https://docs.spring.io/spring-boot/4.0.1/reference/testing/testcontainers.html#testing.testcontainers)
* [Testcontainers MySQL Module Reference Guide](https://java.testcontainers.org/modules/databases/mysql/)
* [Flyway Migration](https://docs.spring.io/spring-boot/4.0.1/how-to/data-initialization.html#howto.data-initialization.migration-tool.flyway)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/4.0.1/reference/data/sql.html#data.sql.jdbc)
* [Testcontainers](https://java.testcontainers.org/)
* [Spring Cache Abstraction](https://docs.spring.io/spring-boot/4.0.1/reference/io/caching.html)
* [JOOQ Access Layer](https://docs.spring.io/spring-boot/4.0.1/reference/data/sql.html#data.sql.jooq)

### Guides
The following guides illustrate how to use some features concretely:

* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/main/jdbc/basics)
* [Caching Data with Spring](https://spring.io/guides/gs/caching/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

### Testcontainers support

This project uses [Testcontainers at development time](https://docs.spring.io/spring-boot/4.0.1/reference/features/dev-services.html#features.dev-services.testcontainers).

Testcontainers has been configured to use the following Docker images:

* [`mysql:latest`](https://hub.docker.com/_/mysql)

Please review the tags of the used images and set them to the same as you're running in production.

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

