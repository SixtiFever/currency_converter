import java.util.Arrays;
import java.util.Scanner;

public class RunConverter {
    public static void main(String[] args){

        RunConverter.metaRun();


    } // end of main method

    static void metaRun(){
        ConverterApp converter = new ConverterApp();
        Scanner sc = new Scanner(System.in);


        // choosing currencies
        String c1; // from currency
        String c2; // to currency

        // from currency
        System.out.println("What currency do you want to convert from?");
        System.out.println("Choices: " + Arrays.toString(converter.currencies));
        System.out.print("Enter: ");
        c1 = sc.next();

        // from currency
        String currency1 = converter.chooseCurrencyFrom(c1); // from currency
        System.out.println("You are converting from " + currency1); // from currency
        System.out.println(); // from currency

        // to currency
        System.out.println("What currency do you want to convert to?");
        System.out.println("Choices: " + Arrays.toString(converter.currencies)); // show currencies supported
        System.out.print("Enter: ");
        c2 = sc.next(); // take input
        String currency2 = converter.chooseCurrencyTo(c2); // check currency is supported, store in variable
        System.out.println("You are converting from " + currency2); // from currency
        System.out.println(); // from currency

        System.out.println();
        System.out.println("You have chosen to convert from " + currency1 + " to " + currency2);

        double amount_to_convert = converter.userInputValue(currency1, currency2);
        double value_after_conversion = converter.conversion(currency1, currency2, amount_to_convert);

        System.out.println("You converted (" + currency1 + ") " + amount_to_convert + " to " + currency2 + "." +
                "\nThe output is (" + currency2 + ") "+ value_after_conversion);
        System.out.println();

        System.out.println("Reset currency converter?\n Y or N");
        String ans = sc.next();
        if(ans.equalsIgnoreCase("y")){
            ConverterApp.resetConverter();
        }
    }

} // end of class
