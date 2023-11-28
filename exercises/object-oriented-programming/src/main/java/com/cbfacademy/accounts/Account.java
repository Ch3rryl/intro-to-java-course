package com.cbfacademy.accounts;

public class Account {
    // class fields
    public int accountNumber;
    public double balance; 

    // constructor 
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber; 
        this.balance = balance; 
    }
    //methods
    public double getBalance() {
        return this.balance;

    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
// - `public double deposit(double amount)` - deposits funds to the account and returns the new balance

public double deposit(double amount) {
    this.balance += amount;
    return this.balance;
}
// - `public double withdraw(double requested)` - withdraws funds from the account and returns the requested amount or `0` if the account has an insufficient balance

public double withdraw(double requested) {
    if(requested > balance) {
        return 0;
    } else {
        
        this.balance -= requested;
        return this.balance; 

} } }
 
    



// Inheritance

// ### Part 1

// Inside the `accounts` package, create a class called `Account` with the following members:
// - `public Account(int accountNumber, double balance)` - constructor that accepts parameters representing the new account number and starting balance
// - `public double getBalance()` - returns the current account balance
// - `public int getAccountNumber()` - returns the account number
// - `public double deposit(double amount)` - deposits funds to the account and returns the new balance
// - `public double withdraw(double requested)` - withdraws funds from the account and returns the requested amount or `0` if the account has an insufficient balance

// #### Notes
// - This account doesn't have an overdraft facility.
// - The balance of an account may only be modified through the `deposit()` and `withdraw()` methods.
// - Consider the necessary instance variables and the appropriate access modifiers to allow any sub-classes to access those values
