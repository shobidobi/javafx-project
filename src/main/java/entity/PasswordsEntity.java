//package entity;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table(name = "passwords", schema = "public", catalog = "login")
//public class PasswordsEntity {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id")
//    private int id;
//    @Basic
//    @Column(name = "password")
//    private String password;
//    @Basic
//    @Column(name = "user_id")
//    private int userId;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PasswordsEntity passwords = (PasswordsEntity) o;
//        return id == passwords.id && userId == passwords.userId && Objects.equals(password, passwords.password);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, password, userId);
//    }
//}
