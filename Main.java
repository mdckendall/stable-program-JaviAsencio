import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    //Ask the user here
	  Stable s = new Stable();
		System.out.println("What is the address of the stable?");
		Scanner scanner = new Scanner(System.in);
		s.address = scanner.nextLine();
		do {
			System.out.println("Do you wish to add a horse to the stable?"); 
			char input = scanner.next().charAt(0);
			scanner.nextLine();
			if(input == 'y'){
				Horse h;
				System.out.println("What is the name of the horse?");
				String hn = scanner.nextLine();
				System.out.println("What is the weight of the horse?");
				double w = scanner.nextDouble();
				System.out.println("Enter true if the horse is tame or false if it is not.");
				boolean t = scanner.nextBoolean();
				h = new Horse(hn, w, t);
        // New Array list for the horse.
        s.Horse.add(h);
			} //testing goodest 4
			else{
				break;
			}
		}while(true);

    // Display the information that was typed in by the user and put it on a new line.
    // Start "i" at zero and then add zero with one so it starts on number one and counts up from there.
    for(int i = 0; i < s.Horse.size(); i++) {
      System.out.print("Horse #" + (i + 1) + " Name: " + s.Horse.get(i).getName() + " Weight: " + s.Horse.get(i).getDouble() + " Tame: " + s.Horse.get(i).getTame() + "\n");
    }

    // Close the scanner.
    scanner.close();
	  }
  }