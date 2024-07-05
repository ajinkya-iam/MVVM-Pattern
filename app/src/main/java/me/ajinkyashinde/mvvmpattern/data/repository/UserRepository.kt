package me.ajinkyashinde.mvvmpattern.data.repository

import me.ajinkyashinde.mvvmpattern.data.model.User

interface UserRepository {

    suspend fun getUser(userId: String): User

}