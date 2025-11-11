public class Q17_GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {10, null, 25, 30, null, 15};
        int notPlayed = 0;
        int total = 0;
        for (Integer s : scores) {
            if (s == null) notPlayed++;
            else total += s;
        }
        System.out.println("Not played: " + notPlayed);
        System.out.println("Total: " + total);
    }
}
