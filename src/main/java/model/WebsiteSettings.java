package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "website_settings")
public class WebsiteSettings implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "facebook", nullable = false)
    private String facebook;

    @Column(name = "instagram", nullable = false)
    private String instagram;

    @Column(name = "twitter", nullable = false)
    private String twitter;

    @Column(name = "youtube", nullable = false)
    private String youtube;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "sub_title", nullable = false)
    private String subTitle;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "map_address", nullable = false)
    private String mapAddress;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "live_job", nullable = false)
    private String liveJob;

    @Column(name = "companies", nullable = false)
    private String companies;

    @Column(name = "candidates", nullable = false)
    private String candidates;

}
