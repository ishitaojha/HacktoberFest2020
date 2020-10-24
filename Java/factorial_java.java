import java.util;
 public class FactorialExample2{  
  public static void main (String args [])
  int factorial (int n) ;{    //initialize an integer for input number
  if (n == 0)   //check if it is equal to zero 
    return 1;    
  else    
    return(n * factorial(n-1));    
   {  
  int i,fact=1;  
  int number=4;//It is the number to calculate factorial    
  fact = factorial(number);   
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  
