import java.util.*;

class ProcessAName5026211153{
	public static void main(String[] args){

		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Type your name: ");
		String input = scan.nextLine();
		int index = input.indexOf(' ');
		String result1 = input.substring(index + 1);
		String result2 = input.substring(0,1);
		

		System.out.println("Your name is: "+result1+", "+result2+".");
	}
}