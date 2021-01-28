public class Main {
    public static void main(String[] args) {
        String s = "Once but upon a time a Wolf was lapping at a spring but on a hillside, when, " +
                "looking up, what should he see but a wolf Lamb just beginning to drink a little lower down.";

        StringCollection sc = new StringCollection();
        System.out.println(sc.displayingWordsAlphabeticallyAndNumberTheirOccurrences(s));
    }
}
