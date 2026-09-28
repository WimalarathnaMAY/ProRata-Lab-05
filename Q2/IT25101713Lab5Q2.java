import java.util.Scanner;
public class IT25101713Lab5Q2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
			int number;
			
			System.out.print("Enter the number of new members introduced");
			number=input.nextInt();
			
			if(number<0){
				System.out.println("Input must be a number 0 or greater");
				return;
			}
			
			switch(number){
				case 0:
				System.out.print("no Prize");
				break;
			
			
				case 1:
				System.out.print("prize is a : pen");
				break;
			
			
		
				case 2:
				System.out.print("prize is a : Umbrella");
				break;
			
			
			
				case 3:
				System.out.print("prize is a : Bag");
				break;
			
			
			
				case 4:
				System.out.print("prize is a : Travelling chair");
				break ;
			
			
			default :
				System.out.print("prize is a : Headphone");
			}
	}
}
			
			
			
	

