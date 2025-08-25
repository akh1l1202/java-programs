import java.util.*;

public class jagged {
    public static float avg(int[] data) {
        int sum = 0;
        for (int i=0;i<data.length;i++) {
            sum+=data[i];
        }

        return (float)sum/data.length;

    }
    public static void main(String[] args) {

        int players;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        players = s.nextInt();
    
        int[][] data=new int[players][];

       for (int i=0;i<players;i++) {
            System.out.print("Enter number of matches played by Player "+(i+1)+": ");
            int matches=s.nextInt();
            data[i]=new int[matches];

            for (int j=0;j<matches;j++) {
                System.out.printf("Enter runs scored by Player %d in Match %d: ",i+1,j+1);
                data[i][j]=s.nextInt();
            }
        }
        System.out.println();

        for (int i=0;i<players;i++) {
            System.out.printf("Runs scored by Player %d: ",i+1);
            for (int j=0;j<data[i].length;j++) {
                System.out.print(data[i][j]+" ");
            }

            System.out.printf("\nAverage score of Player %d: %f\n\n",i+1,avg(data[i]));
        }

      
    }
}