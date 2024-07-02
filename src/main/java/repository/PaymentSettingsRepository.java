package repository;

import model.PaymentSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PaymentSettingsRepository extends JpaRepository<PaymentSettings, Long>, JpaSpecificationExecutor<PaymentSettings> {

}