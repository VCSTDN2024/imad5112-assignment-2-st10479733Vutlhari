package vcmsa.ci.memorylane

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity : AppCompatActivity() {

    private lateinit var scoreTxt : TextView
    private lateinit var reviewTxt : TextView
    private lateinit var messageTxt : TextView
    private lateinit var retryButton: Button
    private lateinit var exitButton: Button



    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score)

        scoreTxt = findViewById(R.id.scoreTxt)
         reviewTxt  = findViewById(R.id.reviewTxt)
        messageTxt = findViewById(R.id.messageTxt)
        retryButton = findViewById(R.id.retryButton)
        exitButton = findViewById(R.id.exitButton)

        val questions = intent.getStringArrayExtra("questions")?: return
        val answers = intent.getBooleanArrayExtra("answers")?: return
        val userAnswers = intent.getBooleanArrayExtra("userAnswers")?: return
        val score = intent.getIntExtra("score",0)



            scoreTxt.text = "score: $score/ ${questions.size}"
            //https://chatgpt.com
            if (score < 3) {
                messageTxt.text = "Better luck next time"

        } else {
            messageTxt.text = "Great job"
                messageTxt.visibility = View.VISIBLE
            }


            val reviewBuilder = StringBuilder()
            for (i in questions.indices) {

                reviewBuilder.append("Q${i + 1}: ${questions[i]}\n")
                reviewBuilder.append("Your answer: ${if (userAnswers[i]) "True" else "False"}\n ")
                reviewBuilder.append("Correct Answer: ${if (answers[i]) "True" else "False"}\n")
                reviewBuilder.append(if (userAnswers[i] == answers[i] ) "Result: Correct:\n\n" else "Result: Wrong\n\n")

            }

                reviewTxt.text = reviewBuilder.toString()
                reviewTxt.visibility = View.VISIBLE





        retryButton.setOnClickListener {
            startActivity(Intent(this, FlashActivity2::class.java)) // Goes bact to the flas screen inorder for the user to retry
            finish()
        }

        exitButton.setOnClickListener {
            finishAffinity()//exits the whole app
        }


        }




    }



