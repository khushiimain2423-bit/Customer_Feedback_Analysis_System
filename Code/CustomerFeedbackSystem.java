// ============================================================
//  Customer Feedback Analysis System
//  Subject  : Object Oriented Programming With Java
//  Code     : RU-100-01-00012
//  Guide    : Mr. Santanu Sasmal (IBM SME and EXPERT)
//  College  : Rungta International Skills University, Bhilai
// ============================================================

import java.util.Scanner;

// -------------------------------------------------------
// CLASS 1: Feedback
// Represents a single customer review (score + comment)
// -------------------------------------------------------
class Feedback {

    // Private attributes - only accessible through getters
    private int score;
    private String comment;

    // Constructor - called when creating a new Feedback object
    public Feedback(int score, String comment) {
        this.score   = score;
        this.comment = comment;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Getter for comment
    public String getComment() {
        return comment;
    }
}


// -------------------------------------------------------
// CLASS 2: Analyzer
// Processes an array of Feedback objects
// -------------------------------------------------------
class Analyzer {

    // Method to calculate average score from feedback array
    public double calculateAverage(Feedback[] feedbacks) {
        int total = 0;
        for (Feedback f : feedbacks) {
            total += f.getScore();
        }
        return (double) total / feedbacks.length;
    }

    // Method to categorize sentiment using switch-case
    public String categorizeSentiment(double avg) {
        int rounded = (int) Math.round(avg);   // e.g. 4.2 becomes 4

        switch (rounded) {
            case 5:
                return "Excellent";
            case 4:
                return "Good";
            case 3:
                return "Average";
            case 2:
            case 1:
                return "Poor";
            default:
                return "Invalid Score";
        }
    }

    // BONUS: Count positive reviews (score 4 or 5)
    public int countPositive(Feedback[] feedbacks) {
        int count = 0;
        for (Feedback f : feedbacks) {
            if (f.getScore() >= 4) count++;
        }
        return count;
    }

    // BONUS: Count negative reviews (score 1 or 2)
    public int countNegative(Feedback[] feedbacks) {
        int count = 0;
        for (Feedback f : feedbacks) {
            if (f.getScore() <= 2) count++;
        }
        return count;
    }

    // BONUS: Display all feedback entries
    public void displayAllFeedback(Feedback[] feedbacks) {
        System.out.println("\n  --- All Feedback Entries ---");
        for (int i = 0; i < feedbacks.length; i++) {
            System.out.println("  [" + (i + 1) + "] Score: " + feedbacks[i].getScore()
                    + "  |  Comment: " + feedbacks[i].getComment());
        }
    }
}


// -------------------------------------------------------
// CLASS 3: Main
// Entry point of the program
// -------------------------------------------------------
public class CustomerFeedbackSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask how many feedback entries
        System.out.print("\n  How many feedback entries do you want to enter? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Step 2: Create array of Feedback objects
        Feedback[] feedbacks = new Feedback[n];

        // Step 3: Take input from user
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("  Enter score for feedback " + (i + 1) + " (1 to 5): ");
            int score = scanner.nextInt();
            scanner.nextLine();
            System.out.print("  Enter comment for feedback " + (i + 1) + ": ");
            String comment = scanner.nextLine();
            feedbacks[i] = new Feedback(score, comment);
            System.out.println();
        }

        // Step 4: Create Analyzer object and process
        Analyzer analyzer = new Analyzer();

        double average   = analyzer.calculateAverage(feedbacks);
        String sentiment = analyzer.categorizeSentiment(average);
        int positive     = analyzer.countPositive(feedbacks);
        int negative     = analyzer.countNegative(feedbacks);

        // Step 5: Display all feedback entries (BONUS)
        analyzer.displayAllFeedback(feedbacks);

        // Step 6: Display results
        System.out.println();
        System.out.println("  ==========================================");
        System.out.println("      CUSTOMER FEEDBACK ANALYSIS REPORT     ");
        System.out.println("  ==========================================");
        System.out.printf ("      Total Feedback Entries : %d%n", n);
        System.out.printf ("      Average Rating         : %.2f / 5.00%n", average);
        System.out.printf ("      Customer Sentiment     : %s%n", sentiment);
        System.out.printf ("      Positive Reviews       : %d%n", positive);
        System.out.printf ("      Negative Reviews       : %d%n", negative);
        System.out.println("  ==========================================");

        scanner.close();
    }
}   