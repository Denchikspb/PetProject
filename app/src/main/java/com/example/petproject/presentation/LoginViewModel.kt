package com.example.petproject.presentation

import com.example.petproject.repository.UserRepository
import javax.inject.Inject

interface LoginViewModel {

}

class LoginViewModelImpl @Inject constructor(
    private val userRepository: UserRepository
) : LoginViewModel {
}