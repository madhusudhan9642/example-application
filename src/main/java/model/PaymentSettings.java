package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "payment_settings")
public class PaymentSettings implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "paypal", nullable = false)
    private Boolean paypal;

    @Column(name = "paypal_live_mode", nullable = false)
    private Boolean paypalLiveMode;

    @Column(name = "stripe", nullable = false)
    private Boolean stripe;

    @Column(name = "razorpay", nullable = false)
    private Boolean razorpay;

    @Column(name = "paystack", nullable = false)
    private Boolean paystack;

    @Column(name = "ssl_commerz", nullable = false)
    private Boolean sslCommerz;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

}
