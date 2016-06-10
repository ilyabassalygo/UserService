package third.test.model;

/**
 * Created by ILIA on 10.06.2016.
 */
public class User {
    private int idUser;
    private String name;
    private String surname;
    private String role;

    public User() {
    }

    public User(int idUser, String name, String surname, String role) {
        this.idUser = idUser;
        this.name = name;
        this.surname = surname;
        this.role = role;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
