public class Occurrences {

    public static void main(String[] args) {
        System.out.println(occurrences());
    }

    public static int occurrences() {

        String str = "BBAaaaac";
        int counterA = 0;
        int counterB = 0;
        for (int i = 0; i < str.length(); i++) {
            String str1 = str.substring(i, i + 1);
            if (str1.equalsIgnoreCase("a")) {
                counterA++;
            } else if (!str1.equalsIgnoreCase("a") && !str1.equalsIgnoreCase("b")) {
                System.out.println("Wrong Word");
                break;

            } else {
                counterB++;
            }


        }
        return Math.abs(counterA - counterB);

    }

}

