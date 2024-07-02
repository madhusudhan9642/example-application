package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "jobs")
public class Jobs implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @Column(name = "category_id", nullable = false)
    private Long categoryId;

    @Column(name = "role_id", nullable = false)
    private Long roleId;

    @Column(name = "experience_id", nullable = false)
    private Long experienceId;

    @Column(name = "education_id", nullable = false)
    private Long educationId;

    @Column(name = "job_type_id", nullable = false)
    private Long jobTypeId;

    @Column(name = "salary_type_id", nullable = false)
    private Long salaryTypeId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "slug")
    private String slug;

    @Column(name = "vacancies", nullable = false)
    private String vacancies;

    @Column(name = "min_salary")
    private Integer minSalary;

    @Column(name = "max_salary")
    private Integer maxSalary;

    @Column(name = "deadline")
    private Date deadline;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "apply_on", nullable = false)
    private String applyOn;

    @Column(name = "apply_email")
    private String applyEmail;

    @Column(name = "apply_url")
    private String applyUrl;

    @Column(name = "featured", nullable = false)
    private Boolean featured;

    @Column(name = "featured_until")
    private Date featuredUntil;

    @Column(name = "highlight", nullable = false)
    private Boolean highlight;

    @Column(name = "highlight_until")
    private Date highlightUntil;

    @Column(name = "is_remote", nullable = false)
    private Boolean remote;

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

    @Column(name = "parent_job_id")
    private Long parentJobId;

    @Column(name = "waiting_for_edit_approval", nullable = false)
    private Boolean waitingForEditApproval;

    @Column(name = "country_id", nullable = false)
    private Integer countryId;

    @Column(name = "description", nullable = false)
    private String description;

}
