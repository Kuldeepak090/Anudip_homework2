package anudip_homework2;
import java.util.Scanner;

public class TwinsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


		        for (int i = 2; i < 100; i++) {

		            if (is_Prime(i) && is_Prime(i + 2)) {
		                System.out.printf("(%d, %d)\n", i, i + 2);
		            }
		        }
		    }

		    public static boolean is_Prime(long n) {

		        if (n < 2) return false;

		        for (int i = 2; i <= n / 2; i++) {

		            if (n % i == 0) return false;
		        }
		        return true;
		    }
}
