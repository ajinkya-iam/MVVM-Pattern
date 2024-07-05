package me.ajinkyashinde.mvvmpattern.domain.usecase

import me.ajinkyashinde.mvvmpattern.data.model.User
import me.ajinkyashinde.mvvmpattern.data.repository.UserRepository

class GetUserUseCase(private val userRepository: UserRepository) {

    suspend operator fun invoke(userId: String): User{
        return userRepository.getUser(userId)
    }

}