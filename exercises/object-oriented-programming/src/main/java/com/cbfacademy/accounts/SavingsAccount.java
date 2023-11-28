package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    private double interestRate; 

    // savings account class + inherit from Account class
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
    super(accountNumber, balance); 
    this.interestRate = interestRate; 
} 


//method
public void applyInterest() {
    balance += balance * interestRate;
       
}
   

public double getInterestRate() {
    return interestRate;
}

public void setInterestRate(double newIntRate) {
    if(newIntRate > 0) {
    
    interestRate = newIntRate; 
    } else {
         System.out.println("No interest on your balance, unfortunately"); 
    }

}

}



// ### Part 2

// Using the `Account` class as a base class, create two derived classes:

// `SavingsAccount` with the following members, in addition to the attributes of the `Account` class:
// - `public SavingsAccount(int accountNumber, double balance, double interestRate)` - constructor that accepts parameters representing the new account number, starting balance and interest rate
// - `public void applyInterest()` applies interest to the account
// - `public double getInterestRate()` - returns the current interest rate
// - `public void setInterestRate()` - sets the interest rate

// `CurrentAccount` with the following members, in addition to the attributes of the `Account` class:
// - `public CurrentAccount(int accountNumber, double balance, double overdraftLimit)` - constructor that accepts parameters representing the new account number, starting balance and overdraft limit
// - `public double getOverdraftLimit()` - returns the current overdraft limit
// - `public void setOverdraftLimit()` - sets the overdraft limit

// #### Notes
// Ensure that you have overridden methods of the `Account` class where necessary in the derived classes.
