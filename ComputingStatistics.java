import java.util.ArrayList;
import java.lang;

public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
 
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount;
   }

   public double avgLoan(){
     
   }

   public double largestLoan() {
    /*
    Create int variable called largest and set it to the first element
    For loop
    Compare largest loan.getLoanAmount() to the next  element and check if it is greater
    If it is greater than the current largest value, set it to largest
    Close loop.
    */
    int largest = data.get(0);
    for(int i = 1; i < data.length; i++ ){
      if (largest < data.get(i)){
        data.get(i) = largest;
      }
    }
    return largest;
  }

//Largest Loan
//Create int variable called largest and set it to the first element
//For loop
//Compare largest loan.getLoanAmount() to the next element and check if it is greater
//If it is greater than the current largest value, set it to largest
//Close loop.

  public double smallestLoan(){

  int smallest = data.get(0);
  for(int i = 1; i < data.length; i++){
    if(samllest > data.get(i)){
      data.get(i) = smallest; 
    }
  }
  return smallest;
  }
  
//Smallest Loan
//Create int called smallestLoan and set to first element 
//Create an if to check if the first element is smaller than the second 
//If it is smaller swap

  public String largestLoanCountry(){
    int largestL = data.get(0).getLoanAmount();
    String largestLoanCountry = data.getCountry(); 
    for(Loan largest : data){
      if(largest.getLoanAmount() > largestL.getLoanAmount){
        largestL = largest;
      }
    }
    return largestL;
  }
//largestLoanCountry
//Create and int variable called largestLoan and set it to data.get(0).getLoanAmount()
//Create String object name largestLoanCountry and set it to data.get(0).getCountry
//Create a for each loop for the array of loan objects (Loan largest : data)
//Check if largest.getLoanAmount() is greater than largestLoan
//If it is, replace largestLoan with it, and set largestLoanCountry to largest.getCountry.
//Close loop.

  public String smallestLoanCountry(){
    int smallestL = data.get(0).getLoanAmount();
    String smallestLoanCountry = data.getCountry();
    for(Loan smallest : data){
      if(smallest.getLoanAmount() > smallestL.getLoanAmount){
        smallestL = smallest;
      }
    }
    return smallestL;
  }
  }
  //smallestLoanCountry
  //Create an int variable called smallestLoan, set to data.get(0).getLoanAmount()
	//Create String object smallestLoanCountry and set to data.get(0).getCountry
	//Create a for each loop to iterate
	//Check if smallest.getLoanAmount() is smaller than smallestLoan
	//Replace if smaller

 public int avgDaysToFund(){
   int avg = 0;
   for(int x : data){
     avg = avg + x.getDaysToFund;
   }
  avg = avg / data.size;
  return avg;
 }

//avgDaysToFund
//Declare an int variable called avg
//For each loop (int x : data)
//Avg = avg + x.getDaysToFund;
//Close loop
//Divide avg by data.size

public String largestLoanKenya(){
  for (Loan largest : data){
    int largestLoanK = data.get(0).getLoanAmount(
    if(data.get(i).getCountry = "Kenya"){
    if(largest.getLoanKenya() > largestLoanK)
    largestLoanK = largest;
    }
  }
  return largestLoanK;
}

//largestLoanKenya
//Create and int variable called largestLoan and set it to data.get(0).getLoanAmount()
//Create a for each loop to iterate through the arraylist
//Check if largest.getLoanKenya() is greater than largestLoan
//If it is, replace 

public int avgLoanPhilippines(){
int avg = 0;
  for(int x : data){
     avg = avg + x.getLoan;
  }
avg = avg / data.size;
  return avg;
}


//avgLoanPhilippines()
//Declare an int variable called avg
//For each loop (int x : data)
//Avg = avg + x.getLoan;
//Close loop
//Divide avg by data.size



//longestToFundCountry() 
//Create int called days 
//public String longestToFundCountry()
//Create a for each loop (int x: data)
//Create an if to check days.getDaysToFund
//If days is larger swap
public int longestToFundCountry(){
int greatest = 0;
  for(int x: data){
    if(data.get(i).getDaysToFund() > greatest){
      greatest = longestToFundCountry;
    }
  }
}


//variance
public double variance(){
double average = 0;
double variance = 0;
double topPart = 0;
for(double x : data){
  average = average + x.getLoanAmount();
}
average = average/data.size();
for(double y : data){
  topPart = y - average;
  topPart = topPart*topPart;
  Variance = Variance + topPart;
}
Variance = Variance/data.size;
return Variance;
}
  




//standardDeviation
public double standardDeviation(){
public double variance(){
double average = 0;
double variance = 0;
double topPart = 0;
for(double x : data){
average = average + x.getLoanAmount();
}
average = average/data.size();
for(double x : data){
topPart = x - average;
topPart = topPart*topPart;
topPart = topPart/data.size();
Variance = Variance + topPart;
}
Variance = Math.sqrt(Variance);  
return Variance;
} 
}
//Find the mean.
//Create an For each loop, and find the square of its distance to the mean.
//Sum the values 
//Divide by the number of data points.
//Take the square root.



//empiricalRule
//public boolean empiricalRule()
//Create an if to check if the loan falls in 68-95-99.7%
//Return true or false

}