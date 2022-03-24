package BankManagementSoftware;

import java.util.Scanner;
import java.util.Random;


public class BankSoftware {
	
	//This filed is the users log in information
	private String name;
	private long accountnumber;
	private long accountroutingnumber;
	
	//This is filed is the users bank 
	private int AccountWithdraw;
	private double AccountBalance;
	private int AccountDeposit;
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
		AccountWithdraw = accountWithdraw;
		AccountBalance = accountBalance;
		AccountDeposit = accountDeposit;
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
	}

	/**
	 * @return the accountWithdraw
	 */
	public int getAccountWithdraw() {
		return AccountWithdraw;
	}

	/**
	 * @param accountWithdraw the accountWithdraw to set
	 */
	public void setAccountWithdraw(int accountWithdraw) {
		AccountWithdraw = accountWithdraw;
	}

	/**
	 * @return the accountBalance
	 */
	public double getAccountBalance() {
		return AccountBalance;
	}

	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(int accountBalance) {
		AccountBalance = accountBalance;
	}

	/**
	 * @return the accountDeposit
	 */
	public int getAccountDeposit() {
		return AccountDeposit;
	}

	/**
	 * @param accountDeposit the accountDeposit to set
	 */
	public void setAccountDeposit(int accountDeposit) {
		AccountDeposit = accountDeposit;
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
