package repository;

import model.ManualPayments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ManualPaymentsRepository extends JpaRepository<ManualPayments, Long>, JpaSpecificationExecutor<ManualPayments> {

}