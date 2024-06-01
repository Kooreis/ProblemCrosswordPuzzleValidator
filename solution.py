def is_valid_crossword(crossword):
    n = len(crossword)
    for row in crossword:
        if len(row) != n:
            return False
        for cell in row:
            if not cell.isalpha():
                return False
    return True