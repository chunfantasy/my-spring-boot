package chun.api.repository

import chun.api.application.ApiApplication
import chun.api.model.UserInfo
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.PropertySource
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension


@ExtendWith(SpringExtension::class)
@ContextConfiguration(classes = [ApiApplication::class])
@EnableJpaRepositories("chun.api.repository")
@PropertySource("classpath:junit-platform.properties")
class RepositoryTests(@Autowired val userRepository: UserRepository) {

	@Test
	fun `Test save`() {
        for (i in 1..100) {
            userRepository.save(UserInfo("NickNameTest"))
        }
        Assertions.assertEquals(100, userRepository.findAll().count())
	}
}