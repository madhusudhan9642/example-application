package repository;

import model.Benefits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BenefitsRepository extends JpaRepository<Benefits, Long>, JpaSpecificationExecutor<Benefits> {

}