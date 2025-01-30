public class CharsetChecker {
    public static void main(String[] args) {
        String input = "UMv+}.9Z12*beH1UkI–xQZmz{";
        boolean isISO8859_1 = input.chars().allMatch(c -> c <= 255);

        if (isISO8859_1) {
            System.out.println("Все символы строки соответствуют кодировке ISO 8859-1.");
        } else {
            System.out.println("Некоторые символы строки не входят в диапазон ISO 8859-1.");
        }
    }
}