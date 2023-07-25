package gfg;
import java.util.*;
class GFG{
       int isDigitSumPalindrome(int N) {
	     int temp = N;
	     int sum =0;
	     while(temp!=0){
	         int rem = temp%10;
	         sum = sum+rem;
	         temp = temp/10;
	     }
	     if(isPalin(sum) == 1)
	     return 1;
	     else 
	     return 0;
	    }
        public int isPalin(int num){
	        int temp = num;
	        int rev = 0;
	        while(temp!=0){
	            int rem = temp%10;
	            rev = rev*10+rem;
	            temp = temp/10;
	        }
	        if(rev == num)
	        return 1;
	        else
	        return 0;
	    }
}
public class Palindrome {

		   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GFG g1 = new GFG();
		System.out.println("Enter number for palin: ");
		int x = sc.nextInt();
		int y = g1.isDigitSumPalindrome(56);
		System.out.println(y);
    
	}

}
