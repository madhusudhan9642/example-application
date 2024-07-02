package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "user_plans")
public class UserPlans implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @Column(name = "plan_id", nullable = false)
    private Long planId;

    @Column(name = "job_limit", nullable = false)
    private Long jobLimit;

    @Column(name = "featured_job_limit", nullable = false)
    private Long featuredJobLimit;

    @Column(name = "highlight_job_limit", nullable = false)
    private Long highlightJobLimit;

    @Column(name = "candidate_cv_view_limit", nullable = false)
    private Long candidateCvViewLimit;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "candidate_cv_view_limitation", nullable = false)
    private String candidateCvViewLimitation;

}
