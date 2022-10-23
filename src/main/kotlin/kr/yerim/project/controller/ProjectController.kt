package kr.yerim.project.controller

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class ProjectController {

    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/login")
    fun getLogin(@RequestParam(value = "error", defaultValue = "false") error: String): String {
        log.info("error = $error")
        return "login"
    }

    @GetMapping("/join")
    fun getJoin(): String {
        return "join"
    }

    @GetMapping("/find/password")
    fun getFindPassword() {

    }

    @GetMapping("/main")
    fun getMain(): String {
        return "main"
    }
}