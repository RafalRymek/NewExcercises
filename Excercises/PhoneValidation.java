package Excercises;

public class PhoneValidation {
	
	public static boolean validatePhoneNumber(String phoneNumber){
		
		if (phoneNumber.matches("^((\\+|00)48)?[0-9]{9}$")) return true;
		
		else if (phoneNumber.matches("^((\\+|00)[0-9]{2})?[0-9]{9,13}$")) return true;
		
		return false;
		
	}

	public static void main(String[] args) {
		
		System.out.println("Phone number 1234567890 validation result: "+validatePhoneNumber("1234567890"));
		System.out.println("Phone number 123-456-7890 validation result: "+validatePhoneNumber("123-456-7890"));
		System.out.println("Phone number 123-456-7890 x1234 validation result: "+validatePhoneNumber("123-456-7890 x1234"));
		System.out.println("Phone number 123-456-7890 ext1234 validation result: "+validatePhoneNumber("123-456-7890 ext1234"));
		System.out.println("Phone number (123)-456-7890 validation result: "+validatePhoneNumber("(123)-456-7890"));
		System.out.println("Phone number 123.456.7890 validation result: "+validatePhoneNumber("123.456.7890"));
		System.out.println("Phone number 123 456 7890 validation result: "+validatePhoneNumber("123 456 7890"));
		System.out.println("Phone number +4866677888 validation result: "+validatePhoneNumber("+48666777888"));
		System.out.println("Phone number TEST validation result: "+validatePhoneNumber(""));
	}
	
}
