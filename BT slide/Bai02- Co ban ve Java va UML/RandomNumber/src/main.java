import java.io.*;
import java.util.Random;
public class main {
	public static void main(String[] args) {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		try {
			System.out.println("Nhap so phan tu cua mang:");
			int size = Integer.valueOf(br.readLine()); //tuong tu nhu Scanner input
			System.out.println("Nhap lan luot cac phan tu trong mang, moi phan tu mot dong:");
			int a[] = new int[size];
			for(int i = 0; i < size; i++) {
				a[i] = Integer.valueOf(br.readLine());
				
			}
			System.out.println("Mang da nhap vao:");
			for(int i = 0; i < size; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			
			Random ran = new Random();
			int pos[] = new int[2];
			for(int i = 0; i < 2; i++) {
				pos[i] = ran.nextInt(size);
			}
			System.out.println("2 vi tri can dao: " + pos[0] + "va " + pos[1]);
			
			//doi cho 2 vi tri
			int tmp = a[pos[1]];
			a[pos[1]] = a[pos[0]];
			a[pos[0]] = tmp;
			System.out.println("Mang da doi cho 2 vi tri");
			for(int i = 0; i < size; i++) {
				System.out.println(" " + a[i]);
			}
			
		}
		catch(Exception e) {
			System.out.println("Error");
		}
				
	}
}
