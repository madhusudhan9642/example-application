package repository;

import model.RoleHasPermissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoleHasPermissionsRepository extends JpaRepository<RoleHasPermissions, Long>, JpaSpecificationExecutor<RoleHasPermissions> {

}