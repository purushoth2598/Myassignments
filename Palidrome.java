package Day2;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int K = 121;   // number to check
        int number = K, rev = 0;

        while (K > 0) {
            rev = rev * 10 + (K % 10);
            K = K / 10;
        }

        if (number == rev) {
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not a Palindrome Number");
        }


	}

}
