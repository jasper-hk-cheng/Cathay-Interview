package exam.topic6.service

import exam.topic6.model.User
import exam.topic6.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun findUserById(id: Long): User {
        val userOptional: Optional<User> = userRepository.findById(id)
        return userOptional.get()
    }

    fun findUserByName(userName: String): User {
        return userRepository.findByName(userName)
    }
}