 public class Palindrome {
	public static void palindrome (String s){
		String  s1="";
		for(int i=s.length()-1;i>=0;i--){
			s1= s1+ s.charAt(i);
		}
			if(s1.equals(s))
				System.out.println("Palindrome");
			else
		System.out.println("Not palindrome");
	}
	
	public static void main(String[] args) {
		palindrome("malayala");
		
	}

}
