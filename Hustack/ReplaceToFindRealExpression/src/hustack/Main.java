package hustack;
import java.util.*;

public class Main{
	//kiểm tra biểu thức ngoặc đúng
	public static boolean check(char[]  a) {
		int bal = 0;
		for(char c : a) {
			if(c == '1') {
				bal++;
			}
			else if(c == '2') {
				bal --;
			}
			if(bal < 0) {
				return false; //nếu đang duyệt mà thừa đóng ngoặc chứng tỏ sai luôn
			}
		}
		return bal == 0;
	}
	
	public static void genEx(char [] a, int id, List<String> res) {
		if(id == a.length) {
			if(check(a)) {
				res.add(new String(a));
			}
			return;
		}
		if(a[id] == '0') {
			//thử thay
			a[id] = '1';
			genEx(a, id + 1, res);
			a[id] = '2';
			genEx(a, id+ 1, res);
			
			//quay lui
			a[id] = '0';
		}
		else genEx(a, id + 1, res);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sc.nextLine();
		
		char[] a = sc.nextLine().replaceAll(" ", "").toCharArray();
		
		List<String> res = new ArrayList<>();
		
		if(!new String(a).contains("0")) {
			if(check(a)) res.add(new String(a));
		}
		else {
			genEx(a, 0, res);
		}
		if(res.isEmpty()) System.out.println();
		else {
			for(String r : res) {
				System.out.print(r + " ");
			}
		}
	}
}

