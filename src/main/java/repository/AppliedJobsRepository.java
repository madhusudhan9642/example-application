package repository;

import model.AppliedJobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AppliedJobsRepository extends JpaRepository<AppliedJobs, Long>, JpaSpecificationExecutor<AppliedJobs> {

}