package AlgorithmsAndDataStructure.week_18;

public class StringCompression_443_Medium {
    public static void main(String[] args) {

    }

    public static int compress(char[] chars) {
        int n = chars.length;

        int streakStart = 0;
        int indexAnswer = 0;
        while (streakStart < n) {
            char currentChar = chars[streakStart];

            int streakEnd = streakStart;
            int count = 1;
            while (streakEnd + 1 < n && chars[streakEnd + 1] == currentChar) {
                streakEnd++;
                count++;
            }

            chars[indexAnswer] = currentChar;
            indexAnswer++;

            if (count > 1) {
                char[] countChars = Integer.toString(count).toCharArray();
                for (char digit : countChars) {
                    chars[indexAnswer++] = digit;
                }
            }
            streakStart = streakEnd + 1;
        }
        return indexAnswer;
    }
}