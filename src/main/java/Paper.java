public class Paper {

    private StringBuilder content = new StringBuilder("");

    public String getText() {
        return content.toString();
    }

    public void write(String text) {
        content.append(text);
    }

    public void erase(String text) {
        int firstLetterIndex = content.lastIndexOf(text);
        int terminatingIndex = firstLetterIndex + text.length();
        String erasedWord = text.replaceAll(".", " ");

        content.replace(firstLetterIndex, terminatingIndex, erasedWord);
    }

    public void insert(String insertedText, int startingIndex) {
        int insertedTextCounter = 0;
        for (int i = startingIndex; i < startingIndex + insertedText.length(); i++) {
            if (content.charAt(i) == ' ') {
                content.replace(i, i + 1, insertedText.substring(insertedTextCounter, insertedTextCounter+1));
            }
            else {
                content.replace(i, i+1, "@");
            }
            insertedTextCounter += 1;
        }
    }
}
