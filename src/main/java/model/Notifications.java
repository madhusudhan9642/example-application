package model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "notifications")
public class Notifications implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "notifiable_type", nullable = false)
    private String notifiableType;

    @Column(name = "notifiable_id", nullable = false)
    private Long notifiableId;

    @Column(name = "read_at")
    private Date readAt;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "data", nullable = false)
    private String data;

}
