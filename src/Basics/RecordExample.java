package Basics;

record PersonRecord(String name, int age, String address) {
    // Record body
}
public record RecordExample() {


}

class Main{
	public static void main(String[] args) {
		PersonRecord personrec = new PersonRecord("John Doe", 30, "123 Main St");
		String name = personrec.name();
		int age = personrec.age();
		String address = personrec.address();
		System.out.println(personrec); // Output: Person[name=John Doe, age=30, address=123 Main St]

	}
}

