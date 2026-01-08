package ch.br1ghtt.spring_jooq_db_insert

import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.testcontainers.service.connection.ServiceConnection
import org.springframework.context.annotation.Bean
import org.testcontainers.mysql.MySQLContainer
import org.testcontainers.oracle.OracleContainer
import org.testcontainers.utility.DockerImageName

@TestConfiguration(proxyBeanMethods = false)
class TestcontainersConfiguration {

	@Bean
	@ServiceConnection
	fun mysqlContainer(): MySQLContainer {
		return MySQLContainer(DockerImageName.parse("mysql:9.5.0"))
	}

	@Bean
	@ServiceConnection
	fun oracleContainer(): OracleContainer {
		return OracleContainer(DockerImageName.parse("gvenzl/oracle-free:23-slim-faststart"))
	}

}
