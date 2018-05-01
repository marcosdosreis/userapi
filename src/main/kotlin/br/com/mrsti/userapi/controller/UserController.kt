package br.com.mrsti.userapi.controller

import br.com.mrsti.userapi.entity.User
import br.com.mrsti.userapi.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping("/login/{login}")
    fun findByLogin (@PathVariable(value = "login") login : String) : List<User> {
        return userService.findUserByLogin(login)
    }

    @GetMapping("/name/{name}")
    fun findByName (@PathVariable(value = "name") name : String) : List<User> {
        return userService.findUserByName(name)
    }

    @GetMapping
    fun findAll() : List<User> {
        return userService.findAllUsers()
    }

    @PostMapping
    fun save(@RequestBody user: User) {
        userService.save(user)
    }

}