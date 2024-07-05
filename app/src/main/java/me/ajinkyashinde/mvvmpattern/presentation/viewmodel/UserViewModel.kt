package me.ajinkyashinde.mvvmpattern.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import me.ajinkyashinde.mvvmpattern.data.model.User
import me.ajinkyashinde.mvvmpattern.data.repository.UserRepositoryImpl
import me.ajinkyashinde.mvvmpattern.data.source.local.LocalDataSource
import me.ajinkyashinde.mvvmpattern.data.source.remote.RemoteDataSource
import me.ajinkyashinde.mvvmpattern.domain.usecase.GetUserUseCase

class UserViewModel: ViewModel() {

    private val userRepository = UserRepositoryImpl(LocalDataSource(), RemoteDataSource())
    private val getUserUseCase = GetUserUseCase(userRepository)

    private val _user = MutableLiveData<User>()
    val user: LiveData<User> get() = _user

    fun loadUser(userId: String){
        viewModelScope.launch {
            val result = getUserUseCase(userId)
            _user.value = result
        }
    }

}