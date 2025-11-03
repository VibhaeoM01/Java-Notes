// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Voting Program
public class Voting {
    private int age;

    public Voting(int age) {
        this.age = age;
    }

    public void checkEligibility() throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are not eligible to vote. Age must be 18 or above.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        Voting voter1 = new Voting(17); // underage
        Voting voter2 = new Voting(20); // eligible

        try {
            voter1.checkEligibility();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            voter2.checkEligibility();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
