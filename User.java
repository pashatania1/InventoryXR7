public class User {
    int id_user;
    String nama_user;
    String role;
    String username;
    String password;

    public User() {
        id_user = 1;
        nama_user = "Adi";
        role = "Admin";
        username = "adi";
        password = "adi123";
    }

    public User(int id_user, String nama_user, String role, String username, String password) {
        this.id_user = id_user;
        this.nama_user = nama_user;
        this.role = role;
        this.username = username;
        this.password = password;
    }
}
