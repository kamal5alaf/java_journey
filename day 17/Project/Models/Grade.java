public class Grade {

    private String examName;
    private double score;

    public void setExamName(String examName) {
        this.examName = examName;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public String getExamName() {
        return examName;
    }
    public double getScore() {
        return score;
    }

    public Grade(String examName, double score) {
        this.examName = examName;
        if (score < 0 || score > 100) {
            throw new IndexOutOfBoundsException("Score must be between 0 and 100");
        }
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "examName='" + examName + '\'' +
                ", score=" + score +
                '}';
    }
}
