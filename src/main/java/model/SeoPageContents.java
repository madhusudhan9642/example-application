package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "seo_page_contents")
public class SeoPageContents implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "page_id", nullable = false)
    private Long pageId;

    @Column(name = "language_code", nullable = false)
    private String languageCode;

    @Column(name = "title")
    private String title;

    @Column(name = "image")
    private String image;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "description")
    private String description;

}
