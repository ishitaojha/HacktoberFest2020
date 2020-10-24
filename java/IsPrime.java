public class isPrime(){
public static boolean isPrime(int number){
  int cont = 2;
  boolean prime=true; // if the above condition is satisfied then boolean value will become true
  while ((prime) && (cont!=number)){
    if (number % cont == 0) // if number is divisible by 2 then it's not prime , because it's even .
      prime = false; // value will become false 
    cont++; // counte incremented 
  }
  return prime; 
}
}
