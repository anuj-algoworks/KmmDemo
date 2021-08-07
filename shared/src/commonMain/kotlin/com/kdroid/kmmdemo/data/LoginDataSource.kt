package com.kdroid.kmmdemo.data

import com.kdroid.kmmdemo.data.model.LoggedInUser
import com.kdroid.kmmdemo.randomUUID

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        return try {
            // TODO: handle loggedInUser authentication
                    val fakeUser = LoggedInUser(randomUUID(), username)
                    Result.Success(fakeUser)

        } catch (e: Throwable) {
            Result.Error(RuntimeException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}