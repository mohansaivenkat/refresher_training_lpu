package exceptions;

public class Check {
	public static void main(String[] args) {
		try {
			checkAge(15);
		}catch(InvalidAgeException n) {
			System.out.println(n.getMessage());
		}
	}
	
	// to check whether eligible to vote or not
	public static void checkAge(int age) throws InvalidAgeException{
		if(age>18) {
			System.out.println("Eligible to vote....!");
		}else {
	// throw an object explicitly
			throw new InvalidAgeException("Minimum age to vote is 18.");
		}
	}
}
