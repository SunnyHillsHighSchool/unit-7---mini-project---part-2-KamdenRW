//Programmers: Wesley Truong and Kamden Wright

import java.util.ArrayList;

public class Loan
{

  private int ID;
  private double loanAmount;
  private String country;
  private int daysToFund;
  private int numLenders;

  public Loan(int ID, double loanAmount, String country, int daysToFund,   int numLenders) 
  { 
    this.ID = ID; 
    this.loanAmount = loanAmount; 
    this.country = country; 
    this.daysToFund = daysToFund; 
    this.numLenders = numLenders; 
  }

    public Loan() 
  { 
    this.ID = 0; 
    this.loanAmount = 0; 
    this.country = "country"; 
    this.daysToFund = 0; 
    this.numLenders = 0; 
  }
  //accessor methods
  public int getID()
  {
    return ID;
  }

  public String getCountry()
  {
    return country;
  }

  public double getLoanAmount()
  {
    return loanAmount;
  }

  public int getDaysToFund()
  {
    return daysToFund;
  }

  public int getNumLenders()
  {
    return numLenders;
  }
  // modifier methods
  public void setID (int setID)
  {
    ID = setID;
  }

    public void setCountry (String setCountry)
  {
    country = setCountry;
  }

    public void setLoanAmount (double setLoanAmount)
  {
    loanAmount = setLoanAmount;
  }

    public void setDaysToFund (int setDaysToFund)
  {
  daysToFund = setDaysToFund;
  }

    public void setNumLenders (int setNumLenders)
  {
    numLenders = setNumLenders;
  }
}
