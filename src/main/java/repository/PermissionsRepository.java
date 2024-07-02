package repository;

import model.Permissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PermissionsRepository extends JpaRepository<Permissions, Long>, JpaSpecificationExecutor<Permissions> {

}