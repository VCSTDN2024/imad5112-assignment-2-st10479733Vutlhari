package vcmsa.ci.memorylane

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class FlashActivity2 : AppCompatActivity() {

    private lateinit var questionTxt: TextView
    private lateinit var resultTxt: TextView
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextButton: Button
    private lateinit var questionButton: Button

    private val questions = arrayOf(
        "Morocco is the first oldest royal dynasty in the world",
        "The sun rotates around the Earth ",
        "Asia is the largest continent in the world",
        "Ancient Egyptians would shave their eyebrows to mourn the death of their cats",
        "A man survived two atomic bombs"

    )

    private val answers = booleanArrayOf(
        false,
        false,
        true,
        true,
        true,
    )


    private val userAnswers = BooleanArray(questions.size)
    private var currentQuestionIndex = 0
    private var correctAnswer = 0
    private var hasAnswered = false



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flash2)

        val questionTxt: TextView = findViewById(R.id.questionTxt)
        val resultTxt: TextView = findViewById(R.id.resultTxt)
        trueButton = findViewById(R.id.trueButton)
        falseButton = findViewById(R.id.falseButton)
        nextButton = findViewById(R.id.nextButton)
        questionButton = findViewById(R.id.questionButton)


        trueButton.setOnClickListener {

            if (!hasAnswered) {
                userAnswers[currentQuestionIndex] = true

                if (answers[currentQuestionIndex]) {
                    correctAnswer++
                    resultTxt.text = "Correct"
                    resultTxt.setTextColor(Color.GREEN)
                    resultTxt.visibility = View.VISIBLE
                } else {
                    resultTxt.text = "Incorrect!"
                    resultTxt.setTextColor(Color.RED)

                }
                trueButton.isEnabled = false
                falseButton.isEnabled = false
                nextButton.isEnabled = true
            }
        }


        falseButton.setOnClickListener {
            if (!hasAnswered) {
                userAnswers[currentQuestionIndex] = false

                if (!answers[currentQuestionIndex]) {
                    correctAnswer++
                    resultTxt.text = "Correct"
                    resultTxt.setTextColor(Color.GREEN)
                    resultTxt.visibility = View.VISIBLE
                } else {
                    resultTxt.text = "Incorrect"
                    resultTxt.setTextColor(Color.RED)
                }
                trueButton.isEnabled = false
                falseButton.isEnabled = false
                nextButton.isEnabled = true
            }
        }
        nextButton.setOnClickListener {
            currentQuestionIndex++
            if (currentQuestionIndex < questions.size) {

                questionTxt.text = questions[currentQuestionIndex]
                resultTxt.text = ""
                resultTxt.visibility = View.VISIBLE
                trueButton.isEnabled = true
                falseButton.isEnabled = true
                nextButton.isEnabled = false
            } else {
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("questions", questions)
                intent.putExtra("score", correctAnswer)
                intent.putExtra("answers", answers)
                intent.putExtra("userAnswers", userAnswers)
                startActivity(intent)
            }


        }

        questionButton.setOnClickListener {
            questionTxt.text = questions[currentQuestionIndex]
            hasAnswered = false
            questionTxt.visibility = View.VISIBLE
            trueButton.isEnabled = true
            falseButton.isEnabled = true
        }
            }

        }









