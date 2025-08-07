package Projects.Project1;


public class QuestionService {

    Question[] questions = new Question[5];

    public QuestionService() {
        questions [0] = new Question (1, "What is the 1st Lang?","Java","CPP","Python","JavaScript","Java");
        questions [1] = new Question (id:2, question: "size of double", opt1:"2", opt2:"6",opt3:"8",opt4:"10",answer:"8");
        questions [2] = new Question (id:3, question: "size of char", opt1:"2", opt2:"6",opt3:"8", opt4:"10", answer:"2");
        questions [3] = new Question (id:4, question: "size of long", opt1:"2", opt2:"6", opt3:"8", opt4:"10", answer:"8");
        questions [4] = new Question (id:5, question: "size of boolean", opt1:"1", opt2:"2", opt3:"3", opt4:"4", answer:"1");
    }
    

    public void displayQuestions() {
        System.out.println(questions[0].getQuestion());


    }
}
