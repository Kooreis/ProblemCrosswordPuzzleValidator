char[][] crossword = new char[size][size];
        System.out.println("Enter the crossword puzzle, line by line:");
        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < size; j++) {
                crossword[i][j] = line.charAt(j);
            }
        }