package syou1;

public class Class1ー2 {

	public static void main(String[] args) {

		String s1 = "Java and JavaScript";
		if (s1.contains("Java")) {
			System.out.println("s1はJavaを含んでいる");
		}
		if (s1.startsWith("Java")) {
			System.out.println("s1はJavaで始まっている");
		}
		if (s1.endsWith("Java")) {
			System.out.println("s1はJavaで終わっている");
		}
		System.out.println("s1で最初にJavaが登場する位置は" + s1.indexOf("Java") + "です");
		System.out.println("s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java") + "です");
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}

	}

}
