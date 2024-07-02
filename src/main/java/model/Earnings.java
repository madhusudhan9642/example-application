package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "earnings")
public class Earnings implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "payment_provider", nullable = false)
    private String paymentProvider;

    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @Column(name = "amount")
    private String amount;

    @Column(name = "currency_symbol")
    private String currencySymbol;

    @Column(name = "usd_amount")
    private String usdAmount;

    @Column(name = "payment_status", nullable = false)
    private String paymentStatus;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "manual_payment_id")
    private Long manualPaymentId;

    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "plan_id")
    private Long planId;

    @Column(name = "payment_type", nullable = false)
    private String paymentType;

}
