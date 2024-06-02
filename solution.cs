```C#
static bool ValidateCrossword(string[,] crossword)
{
    int size = crossword.GetLength(0);

    if (size != crossword.GetLength(1))
    {
        return false;
    }
}
```