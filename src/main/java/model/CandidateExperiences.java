package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "candidate_experiences")
public class CandidateExperiences implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "candidate_id", nullable = false)
    private Long candidateId;

    @Column(name = "company", nullable = false)
    private String company;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "designation", nullable = false)
    private String designation;

    @Column(name = "start", nullable = false)
    private Date start;

    @Column(name = "end")
    private Date end;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "responsibilities")
    private String responsibilities;

}
