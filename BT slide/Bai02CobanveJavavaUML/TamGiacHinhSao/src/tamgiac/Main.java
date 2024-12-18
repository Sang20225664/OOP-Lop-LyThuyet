package tamgiac;

import java.io.*; 

public class Main {
    public static void main(String[] args) {
 
        InputStreamReader r=new InputStreamReader(System.in);  
        BufferedReader br=new BufferedReader(r);  
 
         try { 
             int h;
             do {
                 System.out.println("Nhap chieu cao h:");
                 h = Integer.valueOf(br.readLine()); 
             }
             while (h<2||h>10);

             /* thuc hien in sao */
             for(int i=0;i<h;i++){
                 System.out.println();
                 for(int j=0;j<=i;j++){
                    System.out.print("*"); 
                 }
             }
         } catch (Exception e) { 
         	System.out.println("Error "); 
         } 
    }
}