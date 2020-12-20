public class StringHelper {
    public static String splitTextIntoLines(String text, String pattern) {
        return text.replaceAll(pattern, "\n");
    }

    public static String convertStringToPattern(String text, String pattern, String replacement) {
        return text.replaceAll(pattern, replacement);
    }
}