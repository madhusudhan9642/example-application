package repository;

import model.ApplicationGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ApplicationGroupsRepository extends JpaRepository<ApplicationGroups, Long>, JpaSpecificationExecutor<ApplicationGroups> {

}