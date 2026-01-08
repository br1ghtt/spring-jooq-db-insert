package ch.br1ghtt.spring_jooq_db_insert

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@Import(TestcontainersConfiguration::class)
@SpringBootTest
class SpringJooqDbInsertApplicationTests {
    @Test
    fun contextLoads() {
    }
}
