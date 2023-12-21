class AgeLessThan18Exception extends Exception {
    public AgeLessThan18Exception(String message) {
        super(message);
    }
}

public class LicenseApplication {
    public static void main(String[] args) {
        int age = 16; // Example age
        try {
            checkEligibility(age);
            System.out.println("License application accepted!");
        } catch (AgeLessThan18Exception e) {
            System.out.println("License application rejected: " + e.getMessage());
        }
    }

    public static void checkEligibility(int age) throws AgeLessThan18Exception {
        if (age < 18) {
            throw new AgeLessThan18Exception("Applicant's age is less than 18");
        }
    }
}
