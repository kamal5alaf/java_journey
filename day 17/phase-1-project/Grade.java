public class Grade {
    private String examName;
    private double score;

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Grade(String examName, double score) {
        this.examName = examName;
        try {
            if (score < 0 || score > 100) this.score = score;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
