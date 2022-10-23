package kr.yerim.project.domain

import javax.persistence.*

@Entity
@Table(name = "user_account")
open class UserAccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Int? = null

    @Column(name = "user_email", nullable = false, length = 100)
    open var userEmail: String? = null

    @Column(name = "user_name", nullable = false, length = 100)
    open var userName: String? = null

    @Column(name = "user_pw", nullable = false, length = 100)
    open var userPw: String? = null
}