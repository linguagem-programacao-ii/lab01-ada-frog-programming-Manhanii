package lab01;
import java.util.Scanner;


public class test{
    private static Scanner scanner;

    public static void main(String args[]){
        
        int p =0;
        int q = 0;
        int c = 0;
        int dif = 0;

        scanner = new Scanner(System.in);
        p = scanner.nextInt();
        q = scanner.nextInt();
        
        int[] j = new int [q];
        
        for(int i=0; i < q; i++){
            j[i] = scanner.nextInt();
        }
        for(int i=1; i<q;i++){
            if (j [i] > j[i-1]){
                dif = j[i] - j[i-1];
            }else{
                dif = (j[i-1] - j[i]);
            }if(dif <= p){
                c++;
            }
            if(c == q-1){
                System.out.println("You Win!!");

            }else{
                System.out.println("Wou Lose!");
            }
        }}



    }



