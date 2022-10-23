package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int hundreds = (int)(number/100);
        int remaining = number-100*hundreds;
        int dec = (int)(remaining /10);
        remaining -= 10*dec;
        int reversed = 100*remaining + 10*dec + hundreds;
        System.out.println(reversed);
    }
}
