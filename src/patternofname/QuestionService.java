package patternofname;

import java.util.*;

public class QuestionService extends Thread
{
	Question q[]=new Question[5];
	General g[]=new General[5];
	//int ar[]=new int[5];
	//q1,q2,q3,q4,q5;
	String Selection[]=new String[5];
	QuestionService()
	{
		q[0]= new Question(1,"Size of Int","1","2","4","8","4");
		q[1]= new Question(2,"Size of Float","1","2","4","8","8");
		q[2]= new Question(3,"Size of Double","1","2","4","8","8");
		q[3]= new Question(4,"Size of Char","1","2","4","8","2");
		q[4]= new Question(5,"Size of boolean","1","2","4","8","1");
		
		g[0]=new General(1,"National color","green","yellow","pink","red","green");
		g[1]=new General(2,"National tree","bamboo","mango","banyan","coconut","banyan");
		g[2]=new General(3,"Nation animal","tiger","lion","dog","leopard","lion");
		g[3]=new General(4,"Nation river","ganga","yamuna","krishna","godavari","ganga");
		g[4]=new General(5,"Nation flower","lotus","rose","lily","jasmine","lotus");
	}
	
	
	public void display()
	{
		for(Question q1:q) 
		{
			System.out.println(q1.toString());
		}
	}
	public void display1()
	{
		for(General g1:g)
		{
			System.out.println(g1);
		}
	}
	public void playquiz()
	{
		
		System.out.println("Their is negative marking for wrong question -1");
		System.out.println("Select the type of question paper?general/question");
		try
		{
			Scanner s2=new Scanner(System.in);
			String Select=s2.nextLine();
			switch(Select)
			{
			case "question":

			{
				int i=0;
				for(Question q:q)
				{
					System.out.println("Question"+ (i+1) +": " + q.getQuestion()); 
					System.out.println("1. " +q.getOpt1());                         
					System.out.println("2. " +q.getOpt2());
					System.out.println("3. " +q.getOpt3());
					System.out.println("4. " +q.getOpt4());
					
					System.out.println("Do you want to skip question?Yes/No");
				try 
				{
					Scanner s=new Scanner(System.in);
					String decision=s.nextLine();
					if(decision.equalsIgnoreCase("Yes"))
					{
						Selection[i]="skip";
						i++;
					
					}
					else
					{
						System.out.println("Select the right answer from the options");
						Scanner s1=new Scanner(System.in);
						Selection[i] =s1.nextLine();
						i++;
			
					}
				  }
					catch(NumberFormatException e)
					{
						System.out.println("Invalid Input");
					}
				}
					
			
		
			
			break;
			}
			case "general":
			{
				
				int i=0;
				for(General q4:g)
				{
					System.out.println("Question"+ (i+1) +": " + q4.getQuestion());        
					System.out.println("1. " +q4.getOpt1());                         
					System.out.println("2. " +q4.getOpt2());
					System.out.println("3. " +q4.getOpt3());
					System.out.println("4. " +q4.getOpt4());
					
					System.out.println("Do you want to skip question?Yes/No");
					try
					{
						Scanner s3=new Scanner(System.in);
						String decision=s3.nextLine();
						if(decision.equalsIgnoreCase("No"))
						{
						System.out.println("Select the right answer from the options");
						Scanner s1=new Scanner(System.in);
						Selection[i] =s1.nextLine();
						i++;
						}
						else
						{
							Selection[i]="skip";
							i++;
						}
					}
					catch(NumberFormatException e)
					{
						System.out.println("Invalid input!!");
					}
					
					
					
				}
			
			break;
			}
			default:
			{
				System.out.println("Invalid choice please select general or question");
			}
			}
		}
		
			catch(Exception e)
			{
				System.out.println("Invalid input");
			}
		
		}
		
	
	public void compute()
	{
		int right=0;
		int wrong=0;
		 try
		 {
		        for (int i = 0; i < 5; i++) 
		        {
		            Question q1 = q[i];
		            String answer = q1.getAnswer();
		            String selectedAnswer = Selection[i];
		            if (!selectedAnswer.equals("skip")) 
		            {
		                if (answer.equals(selectedAnswer)) 
		                {
		                    right++;
		                } 
		                else 
		                {
		                    wrong++;
		                }
		            }
		        }
		        System.out.println("Total score is: " + (right - wrong));
		 } 
		        catch (Exception e) 
				 {
				        System.out.println("Invalid Input");
				 }
				

		        System.out.println("Do you want to play again?yes/no");
		        Scanner a = new Scanner(System.in);
		        String a1 = a.nextLine();
		        if (a1.equalsIgnoreCase("yes")) 
		        {
		        	//Arrays.fill(Selection, null);
		        	playquiz();
		        } 
		        else 
		        {
		            System.out.println("Thanks for playing the Quiz!!");
		        }
		    
		
	}
}
