import java.util.*;
import java.lang.Math;
public class HealthyHearts {

    static String userAge; 
    static float userAgeNumber;
    
    public static void main(String[] args){

        System.out.println("Let's calculate your heart health.");
        Scanner myScanner = new Scanner(System.in);
        // get input from the user round 
        System.out.println("What is your age?");
        userAge = myScanner.nextLine();
        userAgeNumber = Float.parseFloat(userAge); 
        float HRmax = 220 - userAgeNumber;
        float targetHR50 = HRmax / 2;
        float targetHR85 = (HRmax * 85)/100;
        System.out.println("Your maximum heart rate should be " + Math.round(HRmax)  + " beats per minute");
        System.out.println("Your target HR Zone is " + Math.round(targetHR50) + " - " + Math.round(targetHR85)+ " beats per minute");
    }
}
