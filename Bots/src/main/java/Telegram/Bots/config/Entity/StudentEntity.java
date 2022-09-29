package Telegram.Bots.config.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private Long user_id;
    private String username;

    @Override
    public String toString(){
        return "id : "+this.id+"\n" +
                "user_id : "+this.user_id+"\n" +
                "username : @"+this.username+"\n\n";
    }
}