public class Patterns {
    public static void main(String[] args) {

        int n = 4;

        // 1. Square Pattern
        System.out.println("Square Pattern");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2. Right Triangle
        System.out.println("\nRight Triangle");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 3. Reverse Triangle
        System.out.println("\nReverse Triangle");
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 4. Number Pattern
        System.out.println("\nNumber Pattern");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 5. Reverse Number Pattern
        System.out.println("\nReverse Number Pattern");
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 6. Repeated Number Pattern
        System.out.println("\nRepeated Number Pattern");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // 7. Floyd's Triangle
        System.out.println("\nFloyd's Triangle");
        int num = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

        // 8. Alphabet Pattern
        System.out.println("\nAlphabet Pattern");
        for(char i = 'A'; i <= 'D'; i++) {
            for(char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 9. Pyramid
        System.out.println("\nPyramid");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 10. Inverted Pyramid
        System.out.println("\nInverted Pyramid");
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 11. Hollow Square
        System.out.println("\nHollow Square");
        int size = 5;
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                if(i == 1 || i == size || j == 1 || j == size)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // 12. 0-1 Pattern
        System.out.println("\n0-1 Pattern");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        // 13. Diamond Pattern
        System.out.println("\nDiamond Pattern");

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n - 1; i >= 1; i--) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}