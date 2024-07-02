package repository;

import model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EducationRepository extends JpaRepository<Education, Long>, JpaSpecificationExecutor<Education> {

}