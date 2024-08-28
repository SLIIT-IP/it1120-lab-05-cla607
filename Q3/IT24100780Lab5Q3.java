import java.util.Scanner;
public class IT24100780Lab5Q3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//Declare 
		int startdate, enddate, numres;
		double tot_cost;
		final int r_charge = 48000;
		final double disc10 = 0.1;
		final double disc20 = 0.2;

		//Inputs
		System.out.print("Enter Start Date (1-31): ");
		startdate = input.nextInt();

		System.out.print("Enter End Date (1-31): ");
		enddate = input.nextInt();

		System.out.println();

		//Validation check
		if(startdate < 1 || startdate > 31 || enddate < 1 || enddate > 31){
		System.out.println("Error: Days must be between 1 and 31");
		return;
		}

		if(startdate > enddate){
		System.out.println("Error: Start Date must be less than End Date");
		return;
		}
				
		numres = enddate - startdate;

		tot_cost = r_charge * numres;

		if(numres >= 3 && numres <= 4){
		tot_cost = tot_cost - (tot_cost * disc10);
		}

		else if(numres >= 5){
		tot_cost = tot_cost - (tot_cost * disc20);
		}

		//Display
		System.out.println("Room Charge Per Day: Rs. 48000.0/=");
		System.out.println("Number of Days Reserved: " + numres);
		System.out.println("Total Amount to be Paid: " + tot_cost);

}
}
