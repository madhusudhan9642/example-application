package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "email_verified_at")
    private Date emailVerifiedAt;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "recent_activities_alert", nullable = false)
    private Boolean recentActivitiesAlert;

    @Column(name = "job_expired_alert", nullable = false)
    private Boolean jobExpiredAlert;

    @Column(name = "new_job_alert", nullable = false)
    private Boolean newJobAlert;

    @Column(name = "shortlisted_alert", nullable = false)
    private Boolean shortlistedAlert;

    @Column(name = "status", nullable = false)
    private Boolean status;

    @Column(name = "is_demo_field", nullable = false)
    private Boolean demoField;

    @Column(name = "remember_token")
    private String rememberToken;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "auth_type", nullable = false)
    private String authType;

    @Column(name = "google_id")
    private String googleId;

    @Column(name = "facebook_id")
    private String facebookId;

    @Column(name = "provider")
    private String provider;

    @Column(name = "provider_id")
    private String providerId;

}
