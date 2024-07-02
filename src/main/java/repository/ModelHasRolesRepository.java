package repository;

import model.ModelHasRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ModelHasRolesRepository extends JpaRepository<ModelHasRoles, String>, JpaSpecificationExecutor<ModelHasRoles> {

}