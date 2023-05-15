package ahmad.io.javaquizapp.services;

import ahmad.io.javaquizapp.data.QuestionData;

public class QuestionService {

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
