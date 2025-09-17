public class Jagged2D {
    public static void main(String[] args) {
        int[][] arr1=new int[3][];
        arr1[0]=new int[4];
        arr1[1]=new int[3];
        arr1[2]=new int[2];

        int[][] arr2=new int[2][];
        arr2[0]=new int[3];
        arr2[1]=new int[4];

        int val= 2; // entering random data to display
        for (int i=0;i<arr1.length;i++) {
            for (int j=0;j<arr1[i].length;j++) {
                val+=2;
                arr1[i][j] = val;
            }
        }
        for (int i=0;i<arr2.length;i++) {
            for (int j=0;j<arr2[i].length;j++) {
                val+=2;
                arr2[i][j] = val;
            }
        }

        System.out.println("First 2D Jagged Array:");
        for (int i=0;i<arr1.length;i++) {
            for (int j=0;j<arr1[i].length;j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\nSecond 2D Jagged Array:");
        for (int i=0;i<arr2.length;i++) {
            for (int j=0;j<arr2[i].length;j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
