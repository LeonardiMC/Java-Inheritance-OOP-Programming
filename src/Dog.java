import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dog extends Animal{

		private String name;
		private String breed;
		private LocalDate birthday;
		

		public Dog (int weight, int height, String name, String breed, LocalDate birthday) {  //dog has a weight, dog HAS A name
			super(weight,height); 
			setName(name);
			setBreed(breed);
			setBirthday(birthday);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public String getBreed() {
			return breed;
		}

		public void setBreed(String breed) {
			this.breed = breed;
		}

		public LocalDate getBirthday() {
			return birthday;
		}

		public void setBirthday(LocalDate birthday) {
			this.birthday = birthday;
		}
		public String toString() {   //Method overriding 
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // Set format
		    String formattedDOB = birthday.format(formatter);
		    
			String result;
			result =  name + " is a " + breed + " dog, born on " + formattedDOB + ", " + super.toString();
			return result;
		}
}
