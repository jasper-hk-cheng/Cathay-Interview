package exam.topic6.model

import javax.persistence.*

@Entity
@Table(name = "user")
data class User(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long = 0L,
        @Column(name = "name") var name: String = "",
        @Column(name = "age") var age: Int = 0,
        @Column(name = "memo") var memo: String = "",
)

/*
id int auto increment
name varchar nullable
age int nullable
memo text nullable
 */