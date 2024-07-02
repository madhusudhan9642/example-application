package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "failed_jobs")
public class FailedJobs implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uuid", nullable = false)
    private String uuid;

    @Column(name = "failed_at", nullable = false)
    private Date failedAt;

    @Column(name = "connection", nullable = false)
    private String connection;

    @Column(name = "queue", nullable = false)
    private String queue;

    @Column(name = "payload", nullable = false)
    private String payload;

    @Column(name = "exception", nullable = false)
    private String exception;

}
