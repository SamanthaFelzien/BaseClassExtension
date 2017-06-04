import java.util.List;
import java.util.LinkedList;
import java.util.*;
import java.io.*;

public abstract class Account
{
  protected int customerID;
  protected int accountNumber; 
  protected String accountType; 
  protected double interestRate; 
  protected double monthlyInterestRate; 
  protected double currentMonthlyInterest;
  protected double balance; 
 // protected int term; 
  LinkedList<Transaction> transactionList = new LinkedList<Transaction>();
  
  
  //default constructor 
  public Account()
  { 
    
    setCustomerID(0);
    setAccountNumber(0);
    setAccountType("");
    setInterestRate(0.0);
    setMonthlyInterestRate(0.0);
    setCurrentMonthlyInterest(0.0);
    setBalance(0.0);
    //setTerm(0);
  }
  
  //parm constructor 
  public Account(int customerID, int accountNumber, String accountType, double interestRate, double balance)
  { 
    
    setCustomerID(customerID);
    setAccountNumber(accountNumber);
    setAccountType(accountType);
    setInterestRate(interestRate);
    setMonthlyInterestRate(monthlyInterestRate);
    setCurrentMonthlyInterest(currentMonthlyInterest);
    setBalance(balance);
    //setTerm(term);
  }
  
  //setter and getter methods
  public void setCustomerID (int customerID) {
    this.customerID = customerID;
  }
  public int getCustomerID(){
    return customerID;
  }
  
  
  public void setAccountNumber (int accountNumber) {
    this.accountNumber = accountNumber;
  }
  public int getAccountNumber(){
    return accountNumber;
  }
  
  
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }
  public String getAccountType(){
    return accountType;
  }
  
  
  public void setInterestRate (double interestRate) {
    this.interestRate = interestRate;
    monthlyInterestRate = interestRate/12; 
  }
  public double getInterestRate(){
    return interestRate;
  }
  
    public void setMonthlyInterestRate (double monthlyInterestRate) {
    this.monthlyInterestRate = monthlyInterestRate;
  }
  public double getMonthlyInterestRate(){
    return monthlyInterestRate;
  }
  
    public void setCurrentMonthlyInterest (double currentMonthlyInterest) {
    this.currentMonthlyInterest = currentMonthlyInterest;
  }
  public double getCurrentMonthlyInterest(){
    return currentMonthlyInterest;
  }
  
     public void setBalance (double balance) {
    this.balance = balance;
  }
  public double getBalance(){
    return balance;
  }
  

 //abstract and empty methods
  //public abstract String listTransactions(); 
  public abstract void processTransaction(Transaction transactionObj); 
  
  public void setTermInYears(int integer){};
  public void setTermInMonths(int integer){};
  public void setPeriodicPayment(double dbl){};
  public void setBalanceRepaid(double dbl){};
  public void setTransactionID(int integer){};
  public void setTransactionDate(int integer){};
  public void setAmount(double dbl){};
  public void setType(String string){};
  
  
  public String listTransactions(){
      StringBuffer strBuf = new StringBuffer();
    for(Transaction transactionObj : transactionList ) {  
      strBuf.append(transactionObj.toString());
    }
     return strBuf.toString();
  }
  
     

    
   public String toString()
 {
      StringBuffer strBuf = new StringBuffer("\nAccount data: \n") ;
  strBuf.append("\nCustomer ID                    : " ); 
  strBuf.append(customerID );
  strBuf.append("\nAccount Number                 : ");
  strBuf.append(accountNumber); 
  strBuf.append("\nAccount Type                   : " );
  strBuf.append(accountType); 
  strBuf.append("\nInterest Rate                  : "); 
  strBuf.append(interestRate );
  strBuf.append("\nMonthly Interest Rate          : ");
  strBuf.append(monthlyInterestRate); 
  strBuf.append("\nCurrent Monthly Interest Rate  : ");
  strBuf.append(currentMonthlyInterest); 
  strBuf.append("\nBalance                        : ");
  strBuf.append(balance); 

      return strBuf.toString();
 }
    
}

