package q590;


import java.util.Iterator;
import java.util.Scanner;

public class Main {
	static int arr[];
	static int N;

	public static void Dice(int p) {
	    if (p == N) {  
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");  
	        }
	        System.out.println();
	        return;  
	    } else {
	        for (int i = 1; i <= 6; i++) { 
	            if (p == 0){
                    arr[p] = i;
                    Dice(p + 1);
                }
	            else{
	            	if(i >= arr[p - 1]){
	                    arr[p] = i;  
		                Dice(p + 1);
	                }
	            }
                
	        }
	    }
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();  
	    arr = new int[N];  
	    Dice(0); 
	}

}
