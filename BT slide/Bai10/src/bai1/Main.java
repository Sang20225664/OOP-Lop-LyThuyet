package bai1;
import java.util.Scanner;    
public class Main {
    static double average = 0.0;
    static int N=1;	
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while(true) {	    
            getAverage(console.nextLine());
        }
    }	
    public static double getAverage(String s) {
        int i;   
        try {
            i = Integer.parseInt(s);
            System.out.println("Input is " + i);
            double m = average*(N-1) + i;
            average = m/N;
            System.out.println("average is " + average);
            N++;
        } catch (java.lang.NumberFormatException ex1) {
            System.out.println("Can nhap vao so nguyen!");
        } 		
        return average;
    }
}