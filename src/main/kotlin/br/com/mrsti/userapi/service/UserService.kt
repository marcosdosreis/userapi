package br.com.mrsti.userapi.service

import br.com.mrsti.userapi.entity.User
import br.com.mrsti.userapi.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun findAllUsers() : List<User> {
        return userRepository.findAll()
    }

    fun findUserByLogin(login: String) : List<User> {
        return userRepository.findByLogin(login)
    }

    fun findUserByName(name: String) : List<User> {
        return userRepository.findByNameContaining(name)
    }

    fun save(user: User) {
        userRepository.save(user)
    }
}