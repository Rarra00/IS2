package Model;
import java.util.List;

import java.util.List;

public class Player extends User {
    private int globalRankPoints;
    private List<Tournament> tournaments;
    private int id;
    private String name;
    private String surname;
    private String team;
    private int match;
    private int points;

    // Costruttore di default
    public Player() {
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.team = "";
        this.match = 0;
        this.points = 0;
        this.globalRankPoints = 0;
    }

    // Costruttore con parametri
    public Player(int id, String name, String surname, String team, int match, int points, int globalRankPoints, List<Tournament> tournaments) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.team = team;
        this.match = match;
        this.points = points;
        this.globalRankPoints = globalRankPoints;
        this.tournaments = tournaments;
    }

    // Getter e Setter per id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter e Setter per name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter e Setter per surname
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Getter e Setter per team
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    // Getter e Setter per match
    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    // Getter e Setter per points
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    // Getter e Setter per globalRankPoints
    public int getGlobalRankPoints() {
        return globalRankPoints;
    }

    public void setGlobalRankPoints(int globalRankPoints) {
        this.globalRankPoints = globalRankPoints;
    }

    // Getter e Setter per tournaments
    public List<Tournament> getTournaments() {
        return tournaments;
    }

    public void setTournaments(List<Tournament> tournaments) {
        this.tournaments = tournaments;
    }

    // Metodo toString per visualizzare i dettagli del giocatore
    @Override
    public String toString() {
        return "Player {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", team='" + team + '\'' +
                ", match=" + match +
                ", points=" + points +
                ", globalRankPoints=" + globalRankPoints +
                ", tournaments=" + tournaments +
                '}';
    }
}
