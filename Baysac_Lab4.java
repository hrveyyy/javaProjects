import java.util.Scanner;

public class Baysac_Lab4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String[] students = {"Alice", "Bob", "Charlie"};
		String[] subjects = {"DCIT23", "ITEC50", "GNED01", "GNED03"};
    	int[][] grades = {
            	{85, 90, 78, 88},  // Alice
            	{76, 80, 85, 90},  // Bob
            	{92, 89, 91, 95}   // Charlie
        	};
    	int studIndex = 0;
    	double average = 0;
    	boolean found = false;
		
    	System.out.print("Enter student name: ");
    	String name = scanner.nextLine();

    	for(int i=0; i< students.length; i++) {
    		if(name.equalsIgnoreCase(students[i])) {
    			studIndex = i;
    			found = true;
    			System.out.printf("\n%s's REPORT CARD\n",students[studIndex]);
        		System.out.println("=========================");
    		}
    	}
    	
    	if(found) {
    		for(int j=0; j< subjects.length; j++) {
    			System.out.printf("%s - %d\n",subjects[j], grades[studIndex][j]);
    			
    			average += grades[studIndex][j];
    		}
    		average /= grades[studIndex].length; 
    		System.out.println("=========================");
    		System.out.printf("AVERAGE : %.2f\n",average);
    		System.out.println("=========================");
    	}
    	else {
    		System.out.println("\nStudent Not Found!!");
    	}

    	scanner.close();
	}

}
