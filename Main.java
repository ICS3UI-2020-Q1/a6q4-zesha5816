import java.util.Scanner;
/**
 * a program that will take in two 3D vectors and compute their dot product.

 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
		//create a scanner 
		Scanner input = new Scanner(System.in);
		//output the message to the user 
		System.out.println("Please enter the 3 values for the first vector");
		int [] firstVector = new int[3];
		//loops the code 3 times
		for(int i = 0; i < 3; i++){
			//loops code to get the value 3 times
			firstVector[i] = input.nextInt();
		}    
		System.out.println("Please enter the 3 values for the second vector");
		int [] SecondVector = new int[3];
		//loops the code 3 times
		for(int i = 0; i < 3; i++){
			//loops code to get the value 3 times
			SecondVector[i] = input.nextInt();
		}   
		int dotProduct;
		int total = 0;
		for(int i = 0; i < firstVector.length ; i++){
			dotProduct = firstVector[i] * SecondVector[i];
			total += dotProduct;
		}
		
		System.out.println("The dot product is " + total);

  }
}
