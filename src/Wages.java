
import java.util.Scanner;	
public class Wages {
	//declare instance variables
	private String name = new String();		
	private double salary;
    private double rate;
    private double netSalary;
    private double allowance;
    private double taxDue;
    private double taxable;	    
    public static void main(String[] args) {
    	// declare and create objects of type Scanner and objects of type of Wage Class to access all instance variables and methods()
    	Scanner sc = new Scanner(System.in);
    	Wages myTax = new Wages();
		System.out.print("Please enter your name: ");
	    myTax.name = sc.next();		
	    
	    System.out.print("\nHi "+ myTax.name +" can you please enter your salary : ");
	    myTax.salary = sc.nextDouble();		    
	    
	    System.out.print("\nThank you " +myTax.name+ " can you now enter the tax rate ie .45 or .24 :");
	    myTax.rate = sc.nextDouble();		    
	    
	    System.out.print("\nFinally " + myTax.name + " please enter your tax free allowance : ");
	    myTax.allowance = sc.nextDouble();	
	    
	    myTax.taxable = myTax.calcTaxable(myTax.salary, myTax.allowance);
	    myTax.taxDue = myTax.calcTaxDue(myTax.taxable, myTax.rate);
	    myTax.netSalary = myTax.calcNetSalary(myTax.salary, myTax.taxDue);	
	    
	    System.out.println("\n\tHere's the bad news " + myTax.name + "\n"+
	            "\tGross Salary = \t" + myTax.salary + "\n" +
	            "\tAllowance = \t" + myTax.allowance + "\n" +
	            "\t\t\t________\n"+
	            "\tTaxable = \t" + myTax.taxable + "\n" +
	            "\tRate = \t\t" + (myTax.rate*100) + "%\n" +
	            "\tTax due = \t" + myTax.taxDue + "\n" +
	            "\tNet Salary = \t" + myTax.netSalary + "\n");
      }
    //method to calculate
    public double calcTaxable(double salary, double allowance){
        return salary - allowance;	    
        }
    public double calcTaxDue(double taxble, double rate){
        return taxble * rate;
    }
    public double calcNetSalary(double salary, double taxDue){
        return salary - taxDue;
    }	    }



