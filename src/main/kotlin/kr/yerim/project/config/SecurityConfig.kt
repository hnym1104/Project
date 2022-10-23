package kr.yerim.project.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Role
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun webSecurityCustomizer(): WebSecurityCustomizer {
        return WebSecurityCustomizer { web: WebSecurity -> web.ignoring().antMatchers("/join", "/login") }
    }

    @Bean
    @Throws(Exception::class)
    fun filterChain(httpSecurity: HttpSecurity): SecurityFilterChain? {
        return httpSecurity
            .authorizeRequests()
            .antMatchers("/", "/css/**", "/img/**", "/js/**", "scss/**", "/vendor/**").permitAll()
            .antMatchers("/**").hasRole("USER")
            .and()
            .formLogin()
            .loginPage("/login") // 사용자 정의 로그인 페이지
            .defaultSuccessUrl("/main") // 로그인 성공 후 이동 페이지
            .failureUrl("/login?error=true") // 로그인 실패 후 이동 페이지
            .usernameParameter("username") // 아이디 파라미터명 설정
            .passwordParameter("“password”") // 패스워드 파라미터명 설정
            .loginProcessingUrl("/login")
            .and()
            .build()
    }
}