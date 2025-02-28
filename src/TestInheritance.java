import java.time.LocalDate;

public class TestInheritance {

	public static void main(String[] args) {

		Dog myDog = new Dog(40, 24, "Buddy", "Labrador", LocalDate.of(2018, 5, 12));
		Cat myCat = new Cat(10, 12, "Tom", 9);
		Bird myBird = new Bird(2, 6, 9.5, true);

		System.out.println(myDog);
		System.out.println(myCat);
		System.out.println(myBird);
		System.out.println();

		Dog myDog2 = new Dog(40, 24, "Kiara", "Maltese", LocalDate.of(2022, 4, 15));
		Cat myCat2 = new Cat(10, 15, "Tito", 0);
		Bird myBird2 = new Bird(2, 6, 9.5, false);

		System.out.println(myDog2);
		System.out.println(myCat2);
		System.out.println(myBird2);
		System.out.println();

	}
}