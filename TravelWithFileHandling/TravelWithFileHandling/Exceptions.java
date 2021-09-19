package TravelWithFileHandling;

public class Exceptions {


	// Exception methods for inputTextFields

	// for checking the number if alphabets is added on the text field it will generate exceptions
	public static Long checkInt(String in) {

		try {
			Long l=Long.parseLong(in);
			return l;
		} catch (Exception e) {

			return null;
		}
	}
// for checking the String if number is added on the text field it will generate exceptions
	public static String checkString(String in)
	{
		char[] a = in.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = 47; j < 58; j++) {
				if ((int)a[i] == j)
					return "Wrong Input";
			}
		}
		return in;
	}




}

		

