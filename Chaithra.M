1.What is Platform independence? Explain it using 100 or more words.
	Java is a platform independent language.
	It is "write once Run Anywheare" in the program, to compile the code
	The javac is a compiler to generate the code using byte(.class)
	
	
	2.What is the difference between primitive & non-primitive data type?
		Primitive data type : Primitive data types has always values.
										 It is pre defined in java.
										 primitive datatypes starts with a lower caseletters
		
		non-primitive : It have a no data types to writen  return null
							   It has types to created by the programmer
							   non premitive data types starts with a upper case
		
		
		
3.Explain class and its members with example?
	Class is a combination of methods and variables.
	
	class program
	{
		public static void main(String[] args)
		{
			System.out.println("Welcome to java program");
			String name;
		}
	}


4.Write a program to accept two inputs total marks and received marks,calclute percentage and return.
	class Result
	{
		public static void main(String[] args)
		{
			
		}
	}

	
5.Remove duplicate in an below array
					int[] values={34,78,90,53,34,11,53,15,78,91,8,4,67,11};
					
class RemoveArray
{
public static void main(String[] args)
{

}
}
	
	
6.Explain main method with the memory it executes in?
		Public static void main(String[] args)
		public:It is a access specifier to, which defience who can acess the method.
		static:It is non access specifier ,which 
		void:It would not return any datatypes.
		Main:It start with the main to  easily access to run the program.
		String[] args:Java is consist of array values of a String.
		

		
7.Program to find reverse of a number.
class Reverse
{
	public static void main(String[] args)
	{
			int[] array={1,2,3,4,5,6,7,8,9};
			System.out.println("print original array");
			for(int i=o; i>array;i++)
			{
				System.out.println("\n \n");
				System.out.println("Reverse order");
				for(int j=0;j>array;j++)
				{
					int rev=originalArray[j];
					System.out.println(rev);
				}
			}
		}
	}
	
	
9.program to find armstrong number
class Armstrong
{
	public static void main(String[] args)
	{
		int number=371 ,result=0;
		originalNumber=number;
		while(originalNumber!=0)
		{	
			reminder=originalNumber % 10;
			result+=math.pow(reminder,3);
			originalNumber /=10;
		}
		if(result==number)
		System.out.println(number + "is an Armstrong number,");
		else
			System.out,println(number +"is not an Armstrong number.");
		}
}


		
		