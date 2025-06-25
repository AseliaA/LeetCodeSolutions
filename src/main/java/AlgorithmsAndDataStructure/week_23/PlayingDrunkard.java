package AlgorithmsAndDataStructure.week_23;

import java.util.*;

//3
public class PlayingDrunkard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter enter players cards");
        String player1Deck = sc.nextLine();
        String player2Deck = sc.nextLine();

        System.out.println(drunkard(player1Deck, player2Deck));
    }

    public static String drunkard(String player1Deck, String player2Deck) {
        Deque<Integer> p1 = new ArrayDeque<>();
        Deque<Integer> p2 = new ArrayDeque<>();
        for (String card : player1Deck.split(" ")) {
            p1.offerLast(Integer.parseInt(card));
        }

        for (String card : player2Deck.split(" ")) {
            p2.offerLast(Integer.parseInt(card));
        }

        int moves = 0;

        while (!p1.isEmpty() && !p2.isEmpty() && moves != 1000000) {
            int player1Card = p1.removeFirst();
            int player2Card = p2.removeFirst();

            boolean player1Wins;
            if (player1Card == 0 && player2Card == 9) {
                player1Wins = true;
            } else if (player1Card == 9 && player2Card == 0) {
                player1Wins = false;
            } else {
                player1Wins = player1Card > player2Card;
            }

            if (player1Wins) {
                p1.offerLast(player1Card);
                p1.offerLast(player2Card);
            } else {
                p2.offerLast(player2Card);
                p2.offerLast(player1Card);
            }
            moves++;
        }
        if (moves == 1000000) return "botva";
        return p2.isEmpty() ? "first " + moves : "second " + moves;
    }
}
