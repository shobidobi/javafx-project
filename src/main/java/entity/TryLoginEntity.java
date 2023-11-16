//package entity;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//import java.util.Objects;
//
//@Entity
//@Table(name = "try_login", schema = "public", catalog = "login")
//public class TryLoginEntity {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id")
//    private int id;
//    @Basic
//    @Column(name = "user_name")
//    private String userName;
//    @Basic
//    @Column(name = "password")
//    private String password;
//    @Basic
//    @Column(name = "date")
//    private Timestamp date;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
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
//    public Timestamp getDate() {
//        return date;
//    }
//
//    public void setDate(Timestamp date) {
//        this.date = date;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        TryLoginEntity tryLogin = (TryLoginEntity) o;
//        return id == tryLogin.id && Objects.equals(userName, tryLogin.userName) && Objects.equals(password, tryLogin.password) && Objects.equals(date, tryLogin.date);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, userName, password, date);
//    }
//}
