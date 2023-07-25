package gfg;
import java.util.*;
public class CountDigit {
      static int countdigit(int num) {
    	  int res = 0;
    	  while(num>0) {
    		  num = num/10;
    		  res++;
    	  }
    	  return res;
      }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for palin: ");
        int num = sc.nextInt();
        System.out.println("number of digits are : "+CountDigit.countdigit(num));
	}

}
