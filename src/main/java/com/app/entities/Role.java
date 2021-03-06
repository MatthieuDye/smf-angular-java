package com.app.entities;


import com.app.enums.RolesEnum;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Role implements Serializable {

    private static final long serialVersionUID = 2284252532274015507L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private int id;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private RolesEnum roleName;
}
