package javafunctional.streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {

	public static void main(String[] args) {
		
		List<Person> people = List.of(
				new Person("John", Gender.MALE),
				new Person("Maria", Gender.FEMALE),
				new Person("Aisha", Gender.FEMALE),
				new Person("Alex", Gender.MALE),
				new Person("Alice", Gender.FEMALE),
				new Person("Bob", Gender.PREFER_NOT_TO_SAY)
				);
		
		people.stream()
			.map(person -> person.name)
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		System.out.println("");
		
		people.stream()
			.map(person -> person.name)
			.mapToInt(name -> name.length())
			.forEach(System.out::println);

		System.out.println("");
		
		IntConsumer action = System.out::println;
		ToIntFunction<? super String> mapper = String::length;
		Function<? super Person, ? extends String> mapper2 = person -> person.name;
		people.stream()
			.map(mapper2)
			.mapToInt(mapper)
			.forEach(action);

		System.out.println("");
		
		Predicate<? super Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);
		boolean containsOnlyFemales = people.stream()
		.allMatch(personPredicate);
		
		System.out.println(containsOnlyFemales);
		

	}
	
	static class Person {
		private final String name;
		private final Gender gender;
		
		public Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
		
	}
	
	enum Gender{
		MALE, FEMALE, PREFER_NOT_TO_SAY
	}

}
