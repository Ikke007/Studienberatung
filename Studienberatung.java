import java.util.Scanner;

public class Studienberatung{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String input = scanner.next();
		if(input.equalsIgnoreCase("n")){
			System.out.println("Hast du Fachabitur?");
		}
		else{
			
		}
	}
}