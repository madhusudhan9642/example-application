package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "candidate_education")
public class CandidateEducation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "candidate_id", nullable = false)
    private Long candidateId;

    @Column(name = "level", nullable = false)
    private String level;

    @Column(name = "degree", nullable = false)
    private String degree;

    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "notes")
    private String notes;

}
