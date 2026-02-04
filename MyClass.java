public class MyClass {
    public static void main(String[] args) {
        // Example usage of GradeReport
        double score = 85.0;
        GradeReport.executeGradeReport(score);

        // Example usage of ClassAverage
        double avg1 = ClassAverage.calculateClassAverage(80.0, 90.0);
        System.out.println("Class Average (2 scores): " + avg1);

        double avg2 = ClassAverage.calculateClassAverage(70.0, 80.0, 90.0);
        System.out.println("Class Average (3 scores): " + avg2);

        double[] scoresArray = { 60.0, 70.0, 80.0, 90.0 };
        double avg3 = ClassAverage.calculateClassAverage(scoresArray);
        System.out.println("Class Average (array of scores): " + avg3);
    }
}
