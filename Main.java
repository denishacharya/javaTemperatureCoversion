import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        char choice  = 'Y';

        while(choice == 'Y'){
            System.out.println("Enter the temperature");
            float temperature = sc.nextFloat();
            System.out.println("Enter the unit of Temperature, 'C' for Celsius or 'F' for Fahrenheit");


            char unit = sc.next().charAt(0);


            if(unit == 'C'|| unit =='c'){
                float convertedTemperature = (temperature*9/5)+32;
                System.out.println(temperature+"c in Fahrenheit is "+ convertedTemperature+"f" );
            }

            else if (unit == 'F' || unit =='f'){
                float convertedTemperature = (temperature-32)*5/9;
                System.out.println(temperature+"f in Celsius is "+ convertedTemperature+"c");
            }

            else{
                System.out.println("Invalid Unit,Try Again with Correct Unit");
            }
            System.out.println("Do you want to Continue? (Enter Y/N; )");
            choice = sc.next().charAt(0);

        }



    }
}


