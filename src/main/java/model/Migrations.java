package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "migrations")
public class Migrations implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "migration", nullable = false)
    private String migration;

    @Column(name = "batch", nullable = false)
    private Integer batch;

}
