

object RegistrationUtil {
    private val existingUsers = listOf("Peter", "Carl")

    /**
     * the input is not valid if ...
     * ...the username is empty
     * ...the username is already taken
     * the confiremd password is not the same as real password
     * the password contains less than 2 digits
     */
    fun validateRegistrationInput(
            username: String,
            password: String,
            confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (password != confirmedPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}