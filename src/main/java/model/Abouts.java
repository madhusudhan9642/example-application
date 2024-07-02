package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "abouts")
public class Abouts implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "about_title", nullable = false)
    private String aboutTitle;

    @Column(name = "about_sub_title", nullable = false)
    private String aboutSubTitle;

    @Column(name = "about_brand_logo", nullable = false)
    private String aboutBrandLogo;

    @Column(name = "about_brand_logo1", nullable = false)
    private String aboutBrandLogo1;

    @Column(name = "about_brand_logo2", nullable = false)
    private String aboutBrandLogo2;

    @Column(name = "about_brand_logo3", nullable = false)
    private String aboutBrandLogo3;

    @Column(name = "about_brand_logo4", nullable = false)
    private String aboutBrandLogo4;

    @Column(name = "about_brand_logo5", nullable = false)
    private String aboutBrandLogo5;

    @Column(name = "about_banner_img", nullable = false)
    private String aboutBannerImg;

    @Column(name = "about_banner_img1", nullable = false)
    private String aboutBannerImg1;

    @Column(name = "about_banner_img2", nullable = false)
    private String aboutBannerImg2;

    @Column(name = "about_banner_img3", nullable = false)
    private String aboutBannerImg3;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "about_description", nullable = false)
    private String aboutDescription;

}
