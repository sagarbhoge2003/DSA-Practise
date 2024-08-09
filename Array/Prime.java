import java.math.*;
public class Prime{
public static boolean IsPrime(int n){
    for(int i=2; i<=Math.sqrt(n);i++){
        if( n==2){
            return true;
        }
        
        if(n%i == 0){
            return false;
        }
    }
    return true;
}

public static void primeInRange(int n){
    for(int i=2; i<=n; i++){
        if(IsPrime(i)){
            System.out.print(i + " ");
        }
    }
    System.out.println();
}
public static void main (String args[]){
    primeInRange(20);
}
}