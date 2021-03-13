//Who remembers back to their time in the schoolyard,
//when girls would take a flower and tear its petals,
//saying each of the following phrases each time a petal was torn:
//
//I love you
//a little
//a lot
//passionately
//madly
//not at all
//When the last petal was torn there were cries of
//excitement, dreams, surging thoughts and emotions.
//
//Your goal in this kata is to determine which phrase the
//girls would say for a flower of a given number of petals, where nb_petals > 0.

public class Sid {

    private static String[] words = new String[]{"I love you", "a little", "a lot",
            "passionately", "madly", "not at all"};

    public static String howMuchILoveYou(int nb_petals) {
        String res = "";
        int i = 0;
        while (nb_petals > 0) {
            res = words[i];
            nb_petals--;
            i++;
            if (i == 6) i = 0;
        }
        return res;
    }
}