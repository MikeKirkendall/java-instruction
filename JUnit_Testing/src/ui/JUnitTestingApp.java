package ui;

public class JUnitTestingApp {

	public static void main(String[] args) {
		String str = "Abracadabra";
		
		System.out.println(countA(str));

	}
	
	private static int countA(String s) {
		int count = 0;
			
		for (int i=0;i<s.length(); i++) {
			if (s.charAt(i)=='a' || s.charAt(i)=='A'){
				
				count++;
				
				/* kate
				 * s.toLowerCase();
				 * count = s.length() - s.replace("a","").length();
				 * return count;
				 * 
				 * 
				 * matt
				 * for (int i = 0; i<s.length() i++){
				 * String str = s.substring(i0;
				 * if (str.startsWith("a")|| str.
				 * 
				 *
				 **/
				 
			}
			

			
		}
		
		return count;
	}

}

//string method pg 463
