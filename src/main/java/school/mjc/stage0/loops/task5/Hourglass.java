package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int sp = 0;
        int st = height;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= sp; j++) {
                    System.out.print(" ");
                }
            for (int j = 1; j <= st; j++) {
                System.out.print("8");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            if (height % 2 != 0 && i <= height / 2 || 
                height % 2 == 0 && i < height / 2){
                st -= 2;
                sp++;
            } else if ( i > height / 2 && i <= height) {
                st += 2;
                sp--;
            }
            System.out.println();
        }
    }
}
