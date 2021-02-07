package exam.topic6.repository

import exam.topic6.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface UserRepository : JpaRepository<User, Long> {
    // customized select function
    @Query("select u from User u where u.name = :name")
    fun findByName(@Param("name") name: String): User
}

// default built-in function
// findById
// deleteById
