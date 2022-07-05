import java.util.Scanner;

public class Main {

	public static void start(String[] args) {
		// TODO Auto-generated method stub
		Arrays j = new Arrays();
		Scanner scanner = new Scanner(System.in);
		
		
		for(int i=0; i<5; i++) {
			if(j.animals[i] != null) {
				//do nothing
			} else {
				System.out.println("Please enter an animal: ");
				j.animals[i] = scanner.next();
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(j.animals[i]);
		}
		scanner.close();
				
	}
		
	public static void changeIt(String[] args) {
		Arrays j = new Arrays();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the index of the animal array you wish to change: ");
		int x = (scanner.nextInt()) - 1;
		System.out.println("Enter the new animal: ");
		String y = scanner.next();
		j.animals[x] = y;
		scanner.close();
	}
	
}C:\Users\Local user\git\Java-Examples\.git

	

