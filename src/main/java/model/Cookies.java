package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "cookies")
public class Cookies implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "allow_cookies", nullable = false)
    private Boolean allowCookies;

    @Column(name = "cookie_name", nullable = false)
    private String cookieName;

    @Column(name = "cookie_expiration", nullable = false)
    private Integer cookieExpiration;

    @Column(name = "force_consent", nullable = false)
    private Boolean forceConsent;

    @Column(name = "darkmode", nullable = false)
    private Boolean darkmode;

    @Column(name = "language", nullable = false)
    private String language;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "approve_button_text", nullable = false)
    private String approveButtonText;

    @Column(name = "decline_button_text", nullable = false)
    private String declineButtonText;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "description", nullable = false)
    private String description;

}
