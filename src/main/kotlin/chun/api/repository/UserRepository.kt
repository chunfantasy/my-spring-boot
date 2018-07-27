package chun.api.repository

import chun.api.model.UserInfo
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<UserInfo, Long> {
	override fun findAll(): Iterable<UserInfo>
}