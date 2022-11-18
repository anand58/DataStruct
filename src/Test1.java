public class Test1 {
	public static void main(String[] args) {
		System.out.println("test");
		System.out.println(getMessages("test"));
	}

	public static char[] getMessages(String s) {
		char[] arr = new char[s.length()];
		int i = 0;
		for( char c : s.toCharArray()) {
			arr[i++] = c;
		}
		return arr;
	}
}
