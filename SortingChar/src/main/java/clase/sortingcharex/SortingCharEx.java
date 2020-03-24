public class SortingCharEx {

    public static void main(String args[]) {
        char temp;
        String sortedStr = "";
        String input = "When not studying nuclear physics, Bambi likes to play beach volleyball.";
        input = input.replaceAll("\\p{Punct}", "");
        // I used repalceAll("\\p{Punct}", "") to delete any punctuations.
        input = input.toLowerCase();
        // I used toLowerCase to convert every upperCase to lowerCase.

        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            for (int j = 0; j < charArray.length; j++) {

                if (charArray[i] < charArray[j]) {
                    temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;

                }
            }
        }

        for (int k = 0; k < charArray.length; k++) {
            sortedStr = sortedStr + charArray[k];
        }

        System.out.println("Hey Dr x, this is your block text with letters in sorted :" + sortedStr);
    }

}
