import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		al.add(3, 200);
		System.out.println(al);
	}
}
