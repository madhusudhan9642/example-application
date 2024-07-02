package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "candidates")
public class Candidates implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "profession_id")
    private Long professionId;

    @Column(name = "experience_id")
    private Long experienceId;

    @Column(name = "education_id")
    private Long educationId;

    @Column(name = "nationality_id")
    private Long nationalityId;

    @Column(name = "title")
    private String title;

    @Column(name = "gender")
    private String gender;

    @Column(name = "website")
    private String website;

    @Column(name = "photo")
    private String photo;

    @Column(name = "cv")
    private String cv;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "visibility", nullable = false)
    private Boolean visibility;

    @Column(name = "cv_visibility", nullable = false)
    private Boolean cvVisibility;

    @Column(name = "received_job_alert", nullable = false)
    private Boolean receivedJobAlert;

    @Column(name = "profile_complete", nullable = false)
    private Integer profileComplete;

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

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "available_in")
    private Date availableIn;

    @Column(name = "bio")
    private String bio;

}
