import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("How old are you ? ");

			int age = sc.nextInt();

			int reward = 0;

			if (age <= 10) {
				reward = 50;
			} else if (age <= 18) {

				reward = 100;

			} else if (age <= 30) {

				reward = 200;

			} else {
				reward = 4000;
			}

			System.out.println("Your Reward Is: " + reward);
		}
	}

}
