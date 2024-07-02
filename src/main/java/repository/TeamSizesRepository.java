package repository;

import model.TeamSizes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TeamSizesRepository extends JpaRepository<TeamSizes, Long>, JpaSpecificationExecutor<TeamSizes> {

}