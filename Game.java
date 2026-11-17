
public class Game {

    static String sportName = "Basketball";
    static int gamesPlayed = 0;

    public void updateScore(Team team, int points) {
        team.addPoints(points);
    }


    public static void findWinner(Team team1, Team team2) {

        if (team1.score > team2.score) {
            System.out.println("Winner: " + team1.name);

        } else if (team2.score > team1.score) {
            System.out.println("Winner: " + team2.name);

        } else {
            System.out.println("The game is a tie!");
        }
    }
}

