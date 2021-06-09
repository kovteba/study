package src.main.java.kovteba.persistance.user.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "USER")
public class UserEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;
}
