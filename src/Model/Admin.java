package Model;

import java.util.Arrays;
import java.util.List;

public class Admin extends User {
    private int adminId;
    private String role;  // es. "Super Admin", "Tournament Admin"
    private List<String> permissions; // Permessi specifici per l'admin

    // Costruttore di default
    public Admin() {
        this.adminId = 0;
        this.role = "Admin";
        this.permissions = Arrays.asList("VIEW_PLAYERS", "EDIT_PLAYERS", "CREATE_TOURNAMENT", "DELETE_TOURNAMENT");

    }

    // Costruttore parametrico
    public Admin(int adminId, String firstName, String lastName, int phone, String email, String username, String password, String role, List<String> permissions) {
        super(firstName, lastName, phone, email, username, password); // Richiama il costruttore della classe User
        this.adminId = adminId;
        this.role = role;
        this.permissions = permissions;
    }

    // Getter e Setter per adminId
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    // Getter e Setter per role
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Getter e Setter per permissions
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    // Metodo per aggiungere un permesso
    public void addPermission(String permission) {
        if (!permissions.contains(permission)) {
            permissions.add(permission);
        }
    }

    // Metodo per rimuovere un permesso
    public void removePermission(String permission) {
        permissions.remove(permission);
    }

    // Metodo toString per visualizzare i dettagli dell'admin
    @Override
    public String toString() {
        return "Admin {" +
                "adminId=" + adminId +
                ", role='" + role + '\'' +
                ", permissions=" + permissions +
                ", firstName=" + getFirstName() +
                ", lastName=" + getLastName() +
                ", email=" + getEmail() +
                ", username=" + getUsername() +
                '}';
    }
}
