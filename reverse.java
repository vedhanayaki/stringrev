package hunter;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the Sentences is:");
Scanner s=new Scanner(System.in);
String a=s.next();
StringBuffer b=new StringBuffer(a).reverse();
System.out.println(b);
	}

}
