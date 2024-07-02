package repository;

import model.PasswordResets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PasswordResetsRepository extends JpaRepository<PasswordResets, Void>, JpaSpecificationExecutor<PasswordResets> {

}