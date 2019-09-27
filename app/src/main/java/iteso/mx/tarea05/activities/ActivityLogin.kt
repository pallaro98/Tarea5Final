package iteso.mx.tarea05.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import iteso.mx.tarea05.R
import org.jetbrains.anko.find
import org.jetbrains.anko.startActivity

class ActivityLogin : AppCompatActivity(), View.OnClickListener  {
    /* TODO Declare EditText and Button variables */
    private lateinit var mLogin: Button
    private lateinit var mEmail: EditText
    private lateinit var mPassword: EditText

    companion object {
        const val EMAIL = "EMAIL"
        const val PASSWORD = "PASSWORD"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mLogin = find(R.id.activity_login_btn_login)
        mEmail = find(R.id.activity_login_tiet_email)
        mPassword = find(R.id.activity_login_tiet_password)
        mLogin.setOnClickListener(this)

        /* TODO Authenticate User with Parse */
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val email = savedInstanceState.getString(EMAIL)
        val password = savedInstanceState.getString(PASSWORD)

        /* TODO Register User on Parse */
    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.activity_login_btn_login -> {
                startActivity<ActivityTutorial>()
            }
        }
    }
}
