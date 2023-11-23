package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
         if(numberToGoUntil<toBreakWith){
            System.out.println("iterating till the end");
        }
        for(int counter=0;counter<=toBreakWith;counter++){
            System.out.println(counter);
            if (counter>=numberToGoUntil){
                break;
            }
        }

    }
}
