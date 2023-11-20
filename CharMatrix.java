public class CharMatrix {
    char[][] arr;

    public CharMatrix(int rows, int cols) {
        arr = new char[rows][cols];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j]=' ';
            }
        }
    }

    public CharMatrix(int rows, int cols, char fill) {
        arr = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < cols; k++) {
                arr[i][k] = fill;
            }
        }
    }

    public void display() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }


    }

    public int numRows() {
        return arr.length;
    }

    public int numCols() {
        return arr[0].length;
    }

    public char charAt(int row, int col) {
        return arr[row][col];
    }

    public void setCharAt(int row, int col, char ch) {
        arr[row][col] = ch;
    }

    public boolean isEmpty(int row, int col) {
        if (arr[row][col] == (' ')) {
            return true;
        } else {
            return false;
        }
    }

    public void fillRect(int row0, int col0, int row1, int col1, char fill) {
        for (int row = row0; row <= row1; row++) {
            for (int col = col0; col <= col1; col++) {
                arr[row][col] = fill;
            }
        }
    }

    public void clearRect(int row0, int col0, int row1, int col1) {
        for (int row = row0; row <= row1; row++){
            for (int col = col0; col <= col1; col++) {
                arr[row][col] = ' ';
            }
        }
    }

    public int countInRow(int row) {
        int total = 0;
        for (int i = 0; i < arr[row].length; i++) {
            if (arr[row][i] != ' ') {
                total++;
            }
        }
        return total;
    }

    public int countInCol(int col) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] != ' ') {
                total++;
            }

        }
        return total;
    }
}