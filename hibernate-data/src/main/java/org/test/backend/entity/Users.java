package org.test.backend.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.envers.Audited;

import javax.persistence.*;

/**
 * Created by achernysh on 22.10.2015.
 */
@Data
@ToString
@EqualsAndHashCode( callSuper = false)
@Table(name = "users")
@Entity
public class Users {

    @Id
    @Column(name="user_id", nullable=false)
    @SequenceGenerator(name="my_seq", sequenceName="user_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator="my_seq")
    private Integer userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
}
