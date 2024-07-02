package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "testimonials")
public class Testimonials implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "position", nullable = false)
    private String position;

    @Column(name = "image")
    private String image;

    @Column(name = "stars", nullable = false)
    private Integer stars;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "description", nullable = false)
    private String description;

}
