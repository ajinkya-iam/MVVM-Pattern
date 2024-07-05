package me.ajinkyashinde.mvvmpattern.data.source.local

import me.ajinkyashinde.mvvmpattern.data.model.User

class LocalDataSource {

    fun fetchUser(): User {
        return User("1", "Ajinkya", "ajinkyashinde.me@gmail.com")
    }

}