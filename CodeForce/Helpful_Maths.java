// # 339A. Helpful Maths
// Author - Md Rifat 
// Use it just for modify your algorithm 
// do not use it for another purpouse.




import java.util.*;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String final_result ="";
        String[] array = string.split("[+]");
        int count=0;
        Arrays.sort(array);
        for(String i : array)
        {   count++;
            if(count > 1){
                final_result+= "+";
            }
            final_result+=i;
        }
        System.out.println(final_result);

        sc.close();
    }
}