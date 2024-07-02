package repository;

import model.OurMissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OurMissionsRepository extends JpaRepository<OurMissions, Long>, JpaSpecificationExecutor<OurMissions> {

}