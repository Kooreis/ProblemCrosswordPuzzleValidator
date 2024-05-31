Here is a simple console application in Java that validates a crossword puzzle. This application assumes that a valid crossword puzzle is a square grid with the same number of rows and columns, and that all words are at least two letters long and are separated by a '#' character.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the crossword puzzle:");
        int size = scanner.nextInt();
        scanner.nextLine();

        char[][] crossword = new char[size][size];
        System.out.println("Enter the crossword puzzle, line by line:");
        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < size; j++) {
                crossword[i][j] = line.charAt(j);
            }
        }

        if (isValidCrossword(crossword)) {
            System.out.println("The crossword puzzle is valid.");
        } else {
            System.out.println("The crossword puzzle is not valid.");
        }
    }

    private static boolean isValidCrossword(char[][] crossword) {
        int size = crossword.length;

        for (int i = 0; i < size; i++) {
            int horizontalWordLength = 0;
            int verticalWordLength = 0;

            for (int j = 0; j < size; j++) {
                if (crossword[i][j] != '#') {
                    horizontalWordLength++;
                } else if (horizontalWordLength > 0 && horizontalWordLength < 2) {
                    return false;
                } else {
                    horizontalWordLength = 0;
                }

                if (crossword[j][i] != '#') {
                    verticalWordLength++;
                } else if (verticalWordLength > 0 && verticalWordLength < 2) {
                    return false;
                } else {
                    verticalWordLength = 0;
                }
            }

            if ((horizontalWordLength > 0 && horizontalWordLength < 2) ||
                (verticalWordLength > 0 && verticalWordLength < 2)) {
                return false;
            }
        }

        return true;
    }
}
```

This application first reads the size of the crossword puzzle from the user, then reads each line of the puzzle. It then checks if the puzzle is valid by ensuring that all words are at least two letters long. If the puzzle is valid, it prints "The crossword puzzle is valid." If the puzzle is not valid, it prints "The crossword puzzle is not valid."