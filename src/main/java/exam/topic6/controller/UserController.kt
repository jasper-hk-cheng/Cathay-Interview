package exam.topic6.controller

import exam.topic6.model.User
import exam.topic6.repository.UserRepository
import exam.topic6.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping("/")
    fun index(): String {
        return "hello spring boot !!"
    }

    @GetMapping("/user/{id}")
    fun getUserById(@PathVariable("id") userId: Long): User {
        return userService.findUserById(userId)
    }

    @GetMapping("user")
    fun getUserByName(@RequestParam("userName") userName: String): User {
        return userService.findUserByName(userName)
    }
}
