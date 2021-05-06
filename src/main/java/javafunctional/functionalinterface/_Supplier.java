package javafunctional.functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {
		
		System.out.println(getDBConnecionUrl());
		
		System.out.println("");
		
		System.out.println(getDBConnecionUrlSupplier.get());
	}
	
	static String getDBConnecionUrl() {
		return "jdbc://localhost:5432/users";
	}
	
	static Supplier<List<String>> getDBConnecionUrlSupplier = () -> List.of("jdbc://localhost:5432/users", "jdbc://localhost:5432/clients");

}
