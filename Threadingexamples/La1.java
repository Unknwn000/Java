import java.util.ArrayList;
import java.util.Scanner;


public class La1{

public static void main(String args[]){
        System.out.println("please enter the number");
        Scanner k = new Scanner(System.in);
        int n =k.nextInt();
        for(int i=2;i<=n;i++){
        if(Primeornot(i)){
            System.out.println(i);
            }
        }


    }
    static boolean Primeornot(int n){
        if(n==0 || n==1){
            System.out.println("Neither prime nor composite");
            return false;
        }
        for (int i = 2; i <Math.pow(n,0.5); i++) {
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
}
