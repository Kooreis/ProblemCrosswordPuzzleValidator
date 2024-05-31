Here is a simple console application in C# that validates a crossword puzzle. This application assumes that a valid crossword puzzle is a square grid with the same number of rows and columns, and that all words are at least two letters long and are separated by a space or the edge of the grid.

```C#
using System;
using System.Linq;

class Program
{
    static void Main()
    {
        string[,] crossword = new string[5, 5]
        {
            { "a", "b", "c", "d", "e" },
            { "f", "g", "h", "i", "j" },
            { "k", "l", "m", "n", "o" },
            { "p", "q", "r", "s", "t" },
            { "u", "v", "w", "x", "y" }
        };

        bool isValid = ValidateCrossword(crossword);
        Console.WriteLine(isValid ? "Valid" : "Invalid");
    }

    static bool ValidateCrossword(string[,] crossword)
    {
        int size = crossword.GetLength(0);

        if (size != crossword.GetLength(1))
        {
            return false;
        }

        for (int i = 0; i < size; i++)
        {
            string row = string.Join("", Enumerable.Range(0, size).Select(x => crossword[i, x]));
            string column = string.Join("", Enumerable.Range(0, size).Select(x => crossword[x, i]));

            if (!ValidateLine(row) || !ValidateLine(column))
            {
                return false;
            }
        }

        return true;
    }

    static bool ValidateLine(string line)
    {
        string[] words = line.Split(' ');

        return words.All(word => word.Length >= 2);
    }
}
```

This application first checks if the crossword puzzle is a square. Then, it checks each row and column to see if they contain valid words. A valid word is defined as a string of two or more characters. If all rows and columns contain valid words, the crossword puzzle is valid.