package patternofname;

import java.util.*;

class gusser
{
	int gussednum;
	int gussernumber()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("please gusse a number");
		gussednum=s1.nextInt();
		return gussednum;
	}
}
class player
{
	int gussnum;
	int players()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("please guss a number");
		gussnum=scan.nextInt();
		//gussnum=g1.gussernumber();
		return gussnum;
	}
}
class umpire
{
	int gussnum;
	int p1num;
	int p2num;
	int p3num;
	void collectgusser()
	{
		gusser g1= new gusser();
		gussnum=g1.gussernumber();
	}
	void collectplayer()
	{
		player p1=new player();
		player p2=new player();
		player p3=new player();
        p1num=p1.players();
		p2num=p2.players();
		p3num=p2.players();
	}
	void compare()
	{
		if (gussnum==p1num)
		{
			if (gussnum==p2num && gussnum==p3num)
			{
				System.out.println("all 3 players won");	
			}
			else if(gussnum==p2num)
			{
				System.out.println("player1 and player2 won");
			}
			else if (gussnum==p3num)
			{
				System.out.println("player1 and player3 won");
			}
			else
			{
				System.out.println("player1 won");
			}
		}
		else if (gussnum==p2num)
		{
			if(gussnum==p3num)
			{
				System.out.println("player2 and player3 won");
			}
			else
			{
				System.out.println("player3 won");
			}
		}
		else if(gussnum==p3num)
		{
			System.out.println("player3 won");
		}
		else
		{
			System.out.println("loss the game");	
		}
		}
		
}

public class game {

	public static void main(String[] args) 
	{
		umpire u1=new umpire();
		u1.collectgusser();
		u1.collectplayer();
		u1.compare();
		
	}

}
