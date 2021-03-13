//What could be easier than comparing integer numbers?
//However, the given piece of code doesn't recognize some of the special numbers
//for a reason to be found. Your task is to find the bug and eliminate it.
public class HowDoICompare {
    public static String whatIs(Integer x) {
        if (x == 42)
            return "everything";
        if (x == 42 * 42)
            return "everything squared";
        return "nothing";
    }
}