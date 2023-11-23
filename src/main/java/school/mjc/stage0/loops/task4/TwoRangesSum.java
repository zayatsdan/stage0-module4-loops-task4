package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum=0;
        int skipSum=0;
        if (lastInRow<0) {
            System.out.println("last number in row is negative");
        } else if(lastInRow<numberToSkip){
            System.out.println("number to skip is bigger then the last");
        } else {
            for (int counter = 0; counter <= lastInRow; counter++) {
                if (counter > numberToSkip) {
                    skipSum = skipSum + counter;
                    continue;
                }
                sum = sum + counter;
            }
            System.out.println("skipped sum is "+skipSum);
            System.out.println("counted sum is "+sum);

        }

    }
}
