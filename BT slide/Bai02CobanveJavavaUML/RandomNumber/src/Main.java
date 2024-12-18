import java.io.*; 
import java.util.Random;
 
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
             System.out.println();
             Random ran = new Random();
             int pos[] = new int[2];
             for(int i=0;i<2;i++){
                 pos[i] = ran.nextInt(size);
             }
             System.out.println("2 vi tri can dao:"+pos[0]+" va " + pos[1]);
               // thực hiện đổi chỗ hai vị trí
              int temp = a[pos[1]];
              a[pos[1]] = a[pos[0]];
              a[pos[0]] = temp;
              System.out.println("Mang da doi cho 2 vi tri:");
              for(int i=0;i<size;i++){
                     System.out.print(" " + a[i]); 
              }
         } catch (Exception e) { 
         	System.out.println("Error "); 
         } 
    }
}