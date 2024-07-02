package repository;

import model.Earnings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EarningsRepository extends JpaRepository<Earnings, Long>, JpaSpecificationExecutor<Earnings> {

}