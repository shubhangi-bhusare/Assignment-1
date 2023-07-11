package com.test;

public class BankAccount {
	  private String customerName;
	    private double balance;

	    public BankAccount(String customerName, double balance) {
	        this.customerName = customerName;
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void transfer(double amount, BankAccount recipient) {
	        if (amount <= balance) {
	            balance -= amount;
	            recipient.deposit(amount);
	        } else {
	            System.out.println("Insufficient balance.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void calculateInterest(double interestRate, int months) {
	        double interest = balance * interestRate / 100 * months;
	        balance += interest;
	    }

	    public static void main(String[] args) {
	        // Creating Amar's account
	        BankAccount amarAccount = new BankAccount("Amar", 25000);

	        // Depositing amount
	        amarAccount.deposit(15000);

	        // Transferring amount to Surya
	        BankAccount suryaAccount = new BankAccount("Surya", 0);
	        amarAccount.transfer(11000, suryaAccount);

	        // Printing Amar's current balance
	        System.out.println("Amar's current balance: " + amarAccount.getBalance());

	        // Calculating interest on Amar's balance
	        double interestRate = 2.0;
	        int months = 12;
	        amarAccount.calculateInterest(interestRate, months);

	        // Printing Amar's updated balance
	        System.out.println("Amar's updated balance with interest: " + amarAccount.getBalance());
	    }
	}