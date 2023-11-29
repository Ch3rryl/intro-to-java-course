package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    private double overdraftLimit;


// CurrentAccount class extends i.e inherits from Account Class
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit; 
    } 
    
public double getOverdraftLimit() {
    return overdraftLimit; 
}

public void setOverdraftLimit(double overdraftLimit) { 
    this.overdraftLimit = overdraftLimit;
}

@Override
public double withdraw(double requested) {
double availableFunds = balance + overdraftLimit;

    if(requested > availableFunds) {
        return 0; 
    } else {
            this.balance -= requested;
            return requested; 
    }
    
} }

// `CurrentAccount` with the following members, in addition to the attributes of the `Account` class:
// - `public CurrentAccount(int accountNumber, double balance, double overdraftLimit)` - constructor that accepts parameters representing the new account number, starting balance and overdraft limit
// - `public double getOverdraftLimit()` - returns the current overdraft limit
// - `public void setOverdraftLimit()` - sets the overdraft limit

// #### Notes
// Ensure that you have overridden methods of the `Account` class where necessary in the derived classes.