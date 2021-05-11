package syou1;

public class Class1ー1 {

	public static void main(String[] args) {
		String s11 = "スッキリJava";
		String s1 = "";
		String s2 = "Java";
		String s3 = "java";
		if (s2.equals(s3)) {
			System.out.println("s2とs３は等しい");
		}
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3の文字列は、ケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length() + "です");
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}

	}

}
