package repository;

import model.QueueJobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface QueueJobsRepository extends JpaRepository<QueueJobs, Long>, JpaSpecificationExecutor<QueueJobs> {

}