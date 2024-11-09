package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tournament {
    private String name;                // Nome del torneo
    private Date deadline;              // Data di scadenza per le iscrizioni
    private List<Player> registeredPlayers;  // Lista dei giocatori iscritti
    private List<Match> matches;        // Lista delle partite

    // Costruttore
    public Tournament(String name, Date deadline) {
        this.name = name;
        this.deadline = deadline;
        this.registeredPlayers = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public List<Player> getRegisteredPlayers() {
        return registeredPlayers;
    }

    public List<Match> getMatches() {
        return matches;
    }

    // Metodi per la gestione del torneo

    // Aggiunge un giocatore al torneo, se non ha superato la deadline
    public boolean registerPlayer(Player player) {
        if (new Date().before(deadline)) {
            registeredPlayers.add(player);
            return true;
        } else {
            System.out.println("Registration deadline has passed.");
            return false;
        }
    }

    // Crea le partite del torneo organizzando i giocatori
    public void createMatches() {
        for (int i = 0; i < registeredPlayers.size(); i += 2) {
            if (i + 1 < registeredPlayers.size()) {
                Match match = new Match(registeredPlayers.get(i), registeredPlayers.get(i + 1));
                matches.add(match);
            } else {
                System.out.println("Odd number of players, last player automatically advances.");
                // Gestisci il caso del giocatore senza avversario (avanza al turno successivo)
            }
        }
    }

    // Stampa il riepilogo del torneo
    public void displayTournamentInfo() {
        System.out.println("Tournament: " + name);
        System.out.println("Registration Deadline: " + deadline);
        System.out.println("Registered Players: " + registeredPlayers.size());
        System.out.println("Number of Matches: " + matches.size());
    }

    @Override
    public String toString() {
        return "Tournament{name='" + name + "', deadline=" + deadline +
                ", registeredPlayers=" + registeredPlayers +
                ", matches=" + matches + '}';
    }
}
