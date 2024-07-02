package repository;

import model.Plans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PlansRepository extends JpaRepository<Plans, Long>, JpaSpecificationExecutor<Plans> {

}