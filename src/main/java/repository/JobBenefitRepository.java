package repository;

import model.JobBenefit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JobBenefitRepository extends JpaRepository<JobBenefit, Long>, JpaSpecificationExecutor<JobBenefit> {

}