package ahmad.io.javaquizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ahmad.io.javaquizapp.models.Question;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Declare UI elements
    Button btn_one, btn_two, btn_three, btn_four;
    TextView tv_question;

    // Declare variables for tracking game progress
    private final Question question = new Question();
    private int questionIndex = 0;
    private int correctAnswers = 0;
    private final int questionLength = question.questions.length;
    private static final int TOAST_DURATION = Toast.LENGTH_SHORT;

    // Initialize UI elements
    private void initializeUI() {
        tv_question = findViewById(R.id.tv_question);
        btn_one = findViewById(R.id.btn_one);
        btn_two = findViewById(R.id.btn_two);
        btn_three = findViewById(R.id.btn_three);
        btn_four = findViewById(R.id.btn_four);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        initializeUI();

        // Set onClickListener for buttons
        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_three.setOnClickListener(this);
        btn_four.setOnClickListener(this);

        // Display the first question
        setNextQuestion();
    }

    @Override
    public void onClick(View v) {
        Button clickedButton = (Button) v;

        // Check if clicked answer is correct
        if (clickedButton.getText().toString().equals(question.getCorrectAnswer(questionIndex))) {
            // Increase score if answer is correct
            correctAnswers++;
            // Display success message
            Toast.makeText(this, "BRAVO, mais bon c'est facile", TOAST_DURATION).show();
        } else {
            // Display failure message
            Toast.makeText(this, "Wrong Answer, je suis tellement déçu de toi !", TOAST_DURATION).show();
        }

        // Show next question or end game if all questions are answered
        if (questionIndex < questionLength - 1) {
            // If there are more questions, move to the next question
            questionIndex++;
            setNextQuestion();
        } else {
            // If all questions have been answered, end the game
            endGame();
        }
    }

    private void setNextQuestion() {
        // Set the question text
        tv_question.setText(question.getQuestion(questionIndex));

        // Set the answer choices
        List<String> choices = Arrays.asList(question.getChoices(questionIndex));
        Collections.shuffle(choices);
        switch (choices.size()) {
            case 4:
                btn_four.setText(choices.get(3));
            case 3:
                btn_three.setText(choices.get(2));
            case 2:
                btn_two.setText(choices.get(1));
            case 1:
                btn_one.setText(choices.get(0));
                break;
            default:
                break;
        }
    }

    private void endGame() {
        String message = "You answered " +
                correctAnswers +
                " out of " +
                questionLength +
                " questions correctly!";

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton("New Game", (dialog, which) -> recreate())
                .setNegativeButton("Exit", (dialog, which) -> finish());
        alertDialogBuilder.show();
    }
}

