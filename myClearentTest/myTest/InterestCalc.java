package myTest;

import java.text.NumberFormat;

public class InterestCalc {
	public static void main(String[] args) {
		int VisaBalance = 100;
		int MCBalance = 100;
		int DiscBalance = 100;
				
		double VisaIntRate = .1;
		double MCIntRate = .05;
		double DiscIntRate = .01;
		double Total_Int = 0;
		
		double VisaIntAmt = CalculateInterest(VisaBalance, VisaIntRate);
		Total_Int = AddToWallet (Total_Int, VisaIntAmt);
		
		double MCIntAmt = CalculateInterest(MCBalance, MCIntRate);
		Total_Int = AddToWallet (Total_Int, MCIntAmt);

		double DiscIntAmt = CalculateInterest(DiscBalance, DiscIntRate);
		Total_Int = AddToWallet (Total_Int, DiscIntAmt);
		
		NumberFormat VisaFormatter = NumberFormat.getCurrencyInstance();
		System.out.println("Your wallets VISA card interest is: " + VisaFormatter.format(VisaIntAmt));
		
		NumberFormat MastercardFormatter = NumberFormat.getCurrencyInstance();
		System.out.println("Your wallets Mastercard card interest is: " + MastercardFormatter.format(MCIntAmt));
				
		NumberFormat DiscoverFormatter = NumberFormat.getCurrencyInstance();
		System.out.println("Your wallets Discover card interest is: " + DiscoverFormatter.format(DiscIntAmt));
		
		NumberFormat WalletFormatter = NumberFormat.getCurrencyInstance();
		System.out.println("Your entire wallets interest is: " + WalletFormatter.format(Total_Int));
	
	}
	
	public static double CalculateInterest(int balance, double rate) {
				
		double IntAmt = balance * rate;
		return IntAmt;
	}

	public static double AddToWallet(double walletbal, double newamt) {
				
		double TotalWalletAmt = walletbal + newamt;
		return TotalWalletAmt;
	}
	
}

