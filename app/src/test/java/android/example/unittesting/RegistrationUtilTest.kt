
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{
    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
                username = "",
                password = "123",
                confirmedPassword = "123"


        )
        assertThat(result).isFalse()
    }
    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
                username = "Philip",
                password = "123",
                confirmedPassword = "123"


        )
        assertThat(result).isTrue()

    }
    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
                username = "Carl",
                password = "123",
                confirmedPassword = "123"


        )
        assertThat(result).isFalse()
    }
        @Test
        fun `incorrectly confirmed password returns false`() {
            val result = RegistrationUtil.validateRegistrationInput(
                    username = "Phillip",
                    password = "123456",
                    confirmedPassword = "abcdefg"


            )
            assertThat(result).isFalse()

        }
    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
                username = "Phillip",
                password = "",
                confirmedPassword = ""


        )
        assertThat(result).isFalse()

    }
}