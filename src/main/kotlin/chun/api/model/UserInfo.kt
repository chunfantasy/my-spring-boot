package chun.api.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class UserInfo(
    @Id var id: Long,
    var nickName: String)
