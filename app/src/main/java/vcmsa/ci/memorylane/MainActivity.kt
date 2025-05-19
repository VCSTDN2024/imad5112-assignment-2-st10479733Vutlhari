package vcmsa.ci.memorylane

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var welcomeTxt: TextView
    private lateinit var startButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        welcomeTxt = findViewById(R.id.welcomeTxt)
        startButton = findViewById(R.id.startButton)

        startButton.setOnClickListener {
            //moves to the next screen
            startActivity(Intent(this,FlashActivity2::class.java)) // Generated from my previous tamabuddy
        }

        }
    }
