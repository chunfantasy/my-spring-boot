package chun.api.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class UserInfo(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long?,
        var nickName: String) {
    constructor(nickName: String) : this(null, nickName)
}
