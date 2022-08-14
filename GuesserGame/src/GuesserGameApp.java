import java.util.Scanner;
class Guesser
{
	int gnum;
	int guessNum(int low,int high)
	{
		System.out.println("Guesser!Kindly guess a number between "+ low +" to "+ high);
		Scanner scan=new Scanner(System.in);
		gnum=scan.nextInt();
		if(gnum>=low&&gnum<=high)
		{
			return gnum;
		}
		else
		{
			System.out.println("Please kindly guess the number between the given range");
			return guessNum(low,high);
		}
		
	}
}
class Player
{
	int pnum;
	int predictNum(int low,int high)
	{
		System.out.println("Player!Kindly,predict a number between "+ low +" to "+ high);
		Scanner scan=new Scanner(System.in);
		pnum=scan.nextInt();
		if(pnum>=low&&pnum<=high)
		{
			return pnum;
		}
		else
		{
			System.out.println("please kindly predict a number from the given range");
			return predictNum(low,high);
		}
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	void collectNumFromGuesser() 
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum(1,200);
		
	}
	void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.predictNum(1,200);
		numFromPlayer2=p2.predictNum(1,200);
		numFromPlayer3=p3.predictNum(1,200);
		
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			System.out.println("Player1 wins");
		}
		if(numFromGuesser==numFromPlayer2)
		{
			System.out.println("Player2 wins");
		}
		if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player3 wins");
		}
		
		if(numFromGuesser==numFromPlayer1 || numFromGuesser==numFromPlayer2 || numFromGuesser==numFromPlayer3)
		{
		   System.out.println("Game over");
		   System.exit(0);
		}
		
		else if(numFromGuesser!=numFromPlayer1 && numFromGuesser!=numFromPlayer2 && numFromGuesser!=numFromPlayer3)
		{
			System.out.println("Game Lost!try again");
		}
	
	   
	}
	
}
public class GuesserGameApp
{
	final static int a=3;
	public static void main(String[] args)
	{
		
		Umpire u=new Umpire();
		int i=1;
		
		u.collectNumFromGuesser();
		while(i<=a)
		{
		u.collectNumFromPlayer();
		u.compare();
		++i;
		}
		
	}
}


