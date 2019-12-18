public class StringDemo1
{
	public static void main(String[] args) {
		String str = "manoj";
		char[] c = new char[str.length()];
		
		for (int i = 0; i<str.length();i++){
		    c[i]=str.charAt(i);
		}
		
		for(char ch :c){
		    System.out.print(ch+", ");
		}
	}
}
