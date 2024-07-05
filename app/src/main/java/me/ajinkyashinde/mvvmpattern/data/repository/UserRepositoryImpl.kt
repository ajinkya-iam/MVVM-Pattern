package me.ajinkyashinde.mvvmpattern.data.repository

import me.ajinkyashinde.mvvmpattern.data.model.User
import me.ajinkyashinde.mvvmpattern.data.source.local.LocalDataSource
import me.ajinkyashinde.mvvmpattern.data.source.remote.RemoteDataSource

class UserRepositoryImpl(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
): UserRepository {
    override suspend fun getUser(userId: String): User {
        return localDataSource.fetchUser()
    }
}