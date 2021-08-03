package com.kdroid.kmmdemo.android.ui.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kdroid.kmmdemo.data.LoginDataSource
import com.kdroid.kmmdemo.data.LoginDataValidator
import com.kdroid.kmmdemo.data.LoginRepository

/**
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 */
class LoginViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(
                    loginRepository = LoginRepository(
                            dataSource = LoginDataSource()
                    ),
                dataValidator = LoginDataValidator()
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}