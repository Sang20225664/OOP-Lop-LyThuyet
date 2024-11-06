import java.io.*;
public class Main {
	public static void main(String[] args) {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		try {
			System.out.println("Nhap so phan tu cua mang");
			int size = Integer.valueOf(br.readLine());
			System.out.println("Nhap cac phan tu trong mang cach dong nhau: ");
			int a[] = new int[size];
			for(int i = 0; i < size; i++) {
				a[i] = Integer.valueOf(br.readLine());
			}
			
			//sap xep
			for(int i = 0; i < size; i++) {
				int min = i;
				for(int j = i; j < size; j++) {
					if(a[j] < a[min]) min = j;
				}
				int tmp = a[min];
				a[min] = a[i];
				a[i] = tmp;
			}
			System.out.println("\nMang sau khi sap xep: ");
			for(int i = 0; i < size; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}
