package repository;

import model.Emails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmailsRepository extends JpaRepository<Emails, Long>, JpaSpecificationExecutor<Emails> {

}