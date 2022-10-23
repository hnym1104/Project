package kr.yerim.project.config

import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Component
import java.util.Base64
import javax.annotation.PostConstruct

//@Component
//class JwtTokenProvider(private val userDetailsService: UserDetailsService) {
//
//    private val secretKey = "userSecretKey"
//    private val tokenValidateTime = 30 * 60 * 1000L
//
//    @PostConstruct
//    protected fun init(): String {
//        return Base64.getEncoder().encodeToString(secretKey.toByteArray())
//    }
//
//    fun createToken(userPk: String): String {
//        val claims: Claims = Jwts.claims().setSubject(userPk) // JWT payload 에 저장되는 정보단위
//        claims["userPk"] = userPk // 정보는 key / value 쌍으로 저장된다.
//        val now = Date()
//        return Jwts.builder()
//            .setHeaderParam("typ", "JWT")
//            .setClaims(claims) // 정보 저장
//            .setIssuedAt(now) // 토큰 발행 시간 정보
//            .setExpiration(Date(now.time + tokenValidTime)) // set Expire Time
//            .signWith(SignatureAlgorithm.HS256, secretKey) // 사용할 암호화 알고리즘과
//            // signature 에 들어갈 secret값 세팅
//            .compact()
//    }
//}