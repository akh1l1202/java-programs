class Player {
    String name;
    int runs;
    int matches;

    // Constructor
    Player(String name, int runs, int matches) {
        this.name = name;
        this.runs = runs;
        this.matches = matches;
    }

    // Method to calculate average runs per match
    double getAverage() {
        if (matches == 0) {
            return 0.0;
        }
        return (double) runs / matches;
    }

    // Method to compare averages and return player with better average
    Player betterAverage(Player p) {
        if (this.getAverage() >= p.getAverage()) {
            return this;
        } else {
            return p;
        }
    }

    // Method to display player details
    void display() {
        System.out.println("Name: " + name + ", Runs: " + runs + ", Matches: " + matches + ", Average: " + getAverage());
    }
}

public class CricketStats {
    public static void main(String[] args) {
        Player player1 = new Player("Virat", 5000, 100);
        Player player2 = new Player("Rohit", 4500, 80);

        System.out.println("Player 1:");
        player1.display();

        System.out.println("\nPlayer 2:");
        player2.display();

        Player better = player1.betterAverage(player2);
        System.out.println("\nPlayer with better average:");
        better.display();
    }
}
