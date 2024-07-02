package repository;

import model.ModelHasPermissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ModelHasPermissionsRepository extends JpaRepository<ModelHasPermissions, String>, JpaSpecificationExecutor<ModelHasPermissions> {

}