package ahmad.io.javaquizapp.models;

public class Question {

    public String[] questions = {
            "Which is a Programming Language?",
            "What does HTML stand for?",
            "Which of the following is the correct way of making a string in Java?",
            "What is a correct syntax to output \"Hello World\" in Python?"
    };

    public String[][] choices = {
            {
                    "HTML",
                    "CSS",
                    "English",
                    "PHP"
            },
            {
                    "Hyper Trainer Marking Language",
                    "Hyper Text Marketing Language",
                    "Hyper Text Markup Language",
                    "Hyper Text Markup Leveler",
            },
            {
                    "String \"Text\";",
                    "String text = 'text';",
                    "String text = \"text\"",
                    "String text = \"text\";"
            },
            {
                    "print \"Hello World\"",
                    "print(\"Hello World\");",
                    "printer(\"Hello World\");",
                    "Printing(\"Hello World\");"
            }

    };

    public String[] correctAnswer = {
            "PHP",
            "Hyper Text Markup Language",
            "String text = \"text\";",
            "print(\"Hello World\");"
    };

    public String getQuestion(int a) {
        return questions[a];
    }

    public String[] getChoices(int a) {
        return choices[a];
    }

    public String getCorrectAnswer(int a) {
        return correctAnswer[a];
    }

}
