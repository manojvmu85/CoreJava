
import java.util.ArrayList;
import java.util.List;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Manoj");
		al.add("Kumar");
		al.add("Sharma");
		System.out.println("The Value in Arralist 1 : "+al);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("abc");
		al2.add("cde");
		al2.add("fgh");
		System.out.println("The value in Arraylist 2 : "+al2);
		al.addAll(al2);
		System.out.println("The Value : "+al);

	}

}
