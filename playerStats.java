import java.util.*;

public class playerStats {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int p = s.nextInt();
        s.nextLine();

        Player[] players = new Player[p];
        for (int i=0; i<p; i++) {
            
        }

        
    }
    
}

class Player {
    String name;
    int runs;
    int matches;

    Player(String name, int runs, int matches) {
        this.name = name;
        this.runs = runs;
        this.matches = matches;
    }
    
    int getAverage() {
        int average = runs / matches;
        return average;
    }

    Player betterAverage(Player a) {
        if (this.getAverage() > a.getAverage()) {
            return this;
        }
        else {
            return a;
        }

    }

}
