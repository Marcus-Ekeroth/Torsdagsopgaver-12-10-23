package Task2;
public class Cinema {
    String[][] seats1;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        //byt om på instantiering og tildeling af X
        // tildel sæderne O
        this.seats1 = new String[rows][seats];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < seats; j++){
                this.seats1[i][j] = "O";
            }

        }
        this.seats1[0][0] = "X";


    }

    public int getRows() {
        return seats1.length;
    }

    public int getSeats() {
        return seats1[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        //Siden indeksen er 1 mindre end størrelsen på arrayet, skal vi trække 1 fra vores inputs i parametrene
        if (seats1[row-1][seat-1].equals("O")) {
            seats1[row-1][seat-1] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats1[row-1][seat-1].equals("X")) {
            seats1[row-1][seat-1] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        //Skift null til tom string
        String result = "";
        for (int i = 0; i < seats1.length; i++) {
            result += "|";
            for (int j = 0; j < seats1[i].length; j++) {
                result += seats1[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}