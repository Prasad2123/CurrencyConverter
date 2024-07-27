import java.util.Scanner;
import myPack.Converter;

 class Main extends Exception{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\t\t**** Welcome to Currency Converter! ****");
        String s1 = "Yes";
        while(s1.equals("Yes") || s1.equals("yes")){
            
            try{
            System.out.print("\n\n\tEnter the amount to convert: ");
            double amount = scanner.nextDouble();
    		
	
            System.out.print("\tEnter the currency to convert from (USD, EUR, GBP, INR): ");
            String fromCurrency = scanner.next();
    
            System.out.print("\tEnter the currency to convert to (USD, EUR, GBP, INR): ");
            String toCurrency = scanner.next();
    
            
    
            if (isValidCurrency(fromCurrency) && isValidCurrency(toCurrency)) {
                double convertedAmount = Converter.convertCurrency(amount, fromCurrency, toCurrency);
                System.out.println("\n\n\t\tConverted Amount: " + convertedAmount + " " + toCurrency);
            } else {
                throw new Exception();
            }
            
            System.out.print("\n\n\tDo you want to continue(Yes/No):");
            s1 = scanner.next();
            }
         catch (Exception e) {
            System.out.println("\tInvalid input. Please enter a valid Currency.");
                
        }
        }
	System.out.println("\n\n\t Program Completed Successfully");
    }

    
    private static boolean isValidCurrency(String currency) {
        return currency.equals("INR") || currency.equals("USD") || currency.equals("GBP") || currency.equals("EUR");
    }
    
}