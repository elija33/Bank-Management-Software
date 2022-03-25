package BankManagementSoftware;

import java.util.Scanner;
import java.util.Random;


public class BankSoftware {
	
	//This filed is the users log in information
	private String name;
	private long accountnumber;
	private long accountroutingnumber;
	
	//This is filed is the users bank 
	private int accountWithdraw;
	private double accountBalance;
	private int accountDeposit;
	private int checkBalance;
	
	//Constructor for users log in information
	public BankSoftware(String name, long accountroutingnumber, long accountnumber) {
		this.name = name;
		this.accountnumber = accountnumber;
		this.accountroutingnumber = accountroutingnumber;
	}
	
	//Constructor for user bank
	public BankSoftware(int accountWithdraw, double accountBalance, int accountDeposit, int checkBalance) {
		super();
		accountWithdraw = accountWithdraw;
		accountBalance = accountBalance;
		accountDeposit = accountDeposit;
		this.checkBalance = checkBalance;
	}
	
	/**
	 * @return the name
	 */
	public String name() {
		return name;
	}
	
	/**
	 * @param user enter their name
	 */
	public void setName(String name) {
		Scanner user_input = new Scanner(System.in);
		String full_name;
		System.out.print("Enter you Full name: ");
		full_name =  user_input.next();
	}
	
	/**
	 * @return the accountnumber
	 */
	public long getaccountnumber() {
		return accountnumber;
	}
	
	/**
	 * @param generating a random number as user account number
	 */
	public void setaccountnumber() {
		Random accountnumer = new Random();
		int upperbond = 9; // set if the number is more than 8
		int account = accountnumer.nextInt(upperbond);	
		System.out.println("Enter your account number is: " + account);
	}
	
	/**
	 * @return account
	 */
	public long getaccountroutingnumber() {
		return accountroutingnumber;
	}
	
	/**
	 * @param generating a random number as user account number
	 */
	public void setaccountroutingnumber() {
		Random accountroutingnumber = new Random();
		int upper = 9; // set if the number is more than 8
		int routing = accountroutingnumber.nextInt(upper);	
		System.out.println("Your routing number is: " + routing);
	}

	/**
	 * @return the accountWithdraw
	 */
	public int getAccountWithdraw() {
		return accountWithdraw;
	}

	/**
	 * @param accountWithdraw the accountWithdraw to set
	 */
	public void setAccountWithdraw(int accountWithdraw) {
		int currentbalance = (int) accountBalance;
		Scanner withding = new Scanner(System.in);
		System.out.println("Enter amout :");
		int accountwithding = withding.nextInt();
		if(currentbalance == 0) {
			System.out.println("There is no sufficient Amount");
		}
		else if(currentbalance > accountwithding){
			System.out.println("You do not have enough money in your account");
		}
		else if(currentbalance <= accountwithding) {
			System.out.println("You can take your money");
			System.out.println("Do not forget your card" );
		}
	}

	/**
	 * @return the accountBalance
	 */
	public double getAccountBalance() {
		return accountBalance;
	}

	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(int accountBalance) {
		accountBalance = accountBalance;
	}

	/**
	 * @return the accountDeposit
	 */
	public int getAccountDeposit() {
		return accountDeposit;
	}

	/**
	 * @param accountDeposit the accountDeposit to set
	 */
	public void setAccountDeposit(int accountDeposit) {
		accountDeposit = accountDeposit;
	}

	/**
	 * @return the checkBalance
	 */
	public int getCheckBalance() {
		return checkBalance;
	}

	/**
	 * @param checkBalance the checkBalance to set
	 */
	public void setCheckBalance() {
		System.out.println("Your Current Balance is: " + checkBalance);
	}
	
}
