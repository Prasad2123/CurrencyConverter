package myPack;

public class Converter{

public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        double usdToInrRate = 83.36;
        double eurToInrRate = 90.15;
        double gbpToInrRate = 105.19;

        double usdToEurRate = 0.92;
        double usdToGbpRate = 0.79;
        
        double eurToUsdRate = 1.08;
        double eurToGbpRate = 0.86;

        double gbpToUsdRate = 1.26;
        double gbpToEurRate = 1.17;


        // Perform currency conversion based on the selected currency pair
        if (fromCurrency.equals("USD")) {
            if (toCurrency.equals("INR")) {
                return amount * usdToInrRate;
            } else if (toCurrency.equals("EUR")) {
                return amount * (usdToEurRate);
            } else if (toCurrency.equals("GBP")) {
                return amount * (usdToGbpRate);
            }
        } else if (fromCurrency.equals("EUR")) {
            if (toCurrency.equals("INR")) {
                return amount * eurToInrRate;
            } else if (toCurrency.equals("USD")) {
                return amount * (eurToUsdRate);
            } else if (toCurrency.equals("GBP")) {
                return amount * (eurToGbpRate);
            }
        } else if (fromCurrency.equals("GBP")) {
            if (toCurrency.equals("INR")) {
                return amount * gbpToInrRate;
            } else if (toCurrency.equals("USD")) {
                return amount * (gbpToUsdRate);
            } else if (toCurrency.equals("EUR")) {
                return amount * (gbpToEurRate);
            }
        } else if (fromCurrency.equals("INR")) {
            if (toCurrency.equals("USD")) {
                return amount / usdToInrRate;
            } else if (toCurrency.equals("EUR")) {
                return amount / eurToInrRate;
            } else if (toCurrency.equals("GBP")) {
                return amount / gbpToInrRate;
            }
        }

        return amount; // Default: return the original amount if conversion not supported
    }
}