package patternofname;

public class QuizApp {

	public static void main(String[] args) 
	{
		//create a quiz(5 question)
		//create 5 question from the user
		//QuestionService:create,get.delete
		//Array-String
		QuestionService qs=new QuestionService();
		//qs.display1();
		qs.playquiz();
		qs.compute();
		qs.start();
		//role
		//*negative marking
		//*real time score
		//*play again
		//*skip question
		//set timer

	}

}
