Here is a simple Python console application that validates a crossword puzzle. This application assumes that a valid crossword puzzle is a square grid with the same number of rows and columns, and each cell contains only a single character.

```python
def is_valid_crossword(crossword):
    n = len(crossword)
    for row in crossword:
        if len(row) != n:
            return False
        for cell in row:
            if not cell.isalpha():
                return False
    return True

def main():
    crossword = []
    size = int(input("Enter the size of the crossword: "))
    print("Enter the crossword row by row:")
    for _ in range(size):
        row = input()
        crossword.append(list(row))
    if is_valid_crossword(crossword):
        print("The crossword is valid.")
    else:
        print("The crossword is not valid.")

if __name__ == "__main__":
    main()
```

This application first asks the user to input the size of the crossword, then to input each row of the crossword one by one. It then checks if the crossword is valid by calling the `is_valid_crossword` function, which checks if the crossword is a square and if each cell contains only a single character. If the crossword is valid, it prints "The crossword is valid.", otherwise it prints "The crossword is not valid.".