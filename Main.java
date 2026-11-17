import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter Team 1 name: ");
        String name1 = input.nextLine();

        System.out.print("Enter Team 2 name: ");
        String name2 = input.nextLine();


        Team team1 = new Team(name1);
        Team team2 = new Team(name2);


        Game game = new Game();

        Game.gamesPlayed++;


        for (int quarter = 1; quarter <= 4; quarter++) {

            System.out.println("\nQuarter " + quarter);

            System.out.print(team1.name + " points: ");
            int points1 = input.nextInt();

            System.out.print(team2.name + " points: ");
            int points2 = input.nextInt();

            game.updateScore(team1, points1);
            game.updateScore(team2, points2);
        }


        System.out.println("\n===== FINAL SCOREBOARD =====");
        System.out.println("Sport: " + Game.sportName);

        team1.showScore();
        team2.showScore();


        Game.findWinner(team1, team2);

        System.out.println("Games played: " + Game.gamesPlayed);

        input.close();
    }
}
