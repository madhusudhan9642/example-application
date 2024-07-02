package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "queue_jobs")
public class QueueJobs implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "queue", nullable = false)
    private String queue;

    @Column(name = "attempts", nullable = false)
    private Integer attempts;

    @Column(name = "reserved_at")
    private Long reservedAt;

    @Column(name = "available_at", nullable = false)
    private Long availableAt;

    @Column(name = "created_at", nullable = false)
    private Long createdAt;

    @Column(name = "payload", nullable = false)
    private String payload;

}
