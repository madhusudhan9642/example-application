package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "faqs")
public class Faqs implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "faq_category_id", nullable = false)
    private Long faqCategoryId;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "question", nullable = false)
    private String question;

    @Column(name = "answer", nullable = false)
    private String answer;

}
