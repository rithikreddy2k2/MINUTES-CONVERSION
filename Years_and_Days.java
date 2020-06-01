import java.util.*;
public class Years_and_Days {
    public static void main(String[] args) {
        int n,y,d,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number of minutes");
        n=sc.nextInt();

        y=n/(60*24*365);/* we divide the no. of minutes with 60 first , which gives us the no. of hours
        and then we divide by 24 to know the number of days and then further by 360 to know the number
        of years */

        r=n%(60*24*365);//this gives us the no. of minutes remained...which is to be converted into days...
        
        d=r/(60*24);/*now when we divide the remaining minutes with 60 we get hours and then with 24 gives
        u the respective days ...*/

        System.out.println(n+" minutes is equal to "+y+" years and "+d+" days");

    }
}
