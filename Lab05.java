//class concept
public class FirstSample
{
	public static void main(String[] args)
	{
		System.out.println("We will not use 'Hello, World!'");
	}
}

//Constants
public class Constants
{
	public static void main(String[] args)
	{
		final double CM_PER_INCH = 2.54;
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimter: " + paperWidth*CM_PER_INCH
		  +" by " +paperHeight*CM_PER_INCH);
	}
}

//data types and data transformation
enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE );
public static strictfp void main(String[] args)
double x = 4;
double y = Math.sqrt(x);
System.out.println(y)

import static java.lang.Math.*;
System.out.println("The square root of \u03C0 is "+sqrt(PI));
int n = 123456789;
float f = n; 
int m=7;
int n=7;
int a = 2*++m;
int b = 2*n++;

// relational and boolean operators
x !=0&&1/x>x+y

//bitwise operations
int fourthBitFromRight = (n&0b1000)/0b1000;
int fourthBitFromRight = (n&(1<<3))>>3;

//string operations
String e =""; //empty string
String greeting = "Hello";
String s = greeting.substring(0,3);

String explative = "Expletive";
String PG13 = "deleted";
String message = expletive + PG13;

int age = 13;
String rating = "PG"+age;
System.out.println("message: "+message);
System.out.println("rating: "+rating);

String all = String.join (" / ", "S", "M", "L", "XL");
System.out.println("all is: "+all);

String repeated = "Java".repeat(3); 
//what is repeated?

//Testing String
String greeting = "Hello";
if(greeting == "Hello"){
	System.out.println(" greeting is: Hello");
}

//console input

public class InputTest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("What is you name?");
		String name = in.nextLine();
		
		System.out.print("How old are you?");
		int age = in.nextInt();
		
		//display output on console
		System.out.println("Hello, "+name+" . Next year, you will be "+(age+1));
	}
}

// loop
public class Retirement
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("How much money do you need to retire? ");
		double goal = in.nextDouble();
		
		System.out.print("How much money will you contribute every year? ");
		double payment = in.nextDouble();
		
		System.out.print("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		in years = 0;
		
		while (balance < goal)
		{
			balance +=payment;
			double interestRate = balance*interestRate/100;
			balance +=interst;
			year++;
		}
		System.out.println("you can retire in " + year + " years.");
	}
}

//complex loops
public class LotterOdds
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many numbers do you need to draw? ");
		int k = in.nextInt();
		
		int lotteryOdds = 1;
		for (int i=1; i<=k; i++)
			lotteryOdds = lotteryOdds * (n-i+1)/i;
		System.out.println("Yu odds are 1 in "+lotteryOdds + " . Good luck!");
	}
}
