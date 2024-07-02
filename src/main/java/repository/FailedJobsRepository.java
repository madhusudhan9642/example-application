package repository;

import model.FailedJobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FailedJobsRepository extends JpaRepository<FailedJobs, Long>, JpaSpecificationExecutor<FailedJobs> {

}