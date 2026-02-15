package day5;

public class testprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Input 1	
String s="Hello world";
String [] arr = s.split(" ");
String one = arr[arr.length - 1];
int length = one.length(); 
System.out.println("The last word is World "+ "and the length is " + length );

//Input 2
String second ="fly me to the moon";
String[] ar =second.split(" ");
String twice =ar[ar.length-1];
int len =twice.length();
System.out.println("The last word is moon "+ "and the length is "+len);

//Input 3
String thirdinput="luffy is still joyboy";
String[] arrr =thirdinput.split(" ");
String thrice =arrr[arrr.length-1];
int length3 =thrice.length();
System.out.println("The last word is joyboy"+ "and the length is "+ length3 );


	}


}
