package javafunctional.optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		Supplier<? extends IllegalStateException> exception = () -> new IllegalStateException("exception");
		
		Object value = Optional.ofNullable("Hello")
			.orElseThrow(exception);
		
		System.out.println(value);
		
		Optional.ofNullable(null)
			.ifPresentOrElse(
					valuee -> System.out.println("Sending email to: " + valuee), 
					() -> System.out.println("Cannot send email.")
			);
		
		

	}

}
