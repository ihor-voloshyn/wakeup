public class CyrillicHighlighter {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        String text = "CardSVOnline\n" +
                "CardSVOnline.getAccountData\n" +
                "\n" +
                "ClientProfilePT\n" +
                "ClientProfilePT.getAccountStatus\n" +
                "ClientProfilePT.getCardAccountStatus\n" +
                "\n" +
                "AccountLockPT\n" +
                "AccountLockPT.getAccountLocksInfo\n" +
                "\n" +
                "CurrencyPT\n" +
                "CurrencyPT.getCurrentAccountsBalancesByAccountNo\n" +
                "\n" +
                "CurrentAccountPT\n" +
                "CurrentAccountPT.getCurrencyRate";
        highlightCyrillic(text);
    }

    public static void highlightCyrillic(String text) {
        StringBuilder highlightedText = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.UnicodeBlock.of(ch) == Character.UnicodeBlock.CYRILLIC) {
                highlightedText.append(ANSI_RED).append(ch).append(ANSI_RESET);
            } else {
                highlightedText.append(ch);
            }
        }

        System.out.println(highlightedText);
    }
}