import java.util.Scanner;
public class Task4{
	public static void main(String []  args){
		Scanner sc= new Scanner(System.in);
		String[] currency = {
                  "USD","INR","EUR","GBP","JPY","AUD","CAD","CHF",
                  "CNY","SGD","AED","SAR","ZAR","RUB","KRW"
                 };
         for(int i=0;i<currency.length;i++){
         	System.out.println(i+":"+currency[i]);
         }
         double[] rate = {
                      1.00,   // USD
                      83.00,  // INR
                      0.92,   // EUR
                      0.78,   // GBP
                      147.00, // JPY
                       1.52,   // AUD
                       1.36,   // CAD
                       0.88,   // CHF
                       7.20,   // CNY
                       1.35,   // SGD
                      3.67,   // AED
                      3.75,   // SAR
                      18.80,  // ZAR
                       92.00,  // RUB
                       1320.00 // KRW
             };

		
			System.out.println("enter base currency:");
			int baseCurrency=sc.nextInt();
		
		
			System.out.println("enter target currency:");
			int targetCurrency=sc.nextInt();
		
		    double amount;
	     	System.out.println("enter amount you want to convert");
		    amount=sc.nextDouble();

		
            double amountInUSD = amount / rate[baseCurrency];
            double convertedAmount = amountInUSD * rate[targetCurrency];

            System.out.println("\n--Converted amount--");
            System.out.println(amount+ " "+ currency[baseCurrency]+"="+ convertedAmount+""+currency[targetCurrency]);
	}
}