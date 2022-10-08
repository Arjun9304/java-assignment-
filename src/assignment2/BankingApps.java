//Implement a banking system using java.
//Create 3 sub class of Bank : SBI,BOI,ICICI
//All 4 should have following methods:
//getDetails which provide their specific details like rateofinterest etc
//printDetails of every bank.
//Every bank account should have a type (enum): SAVINGS, CURRENT
//Implement a feature to deduct amount from account. Throw InsufficientAmountException if amount being deducted is less than the current balance.
//Every banking transaction should be saved in a file of each bank's transaction log which would have all details of the transaction like (time of transaction,account number,amount withdrawn, amount before deduction, amount after deduction,transaction status (can also be enum), failure reason if any)

package assignment2;

import java.util.Scanner;

public class BankingApps {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		// create initial accounts
		System.out.print("How many number of customers do you want to input? ");
		int n = sc.nextInt();
		Bank C[] = new Bank[n];
		for (int i = 0; i < C.length; i++) {
			C[i] = new Bank();
			C[i].openAccount();
		}
		// loop runs until number 5 is not pressed to exit
		int ch;
		do {
			System.out.println("\n ***Banking System Application***");
			System.out.println(
					"1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				for (int i = 0; i < C.length; i++) {
					C[i].showAccount();
				}
				break;
			case 2:
				System.out.print("Enter account no. you want to search: ");
				String ac_no = sc.next();
				boolean found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(ac_no);
					if (found) {
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exist..!!");
				}
				break;
			case 3:
				System.out.print("Enter Account no. : ");
				ac_no = sc.next();
				found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(ac_no);
					if (found) {
						C[i].deposit();
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exist..!!");
				}
				break;
			case 4:
				System.out.print("Enter Account No : ");
				ac_no = sc.next();
				found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(ac_no);
					if (found) {
						C[i].withdrawal();
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exist..!!");
				}
				break;
			case 5:
				System.out.println("See you soon...");
				break;
			}
		} while (ch != 5);
	}

}