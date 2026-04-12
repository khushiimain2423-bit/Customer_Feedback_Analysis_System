// Feedback Class
class Feedback {
    private int score;
    private String comment;

    public Feedback(int score, String comment) {
        this.score = score;
        this.comment = comment;
    }

    public int getScore()     { return score;   }
    public String getComment(){ return comment; }
}

// Analyzer Class
class Analyzer {
    public double calculateAverage(Feedback[] feedbacks) {
        int total = 0;
        for (Feedback f : feedbacks) {
            total += f.getScore();
        }
        return (double) total / feedbacks.length;
    }

    public String categorizeSentiment(double avg) {
        int rounded = (int) Math.round(avg);
        switch (rounded) {
            case 5:  return "Excellent";
            case 4:  return "Good";
            case 3:  return "Average";
            case 2:
            case 1:  return "Poor";
            default: return "Unknown";
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Feedback[] feedbacks = {
            new Feedback(5, "Great service!"),
            new Feedback(4, "Good experience."),
            new Feedback(3, "It was okay."),
            new Feedback(2, "Not satisfied.")
        };

        Analyzer analyzer = new Analyzer();
        double avg = analyzer.calculateAverage(feedbacks);
        String sentiment = analyzer.categorizeSentiment(avg);

        System.out.println("Average Score: " + avg);
        System.out.println("Overall Sentiment: " + sentiment);
    }
}