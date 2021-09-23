import java.util.Scanner;

public class pi {

    public static void main(String[] args) {
        int total=0;
        int circle=0;
        Scanner sc = new Scanner(System.in);
        int numberOfDots = enter(sc,"How many points do you want to donate? -> ");
        double[][] xyArray = randomNum(numberOfDots);
        for (int i=0;i<numberOfDots;i++){
            if (1>=Math.hypot(xyArray[0][i],xyArray[1][i])) {
                circle++;
            }
            total++;
        }
        double calPi = (double) 4*circle/total;
        System.out.println("Pi is: " + calPi + " ?");
        System.out.println("Pi is: " + Math.PI);
        System.out.println("Difference is: " + Math.abs(Math.PI-calPi));
    }

    private static double[][] randomNum(int iteration) {
        double[][] xyArray = new double[2][iteration];

        for(int i=0;i<2;i++) {
            for (int j=0;j<iteration;j++){
                xyArray[i][j] = Math.random();
            }
        }
        return xyArray;
    }
    
    public static int enter(Scanner sc, String text) {
        System.out.print(text);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            String trash = sc.nextLine();
            System.out.println("Input failed to include an integer and I am angry\n");
            return enter(sc, text);
        }

    }

}
