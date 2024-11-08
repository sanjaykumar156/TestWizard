package TestCases;

public class OvelsString {

	public static void main(String[] args) {
		String filePath = ".\\Reports\\";
		System.out.println("File path: " + filePath);
		String s= "sanjaykumar";
		int count=0;
		int l= s.length();
		for(int i=0;i<l;i++) {
			char c= s.charAt(i);
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
	                || s.charAt(i) == 'i'
	                || s.charAt(i) == 'o'
	                || s.charAt(i) == 'u') {
				System.out.println("ovles in s string are ="+" " +s.charAt(i));
			count++;
		}
	}
		System.out.println("count of ovwles in a string are =" + count++);
	}
}


