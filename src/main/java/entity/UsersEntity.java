//package entity;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table(name = "users", schema = "public", catalog = "login")
//public class UsersEntity {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id")
//    private int id;
//    @Basic
//    @Column(name = "user_name")
//    private String userName;
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
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        UsersEntity that = (UsersEntity) o;
//        return id == that.id && Objects.equals(userName, that.userName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, userName);
//    }
//}
