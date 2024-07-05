package me.ajinkyashinde.mvvmpattern.data.source.remote

import me.ajinkyashinde.mvvmpattern.data.model.User

class RemoteDataSource {

    fun fetchUser(): User {
        return User("1", "Ajinkya", "ajinkyashinde.me@gmail.com")
    }

}