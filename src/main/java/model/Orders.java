package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "orders")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "transaction_id", nullable = false)
    private String transactionId;

    @Column(name = "plan_id", nullable = false)
    private Integer planId;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "address", nullable = false)
    private String address;

}
