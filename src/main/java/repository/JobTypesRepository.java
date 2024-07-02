package repository;

import model.JobTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JobTypesRepository extends JpaRepository<JobTypes, Long>, JpaSpecificationExecutor<JobTypes> {

}