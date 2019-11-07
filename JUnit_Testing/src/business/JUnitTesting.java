package business;

public class JUnitTesting {

	public static int square(int number) {
		return (number * number);
	}

	public static int countA(String string) {
		string.toLowerCase();
		int numA = (string.length() - string.replace("a", "").length());

		return numA;

	}

}

