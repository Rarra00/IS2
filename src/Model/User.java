
package Model;
public class User {
    private String firstName;
    private String lastName;
    private int phone;
    private String email;
    private String username;
    private String password;

    // Costruttore di default
    public User() {
        this.firstName = "";
        this.lastName = "";
        this.phone = 0;
        this.email = "";
        this.username = "";
        this.password = "";
    }

    // Costruttore con parametri
    public User(String firstName, String lastName, int phone, String email, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    // Getter e Setter per firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter e Setter per lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter e Setter per phone
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    // Getter e Setter per email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter e Setter per username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter e Setter per password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Metodo toString() per visualizzare le informazioni dell'utente
    @Override
    public String toString() {
        return "User {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    // Metodo per validare l'email
    public boolean isValidEmail() {
        return email != null && email.contains("@") && email.contains(".");
    }

    // Metodo per verificare la password (può essere usato per autenticazione)
    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    // Metodo per cambiare la password (con una semplice validazione)
    public boolean changePassword(String oldPassword, String newPassword) {
        if (checkPassword(oldPassword) && newPassword.length() >= 6) {
            this.password = newPassword;
            return true;
        }
        return false;
    }
}

