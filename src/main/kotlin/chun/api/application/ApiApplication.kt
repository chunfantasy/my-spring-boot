package chun.api.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("chun.api")
@EntityScan("chun.api.model")
class ApiApplication {

}

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}
