package repository;

import model.JobTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JobTagRepository extends JpaRepository<JobTag, Long>, JpaSpecificationExecutor<JobTag> {

}