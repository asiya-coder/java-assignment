public class GradeReport {

    // Validates if the provided score is within the acceptable range (0 to 100)
    public static boolean validateScore(double score) {
        return score >= 0 && score <= 100;
    }

    // Calculates the letter grade based on the numeric score
    public static char calculateLetterGrade(double score) {
        if (score >= 80) {
            return 'A';
        } else if (score >= 70) {
            return 'B';
        } else if (score >= 60) {
            return 'C';
        } else if (score >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Displays a performance message based on the letter grade
    public static void displayPerformanceMessage(char grade) {
        if (grade == 'A') {
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Very Good");
        } else if (grade == 'C') {
            System.out.println("Good");
        } else if (grade == 'D') {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void executeGradeReport(double score) {
        boolean validScore = validateScore(score);
        if (!validScore) {
            System.out.println("Invalid score");
            return;
        }
        char grade = calculateLetterGrade(score);
        displayPerformanceMessage(grade);
    }
}