package repository;

import model.JobRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JobRolesRepository extends JpaRepository<JobRoles, Long>, JpaSpecificationExecutor<JobRoles> {

}