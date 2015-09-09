// coverts degrees celsius to degrees fahrenheit
//9/8/15
//Lu Peng

import java.util.Scanner;

public class CelsiustoFahrenheit{
    public static void main(String args[]){
        double f;
        double c;
        
        Scanner in =new Scanner(System.in);
        
        System.out.println ("Enter degrees in fahrenheit");
        f= in.nextDouble();
        c= (5.0/9)*(f-32);
        System.out.println ("The corresponding degrees celsius equals " + c);
    }
}