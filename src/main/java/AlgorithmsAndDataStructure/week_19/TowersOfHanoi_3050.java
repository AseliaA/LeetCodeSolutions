package AlgorithmsAndDataStructure.week_19;

public class TowersOfHanoi_3050 {
    public static void main(String[] args) {
        hanoi(3, 1, 3);
    }

    public static void hanoi(int n, int from, int to) {
        if (n == 0) return;

        int aux = (1 + 2 + 3) - (from + to);
        hanoi(n - 1, from, aux);
        System.out.println(n + " " + from + " " + to);
        hanoi(n - 1, aux, to);
    }
}
