package javafunctional.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {
		Customer maria = new Customer("Maria", "9999999");
		
		//Normal Java function
		greetCustomer(maria);

		//Normal Java function
		greetCustomerv2(maria, false);
		
		//Consumer Functional interface
		greetCustomerConsumer.accept(maria);
		
		//Consumer Functional interface
		greetCustomerConsumerv2.accept(maria, false);
	}
	
	static BiConsumer<Customer, Boolean> greetCustomerConsumerv2 = (customer, showPhoneNumber) -> 
		System.out.println("Hello " + customer.customerName + ", thanks for registrering phone number " + (showPhoneNumber?customer.customerPhoneNumber:"****"));
	
	static Consumer<Customer> greetCustomerConsumer = customer -> 
		System.out.println("Hello " + customer.customerName + ", thanks for registrering phone number " + customer.customerPhoneNumber);
	
	static void greetCustomer(Customer customer) {
		System.out.println("Hello " + customer.customerName + ", thanks for registrering phone number " + customer.customerPhoneNumber);
	}
	
	static void greetCustomerv2(Customer customer, Boolean showPhoneNumber) {
		System.out.println("Hello " + customer.customerName + ", thanks for registrering phone number " + (showPhoneNumber?customer.customerPhoneNumber:"****"));
	}
	
	static class Customer{
		private final String customerName;
		private final String customerPhoneNumber;
		public Customer(String customerName, String customerPhoneNumber) {
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}
	}

}
