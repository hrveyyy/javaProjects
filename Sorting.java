import java.util.InputMismatchException;
import java.util.Scanner;

public class Sorting {

	public static Scanner sc = new Scanner(System.in);
	public static int arrSize;
	public static int[] arrayInt;
	public static String[] arrayString;
		    
	public static void main(String[] args) {
		System.out.println("Laboratory #2 - Method Overloading");
		
		while(true){
			try {
				while(true) {
					System.out.print("\nEnter array length: ");
					arrSize = sc.nextInt();
					
					
					if(arrSize > 10) {
						sc.nextLine();
						System.out.print("Are You Sure About That?! [n=no, (y)=yes]: ");
						String sure = sc.nextLine().toLowerCase();
						
						if(sure.contains("y")) {
							System.out.println("Wow, That's a lot.");
							break;
						}else if(sure.contains("n")){
							System.out.println("Okay change it.");	
							continue;
						}
						else {
							System.out.println("ERROR: Please Input an Expected Input.\n");
							//continue;
							System.out.print("Are You Sure About That?! [n=no, (y)=yes]: ");
							sure = sc.nextLine().toLowerCase();
						}
					}
					break;
				}
				break;
				
			}catch(InputMismatchException e) {
				System.out.println("ERROR: Please Input an Expected Type.");
				sc.nextLine();
			}	
		}

		while(true){
			System.out.print("\nEnter (1) for Integer and (2) for String inputs: ");
			String choice = sc.nextLine();
		
			        
			if(choice.equalsIgnoreCase("1")){
				sortArray(arrayInt());
				break;
			}else if(choice.equalsIgnoreCase("2")){
			    sortArray(arrayString());
			    break;
			}else{
			    System.out.println("ERROR: Please Input an Expected Input.");
			}
		}
		
		
	}
		    
	public static String[] arrayString(){
		String[] array = new String[arrSize];
		for(int i=0; i<array.length; i++){
			System.out.print("Enter Item ["+(i+1)+"]: ");
			array[i] = sc.nextLine();
		}
		return array;
	}
	public static int[] arrayInt(){
		int[] array = new int[arrSize];
		for(int i=0; i<arrSize; i++){
			boolean valid = false;
			while(!valid) {
				try{
					System.out.print("Enter Item ["+(i+1)+"]: ");
					array[i] = sc.nextInt();
					valid = true;
				}catch(InputMismatchException e){
					System.out.println("ERROR: Please Input an Expected Type.");
					sc.nextLine();
				}
			}
		}
		return array;
	}
	public static void sortArray(int array[]){
		
		for(int i=0; i<array.length; i++) {
			int min =i;
			int temp= array[i];
			
			for(int j=i; j<array.length; j++) {
				if(array[min]>array[j]) {
					min=j;
				}
			}
			array[i]=array[min];
			array[min]=temp;
		}
		
		
		for(int x : array){
			System.out.println(x);  
		}
	}
	public static void sortArray(String array[]){
		
		for(int i=0; i<array.length; i++) {
			int min =i;
			String temp= array[i];
			for(int j=i; j<array.length; j++) {
				if(array[min].compareToIgnoreCase(array[j])>0) {
					min=j;
				}
			}
			array[i]=array[min];
			array[min]=temp;
		}
		for(String x : array){
			System.out.println(x);  
		}
		
	}	
	
}	

