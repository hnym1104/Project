package kr.yerim.project.repository

import kr.yerim.project.domain.UserAccountEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserAccountRepository: JpaRepository<UserAccountEntity, Int> {
    fun findByUserEmail(userEmail: String): UserAccountEntity?
}