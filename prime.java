package Day2;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int Y = 8;   // number to check
	        int count = 0;

	        for (int i = 1; i <= Y; i++) {
	            if (Y % i == 0) {
	                count++;
	            }
	        }

	        if (count == 2) {
	         System.out.println("Prime Number");
	        }else {
	            System.out.println("Not a Prime Number");
	        }
		 
	}

}
