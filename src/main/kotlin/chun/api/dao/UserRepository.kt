package chun.api.dao

import chun.api.model.UserInfo

interface UserRepository  {
	fun findAll(): Iterable<UserInfo>
}
