import java.util.Scanner;
import java.util.Arrays;

public class ConverterApp {

    private double value1;
    private String value1_currency;
    private double value2;
    private String value2_currency;

    String[] currencies = {"GBP", "USD", "YEN"};

    Scanner sc;


    /** CONSTRUCTORS **/
    ConverterApp(){
        System.out.println("\nWelcome to the currency converter! \nCreated by Jason Swift.\n\nLets get started!");
    }

    /** METHODS **/

    // choose currencyt to convert from, and assign to the currency1 variable
    public String chooseCurrencyFrom(String currency1){
        // check whether argument is in currencies

        int i = 0;

        while (!currency1.equalsIgnoreCase(currencies[i])){
            if(i == currencies.length - 1){
                System.out.print("Currency not supported. Try again...\nEnter currency: ");
                Scanner sc = new Scanner(System.in);
                String inp = sc.next();
                return chooseCurrencyFrom(inp);
            }
            i++;
        }
        return currency1;
    }

    public String chooseCurrencyTo(String currency1){
        // check whether argument is in currencies

        int i = 0;

        while (!currency1.equalsIgnoreCase(currencies[i])){
            if(i == currencies.length - 1){
                System.out.print("Currency not supported. Try again...\nEnter currency: ");
                Scanner sc = new Scanner(System.in);
                String inp = sc.next();
                return chooseCurrencyFrom(inp);
            }
            i++;
        }
        return currency1;
    }


    // take the currency value that will converted
    double userInputValue( String currency1, String currency2) {
        sc = new Scanner(System.in);
        System.out.println("What is the amount of " + currency1 + " you would like to convert to " + currency2);
        System.out.print("Enter value of " + currency1 + ": ");
        double val = sc.nextDouble();

        return val;
    }


    double conversion(String cur1, String cur2, double amount){
        double result;
        if(cur1.equalsIgnoreCase("GBP") && cur2.equalsIgnoreCase("USD")){
            result = ConversionLibrary.gbpToUSD(amount);
            return result;
        }
        if(cur1.equalsIgnoreCase("GBP") && cur2.equalsIgnoreCase("YEN")){
            result = ConversionLibrary.gbpToYEN(amount);
            return result;
        }

        // USD conversions
        if(cur1.equalsIgnoreCase("USD") && cur2.equalsIgnoreCase("GBP")){
            result = ConversionLibrary.usdToGBP(amount);
            return result;
        }
        if(cur1.equalsIgnoreCase("USD") && cur2.equalsIgnoreCase("YEN")){
            result = ConversionLibrary.usdToYEN(amount);
            return result;
        }

        // YEN conversions
        if(cur1.equalsIgnoreCase("YEN") && cur2.equalsIgnoreCase("GBP")){
            result = ConversionLibrary.yenToGBP(amount);
            return result;
        }
        if(cur1.equalsIgnoreCase("YEN") && cur2.equalsIgnoreCase("USD")){
            result = ConversionLibrary.yenToUSD(amount);
            return result;
        }

        return 0.0;
    }


    static void resetConverter(){
        RunConverter.metaRun();
    }



    // ACCESSORS
    public double getValue1(){ return this.value1; }
    public double getValue2(){ return this.value2; }
    public String getValue1Currency(){ return this.value1_currency; }
    public String getValue2Currency(){ return this.value2_currency; }

    public void setValue1(double val){ this.value1 = val; }
    public void setValue2(double val){ this.value2 = val;}
    public void setValue1Currency(String val){ this.value1_currency = val; }
    public void setValue2Currency(String val){ this.value2_currency = val;}

}
