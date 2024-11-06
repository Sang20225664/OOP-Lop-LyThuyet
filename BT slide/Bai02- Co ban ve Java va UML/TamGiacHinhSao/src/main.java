import java.io.*;
public class main {
	public static void main(String[] args) {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		try {
			int h;
			do {
				System.out.println("Nhap chieu cao");
				h = Integer.valueOf(br.readLine());
			}
			while(h < 2 || h > 10);
				for(int i=0;i<h;i++){
	                 System.out.println();
	                 for(int j=0;j<=i;j++){
	                    System.out.print("*"); 
	                 }
	             }
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}
