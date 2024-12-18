package sort;

import java.io.*; 

public class Main {
    public static void main(String[] args) {
 
        InputStreamReader r=new InputStreamReader(System.in);  
        BufferedReader br=new BufferedReader(r);  
 
         try { 
             System.out.println("Nhap so phan tu trong mang:");
             int size = Integer.valueOf(br.readLine()); 
             System.out.println("Nhap lan luot cac phan tu trong mang, moi phan tu tren mot dong:");
             int a[] = new int[size];
             for(int i=0;i<size;i++){
                 a[i] = Integer.valueOf(br.readLine()); 
             }
             System.out.println("Mang da nhap vao:");
             for(int i=0;i<size;i++){
                 System.out.print(" " + a[i]); 
             }
             /* thực hiện sắp xếp tăng dần */
             for(int i=0;i<size;i++){
                 int min = i;
                 for(int j=i;j<size;j++){
                       if(a[j]<a[min]) min = j;
                 }
                 int temp = a[min];
                 a[min] = a[i];
                 a[i] = temp;
             }
             System.out.println("\nMang sau khi sap xep tang dan:");
             for(int i=0;i<size;i++){
                 System.out.print(" " + a[i]); 
             }
         } catch (Exception e) { 
         	System.out.println("Error "); 
         } 
    }
}