import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	//System.out.println("Please enter two integer");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	int sum = num1 + num2 ;
	if((sum) >= 1000000000 ) {
		System.out.println("Overflow");
	}else {
		System.out.println("Sum of the numbers: " + (num1+num2));
	}



  }
}