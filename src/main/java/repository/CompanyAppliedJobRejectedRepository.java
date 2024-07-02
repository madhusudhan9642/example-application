package repository;

import model.CompanyAppliedJobRejected;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CompanyAppliedJobRejectedRepository extends JpaRepository<CompanyAppliedJobRejected, Long>, JpaSpecificationExecutor<CompanyAppliedJobRejected> {

}