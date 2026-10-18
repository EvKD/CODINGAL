
class WordMatch {
    private String secret;

    // Constructor
    public WordMatch(String word) {
        secret = word;
    }

    // Part (a): Calculate the score
    public int scoreGuess(String guess) {
        int count = 0;

        // Count overlapping occurrences
        for (int i = 0; i <= secret.length() - guess.length(); i++) {
            if (secret.substring(i, i + guess.length()).equals(guess)) {
                count++;
            }
        }

        // Score = occurrences × length squared
        return count * guess.length() * guess.length();
    }

    // Part (b): Find the better guess
    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);

        if (score1 > score2) {
            return guess1;
        } else if (score2 > score1) {
            return guess2;
        } else {
            // If scores are equal, return alphabetically greater guess
            if (guess1.compareTo(guess2) > 0) {
                return guess1;
            } else {
                return guess2;
            }
        }
    }

    // Main method to test the program
    public static void main(String[] args) {
        WordMatch game = new WordMatch("mississippi");

        System.out.println(game.scoreGuess("i"));       // 4
        System.out.println(game.scoreGuess("iss"));     // 18
        System.out.println(game.scoreGuess("issipp"));  // 36
        System.out.println(game.scoreGuess("mississippi")); // 121

        System.out.println(game.findBetterGuess("iss", "i"));
    }
}
