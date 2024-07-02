package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "posts")
public class Posts implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_id", nullable = false)
    private Long categoryId;

    @Column(name = "author_id", nullable = false)
    private Long authorId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "slug")
    private String slug;

    @Column(name = "image")
    private String image;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "short_description", nullable = false)
    private String shortDescription;

    @Column(name = "description", nullable = false)
    private String description;

}
