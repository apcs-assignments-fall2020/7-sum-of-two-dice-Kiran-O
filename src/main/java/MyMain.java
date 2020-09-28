import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int gba;
        gba = (int) (Math.random()*6) +1;
        return gba;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int gba, qwe, ynk;
        int[] goba = new int [12];
        for (int k = 0;  k < n; k++){
            gba = rollDie();
            qwe = rollDie();
            ynk = gba + qwe;
            goba[ynk-2] += 1;


        }


        return goba;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many rolls would you like to commit?");
        String gooba = scan.next();
        int n = Integer.parseInt(gooba);
        int[] m = sumOfTwoDice(n);
        int walue;

        for (int k = 0; k < m.length; k++){
            walue = k + 2;
            System.out.println(m[k] + walue);

        }
        scan.close();



    }
}
