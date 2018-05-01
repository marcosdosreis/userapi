package br.com.mrsti.userapi.repository

import br.com.mrsti.userapi.entity.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<User, String> {

    fun findByLogin(login: String) : List<User>

    fun findByNameContaining(name: String) : List<User>

}