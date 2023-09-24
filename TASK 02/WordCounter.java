public class WordCounter {
    public static void main(String[] args) {
        String paragraph = "This is a sample paragraph for testing the word counter.\n\nThis is another paragraph.";

        int wordCount = countWords(paragraph);
        int charCount = countCharacters(paragraph);
        int paraCount = countParagraphs(paragraph);

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of paragraphs: " + paraCount);
    }

    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    public static int countCharacters(String text) {
        return text.length();
    }

    public static int countParagraphs(String text) {
        String[] paragraphs = text.split("\\n\\s*\\n");
        return paragraphs.length;
    }
}