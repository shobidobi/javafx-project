//package entity;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table(name = "games", schema = "public", catalog = "login")
//public class GamesEntity {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id")
//    private int id;
//    @Basic
//    @Column(name = "date_of_game")
//    private Object dateOfGame;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Object getDateOfGame() {
//        return dateOfGame;
//    }
//
//    public void setDateOfGame(Object dateOfGame) {
//        this.dateOfGame = dateOfGame;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        GamesEntity that = (GamesEntity) o;
//        return id == that.id && Objects.equals(dateOfGame, that.dateOfGame);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, dateOfGame);
//    }
//}
