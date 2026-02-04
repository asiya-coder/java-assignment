public class ClassAverage {
    // Version 1: Two double scores as parameters
    public static double calculateClassAverage(double score1, double score2) {
        return (score1 + score2) / 2;
    }

    // Version 2: Takes three double scores
    public static double calculateClassAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }

    // Version 3: Takes an array of double scores
    public static double calculateClassAverage(double[] scores) {
        double total = 0;
        for (double score : scores) {
            total += score;
        }
        return total / scores.length;
    }
}
