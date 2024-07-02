package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "cms")
public class Cms implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "about_brand_logo")
    private String aboutBrandLogo;

    @Column(name = "about_brand_logo1")
    private String aboutBrandLogo1;

    @Column(name = "about_brand_logo2")
    private String aboutBrandLogo2;

    @Column(name = "about_brand_logo3")
    private String aboutBrandLogo3;

    @Column(name = "about_brand_logo4")
    private String aboutBrandLogo4;

    @Column(name = "about_brand_logo5")
    private String aboutBrandLogo5;

    @Column(name = "about_banner_img")
    private String aboutBannerImg;

    @Column(name = "about_banner_img1")
    private String aboutBannerImg1;

    @Column(name = "about_banner_img2")
    private String aboutBannerImg2;

    @Column(name = "about_banner_img3")
    private String aboutBannerImg3;

    @Column(name = "mission_image")
    private String missionImage;

    @Column(name = "candidate_image")
    private String candidateImage;

    @Column(name = "employers_image")
    private String employersImage;

    @Column(name = "register_page_image")
    private String registerPageImage;

    @Column(name = "login_page_image")
    private String loginPageImage;

    @Column(name = "home_page_banner_image")
    private String homePageBannerImage;

    @Column(name = "page403_image")
    private String page403Image;

    @Column(name = "page404_image")
    private String page404Image;

    @Column(name = "page500_image")
    private String page500Image;

    @Column(name = "page503_image")
    private String page503Image;

    @Column(name = "comingsoon_image")
    private String comingsoonImage;

    @Column(name = "footer_phone_no")
    private String footerPhoneNo;

    @Column(name = "footer_facebook_link")
    private String footerFacebookLink;

    @Column(name = "footer_instagram_link")
    private String footerInstagramLink;

    @Column(name = "footer_twitter_link")
    private String footerTwitterLink;

    @Column(name = "footer_youtube_link")
    private String footerYoutubeLink;

    @Column(name = "maintenance_image")
    private String maintenanceImage;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "contact_map", nullable = false)
    private String contactMap;

    @Column(name = "footer_address")
    private String footerAddress;

    @Column(name = "privary_page")
    private String privaryPage;

    @Column(name = "terms_page")
    private String termsPage;

}
