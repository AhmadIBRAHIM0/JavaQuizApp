package ahmad.io.javaquizapp.data;

public class QuestionData {

    public static String[] questions = {
            "Which is a Programming Language?",
            "What does HTML stand for?",
            "Which of the following is the correct way of making a string in Java?",
            "What is a correct syntax to output \"Hello World\" in Python?"
    };

    public static String[][] choices = {
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

    public static String[] correctAnswer = {
            "PHP",
            "Hyper Text Markup Language",
            "String text = \"text\";",
            "print(\"Hello World\");"
    };

}
