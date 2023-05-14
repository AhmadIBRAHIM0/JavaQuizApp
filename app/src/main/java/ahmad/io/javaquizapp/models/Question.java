package ahmad.io.javaquizapp.models;

import ahmad.io.javaquizapp.data.QuestionData;

public class Question {

    public String getQuestion(int a) {
        return QuestionData.questions[a];
    }

    public String[] getChoices(int a) {
        return QuestionData.choices[a];
    }

    public String getCorrectAnswer(int a) {
        return QuestionData.correctAnswer[a];
    }

}
