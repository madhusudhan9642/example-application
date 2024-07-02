package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "plans")
public class Plans implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "label", nullable = false)
    private String label;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "job_limit", nullable = false)
    private Integer jobLimit;

    @Column(name = "featured_job_limit", nullable = false)
    private Integer featuredJobLimit;

    @Column(name = "highlight_job_limit", nullable = false)
    private Integer highlightJobLimit;

    @Column(name = "candidate_cv_view_limit", nullable = false)
    private Integer candidateCvViewLimit;

    @Column(name = "recommended", nullable = false)
    private Boolean recommended;

    @Column(name = "frontend_show", nullable = false)
    private Boolean frontendShow;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "candidate_cv_view_limitation", nullable = false)
    private String candidateCvViewLimitation;

    @Column(name = "description", nullable = false)
    private String description;

}
