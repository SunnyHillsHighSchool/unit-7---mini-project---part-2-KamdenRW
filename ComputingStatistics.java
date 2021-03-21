import java.util.ArrayList;
//Names: Wesley Truong, Kamden Wright

public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
 
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = new ArrayList<Loan>();
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
     //set initial to 0
      double amount = 0.0;
      //loop
      for(int i = 0; i < data.size(); i++) {
        //add loans
         amount = amount + data.get(i).getLoanAmount();
      }
      //return total
      return amount;
   }

   public double avgLoan(){
     //initial to 0
     double sum = 0.0;
     //add loans
     for(Loan l : data){
     sum = sum + l.getLoanAmount();
   }
   //divide to average
    double avg = sum/data.size();
    //return average
    return avg;
   }

   public double largestLoan() {
    /*
    Create int variable called largest and set it to the first element
    For loop
    Compare largest loan.getLoanAmount() to the next  element and check if it is greater
    If it is greater than the current largest value, set it to largest
    Close loop.
    */
    double largest = data.get(0).getLoanAmount();
    for(int i = 1; i < data.size(); i++ ){
      if (largest < data.get(i).getLoanAmount()){
        largest = data.get(i).getLoanAmount();
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

  double smallest = data.get(0).getLoanAmount();
  for(int i = 1; i < data.size(); i++){
    if(smallest > data.get(i).getLoanAmount()){
      smallest = data.get(i).getLoanAmount(); 
    }
  }
  return smallest;
  }
  
//Smallest Loan
//Create int called smallestLoan and set to first element 
//Create an if to check if the first element is smaller than the second 
//If it is smaller swap

  public String largestLoanCountry(){
    Loan largestL = data.get(0);
    for(int i = 1; i < data.size(); i++){
      if(data.get(i).getLoanAmount() > largestL.getLoanAmount()){
        largestL = data.get(i);
      }
    }
    return largestL.getCountry();
  }
//largestLoanCountry
//Create and int variable called largestLoan and set it to data.get(0).getLoanAmount()
//Create String object name largestLoanCountry and set it to data.get(0).getCountry
//Create a for each loop for the array of loan objects (Loan largest : data)
//Check if largest.getLoanAmount() is greater than largestLoan
//If it is, replace largestLoan with it, and set largestLoanCountry to largest.getCountry.
//Close loop.

  public String smallestLoanCountry(){
    Loan smallestL = data.get(0);
    for(int i = 1; i < data.size(); i++){
      if(data.get(i).getLoanAmount() < smallestL.getLoanAmount()){
        smallestL = data.get(i);
      }
    }
    return smallestL.getCountry();
  }
  
  //smallestLoanCountry
  //Create an int variable called smallestLoan, set to data.get(0).getLoanAmount()
	//Create String object smallestLoanCountry and set to data.get(0).getCountry
	//Create a for each loop to iterate
	//Check if smallest.getLoanAmount() is smaller than smallestLoan
	//Replace if smaller

 public double avgDaysToFund(){
   double avg = 0;
   for(int i = 0; i < data.size(); i++){
     avg = avg + data.get(i).getDaysToFund();
   }
  avg = avg / data.size();
  return avg;
 }

//avgDaysToFund
//Declare an int variable called avg
//For each loop (int x : data)
//Avg = avg + x.getDaysToFund;
//Close loop
//Divide avg by data.size

public double largestLoanKenya(){
  double largestLoanK = -1;
  for (int i = 0; i < data.size(); i++){
    if(data.get(i).getCountry().equals("Kenya")){
    largestLoanK = data.get(i).getLoanAmount();
    }
  }
  for(int i = 0; i < data.size(); i++){
    if(data.get(i).getCountry().equals("Kenya")){
      if(data.get(i).getLoanAmount() > largestLoanK) {
        largestLoanK = data.get(i).getLoanAmount();
      }
    }
  }
  return largestLoanK;
}

//largestLoanKenya
//Create and int variable called largestLoan and set it to data.get(0).getLoanAmount()
//Create a for each loop to iterate through the arraylist
//Check if largest.getLoanKenya() is greater than largestLoan
//If it is, replace 

public double avgLoanPhilippines(){
  double avgP = 0.0;
  int countP = 0;
  for(int i = 0; i < data.size(); i++){
    if(data.get(i).getCountry().equals("Philippines")){
      avgP = avgP + data.get(i).getLoanAmount();
      countP++;
      }
    }

    avgP = avgP/countP;
    return avgP;
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
public String longestToFundCountry(){
Loan greatest = new Loan();
  for(Loan x: data){
    if(x.getDaysToFund() > greatest.getDaysToFund()){
      greatest = x;
    }
  }
  return greatest.getCountry();
}


//variance
public double variance(){
  //initialize average
double average = 0;
//variance storage
double variance = 0;
//top part of equation
double topPart = 0;
//total
for(Loan x : data){
  average = average + x.getLoanAmount();
}
//average
average = average/data.size();
//subtracting average from every Loan amount
for(Loan y : data){
  topPart = y.getLoanAmount() - average;
  topPart = topPart*topPart;
  variance = variance + topPart;
}
//dividing by number of data
variance = variance/data.size();
return variance;
}
  




//standardDeviation
public double standardDeviation(){
double average = 0;
double variance = 0;
double topPart = 0;
for(Loan x : data){
  average = average + x.getLoanAmount();
}
average = average/data.size();
for(Loan y : data){
  topPart = y.getLoanAmount() - average;
  topPart = topPart*topPart;
  variance = variance + topPart;
}
variance = variance/data.size();
variance = Math.sqrt(variance);  
//return St. dev
return variance;
} 
//Find the mean.
//Create an For each loop, and find the square of its distance to the mean.
//Sum the values 
//Divide by the number of data points.
//Take the square root.

}