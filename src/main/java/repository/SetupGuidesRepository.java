package repository;

import model.SetupGuides;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SetupGuidesRepository extends JpaRepository<SetupGuides, Long>, JpaSpecificationExecutor<SetupGuides> {

}