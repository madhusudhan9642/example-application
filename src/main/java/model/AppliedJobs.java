package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "applied_jobs")
public class AppliedJobs implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "candidate_id", nullable = false)
    private Long candidateId;

    @Column(name = "job_id", nullable = false)
    private Long jobId;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "candidate_resume_id", nullable = false)
    private Long candidateResumeId;

    @Column(name = "application_group_id", nullable = false)
    private Long applicationGroupId;

    @Column(name = "order", nullable = false)
    private Integer order;

    @Column(name = "cover_letter")
    private String coverLetter;

}
