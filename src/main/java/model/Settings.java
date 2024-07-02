package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "settings")
public class Settings implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "dark_logo")
    private String darkLogo;

    @Column(name = "light_logo")
    private String lightLogo;

    @Column(name = "favicon_image")
    private String faviconImage;

    @Column(name = "sidebar_color")
    private String sidebarColor;

    @Column(name = "nav_color")
    private String navColor;

    @Column(name = "sidebar_txt_color")
    private String sidebarTxtColor;

    @Column(name = "nav_txt_color")
    private String navTxtColor;

    @Column(name = "main_color")
    private String mainColor;

    @Column(name = "accent_color")
    private String accentColor;

    @Column(name = "frontend_primary_color")
    private String frontendPrimaryColor;

    @Column(name = "frontend_secondary_color")
    private String frontendSecondaryColor;

    @Column(name = "working_process_step1_title")
    private String workingProcessStep1Title;

    @Column(name = "working_process_step2_title")
    private String workingProcessStep2Title;

    @Column(name = "working_process_step3_title")
    private String workingProcessStep3Title;

    @Column(name = "working_process_step4_title")
    private String workingProcessStep4Title;

    @Column(name = "dark_mode", nullable = false)
    private Boolean darkMode;

    @Column(name = "google_analytics", nullable = false)
    private Boolean googleAnalytics;

    @Column(name = "search_engine_indexing", nullable = false)
    private Boolean searchEngineIndexing;

    @Column(name = "default_layout", nullable = false)
    private Boolean defaultLayout;

    @Column(name = "default_plan", nullable = false)
    private Long defaultPlan;

    @Column(name = "job_limit", nullable = false)
    private Long jobLimit;

    @Column(name = "featured_job_limit", nullable = false)
    private Long featuredJobLimit;

    @Column(name = "highlight_job_limit", nullable = false)
    private Long highlightJobLimit;

    @Column(name = "timezone", nullable = false)
    private String timezone;

    @Column(name = "language_changing", nullable = false)
    private Boolean languageChanging;

    @Column(name = "email_verification", nullable = false)
    private Boolean emailVerification;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "default_map", nullable = false)
    private String defaultMap;

    @Column(name = "google_map_key")
    private String googleMapKey;

    @Column(name = "map_box_key")
    private String mapBoxKey;

    @Column(name = "default_long")
    private Double defaultLong;

    @Column(name = "default_lat")
    private Double defaultLat;

    @Column(name = "app_country_type", nullable = false)
    private String appCountryType;

    @Column(name = "app_country")
    private Long appCountry;

    @Column(name = "employer_auto_activation", nullable = false)
    private Boolean employerAutoActivation;

    @Column(name = "per_job_active", nullable = false)
    private Boolean perJobActive;

    @Column(name = "per_job_price")
    private Double perJobPrice;

    @Column(name = "highlight_job_price")
    private Double highlightJobPrice;

    @Column(name = "featured_job_price")
    private Double featuredJobPrice;

    @Column(name = "candidate_account_auto_activation", nullable = false)
    private Boolean candidateAccountAutoActivation;

    @Column(name = "job_auto_approved", nullable = false)
    private Boolean jobAutoApproved;

    @Column(name = "edited_job_auto_approved", nullable = false)
    private Boolean editedJobAutoApproved;

    @Column(name = "currency_switcher", nullable = false)
    private Boolean currencySwitcher;

    @Column(name = "highlight_job_days")
    private Integer highlightJobDays;

    @Column(name = "featured_job_days")
    private Integer featuredJobDays;

    @Column(name = "header_css")
    private String headerCss;

    @Column(name = "header_script")
    private String headerScript;

    @Column(name = "body_script")
    private String bodyScript;

    @Column(name = "working_process_step1_description")
    private String workingProcessStep1Description;

    @Column(name = "working_process_step2_description")
    private String workingProcessStep2Description;

    @Column(name = "working_process_step3_description")
    private String workingProcessStep3Description;

    @Column(name = "working_process_step4_description")
    private String workingProcessStep4Description;

}
