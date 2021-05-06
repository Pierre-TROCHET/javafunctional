package javafunctional.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		
		System.out.println("Without Predicate:");
		System.out.println(isPhoneNumberValid("07000000000"));
		System.out.println(isPhoneNumberValid("0700000000"));
		System.out.println(isPhoneNumberValid("09000567000"));

		System.out.println("");
		
		System.out.println("With Predicate:");
		System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
		System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
		System.out.println(isPhoneNumberValidPredicate.test("09000567000"));

		System.out.println("");
		
		System.out.println("Is phone number valid or contains 3 = " + isPhoneNumberValidPredicate.or(containsNumbers3).test("07000567000"));
		System.out.println("Is phone number valid and contains 3 = " + isPhoneNumberValidPredicate.and(containsNumbers3).test("07000563000"));
	
	}
	
	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
	}
	
	static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;
	
	static Predicate<String> containsNumbers3 = phoneNumber -> phoneNumber.contains("3");
}
