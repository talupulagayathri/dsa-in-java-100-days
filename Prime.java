import java.util.ArrayList;

class Prime{//using ArrayList

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            a.add(i);
        }

        ArrayList<Integer> primeList = new ArrayList<>();

        for (int x : a) {
            if (isPrime(x)) {
                primeList.add(x);
            }
        }

        System.out.println(primeList);
    }
}