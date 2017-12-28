import java.awt.*;
import java.util.*;
public class GCD {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter positive integer a:     ");
		int a = s.nextInt();
		System.out.println("Enter positive integer b < a: ");
		int b = s.nextInt();
		s.close();
		int dividend = a;
		int divisor = b;
		//System.out.println("GCD ("+dividend+","+dividend+")");
		while(divisor!=0){
			int remainder = dividend%divisor;
			dividend = divisor;
			divisor = remainder;
			//if(divisor == 0){
				//System.out.print("=GCD ("+dividend+",0)\n="+Math.abs(dividend));
			//}
			//else{
				//System.out.println("=GCD ("+dividend+","+divisor+")");
			//}
			if(divisor == 0){
				break;
			}
		}
		System.out.println("Greatest common divisor (GCD) = "+dividend);
		
		
	}
}
