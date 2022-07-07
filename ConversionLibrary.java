public class ConversionLibrary {
/** A CLASS THAT HOLDS ALL CONVERSION ARITHEMATIC BETWEEN ALL CURRENCIES IN CURRENCIES ARRAY **/

    // FINAL EXCHANGE RATES
    static final double GBP_TO_USD = 1.19;
    static final double GBP_TO_YEN = 163.6;
    static final double USD_TO_GBP = 0.84;
    static final double USD_TO_YEN = 136.0;

    static final double YEN_TO_GBP = 0.0061;
    static final double YEN_TO_USD = 0.0074;

    static double gbpToUSD(double gbp_value){
        return gbp_value * GBP_TO_USD;
    }
    static double gbpToYEN(double gbp_value){
        return gbp_value * GBP_TO_YEN;
    }

    static double usdToGBP(double usd_value){
        return usd_value * USD_TO_GBP;
    }
    static double usdToYEN(double usd_value){
        return usd_value * USD_TO_YEN;
    }

    static double yenToGBP(double yen_value){
        return yen_value * YEN_TO_GBP;
    }
    static double yenToUSD(double yen_value){
        return yen_value * YEN_TO_USD;
    }


}
