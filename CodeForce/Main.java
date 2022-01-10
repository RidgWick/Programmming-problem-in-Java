import java.util.*;


public class Main
{
	public static void main(String[] args) {
	    
		Scanner in = new Scanner(System.in);
		
		String[] string = in.nextLine().split(" ");
		
        long data1 = Long.parseLong(string[0]);
        long data2 = Long.parseLong(string[1]);
        long data3 = Long.parseLong(string[2]);

        long value = ((data1 + data3 - 1) /data3) * ((data2 + data3 - 1) / data3);
	    
	    System.out.println(value);
	}
}
