
import java.util.Scanner;

public class BasicQuestions {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		while(true) {
			System.out.println("Enter the amount you've got in your bank account , or 'x' to exit");
			String str =  s.nextLine();
			if(str.equals("x"))
				break;
			int money = 0;
			try {
				money = Integer.parseInt(str);
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("Enter another value please");
				continue;
			}
			if(money < 1000)
				System.out.println("You're broke boo!");
			else if(money >= 1000 && money <= 100000)
				System.out.println("Ohhh hello ;)");		
		}
	}
}