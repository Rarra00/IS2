package Model;

public class Match{
    private int idPlayer1;
    private int idPlayer2;
    //Number of the match
    private int idMatch;
    private int score;


    public Match(){
        this.idPlayer1 = 0;
        this.idPlayer2 = 0;
        this.idMatch = 0;
        this.score = 0;
    }

    // Costruttore con parametri
    public Match(int idPlayer1, int idPlayer2, int idMatch, int score) {
        this.idPlayer1 = idPlayer1;
        this.idPlayer2 = idPlayer2;
        this.idMatch = idMatch;
        this.score = score;
    }

    // Getter e Setter per idPlayer1
    public int getIdPlayer1() {
        return idPlayer1;
    }

    public void setIdPlayer1(int idPlayer1) {
        this.idPlayer1 = idPlayer1;
    }

    // Getter e Setter per idPlayer2
    public int getIdPlayer2() {
        return idPlayer2;
    }

    public void setIdPlayer2(int idPlayer2) {
        this.idPlayer2 = idPlayer2;
    }

    // Getter e Setter per idMatch
    public int getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }

    // Getter e Setter per score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Metodo toString() per stampare le informazioni del match
    @Override
    public String toString() {
        return "Match {" +
                "idPlayer1=" + idPlayer1 +
                ", idPlayer2=" + idPlayer2 +
                ", idMatch=" + idMatch +
                ", score=" + score +
                '}';
    }
}
