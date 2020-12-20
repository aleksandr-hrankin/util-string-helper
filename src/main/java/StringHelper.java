public class StringHelper {
    private String text;

    public StringHelper(String text) {
        this.text = text;
    }

    public StringHelper splitTextIntoLines(String pattern) {
        text = text.replaceAll(pattern, "\n");
        return this;
    }

    public StringHelper convertStringToPattern(String pattern, String replacement) {
        text = text.replaceAll(pattern, replacement);
        return this;
    }

    public String getText() {
        return text;
    }
}
