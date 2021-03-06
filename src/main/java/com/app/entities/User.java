package com.app.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public User(String firstName, String lastName, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    @Column
    @NotNull(message="{NotNull.User.firstName}")
    private String firstName;

    @Column
    @NotNull(message="{NotNull.User.lastName}")
    private String lastName;

    @Column
    @NotNull(message="{NotNull.User.email}")
    private String email;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    private Set<Role> roles= new HashSet<>();


}
