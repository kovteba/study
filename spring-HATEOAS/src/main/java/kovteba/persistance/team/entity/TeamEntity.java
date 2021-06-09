package src.main.java.kovteba.persistance.team.entity;

import lombok.Data;
import src.main.java.kovteba.persistance.user.entity.UserEntity;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "TEAM")
public class TeamEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToMany
    @JoinTable(
            name = "MEMBERS",
            joinColumns = { @JoinColumn(name = "TEAM_ID")},
            inverseJoinColumns = { @JoinColumn(name = "USER_ID")}
    )
    private List<UserEntity> members;

}
