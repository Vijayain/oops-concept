package Assignment1st_interface;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how much you can spend sir");
		double money=sc.nextDouble();
		if (money>100 && money< 200) {
			goingToDestination a = new lowCostGoing();
			a.going();
		}
		if (money>200 && money < 300) {
			goingToDestination b=new mediumCostGoing();
			b.going();
		}
		if (money>300) {
			goingToDestination c= new highCostGoing();
			c.going();
		}
	}

}
