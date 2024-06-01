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
}
```