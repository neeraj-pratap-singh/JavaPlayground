public class StudentMarksChecker {
    public static void main(String[] args) {
        int marks = 80;

        if (marks >= 80) {
            System.out.println("Learner got distinction");
        } else if (marks >= 60) {
            System.out.println("Learner got first division");
        } else if (marks >= 40) {
            System.out.println("Learner got second division");
        } else if (marks >= 35) {
            System.out.println("Learner got third division");
        } else {
            System.out.println("Learner got failed");
        }
    }
}
