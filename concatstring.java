import java.util.*;
public class concatstring {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Inmate's name:");
	String name=sc.nextLine();
	System.out.print("Inmate's father's name:");
	String fname=sc.nextLine();
name=name.concat("").concat(fname);
System.out.println(name.toUpperCase());	
}
}
