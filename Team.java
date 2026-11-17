public class Team {

    String name;
    int score;

    public Team(String name) {
        this.name = name;
        this.score = 0;
    }
    public void addPoints(int points) {
        score = score + points;
    }
    public void showScore() {
        System.out.println(name + ": " + score);
    }
}

