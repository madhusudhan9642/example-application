package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "companies")
public class Companies implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "industry_type_id", nullable = false)
    private Long industryTypeId;

    @Column(name = "organization_type_id", nullable = false)
    private Long organizationTypeId;

    @Column(name = "team_size_id")
    private Long teamSizeId;

    @Column(name = "nationality_id", nullable = false)
    private Long nationalityId;

    @Column(name = "logo")
    private String logo;

    @Column(name = "banner")
    private String banner;

    @Column(name = "establishment_date")
    private Date establishmentDate;

    @Column(name = "website")
    private String website;

    @Column(name = "visibility", nullable = false)
    private Boolean visibility;

    @Column(name = "profile_completion", nullable = false)
    private Boolean profileCompletion;

    @Column(name = "total_views", nullable = false)
    private Long totalViews;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "address")
    private String address;

    @Column(name = "neighborhood")
    private String neighborhood;

    @Column(name = "locality")
    private String locality;

    @Column(name = "place")
    private String place;

    @Column(name = "district")
    private String district;

    @Column(name = "postcode")
    private String postcode;

    @Column(name = "region")
    private String region;

    @Column(name = "country")
    private String country;

    @Column(name = "long")
    private Double longField;

    @Column(name = "lat")
    private Double lat;

    @Column(name = "bio")
    private String bio;

    @Column(name = "vision")
    private String vision;

}
