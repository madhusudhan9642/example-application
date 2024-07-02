package repository;

import model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ContactsRepository extends JpaRepository<Contacts, Long>, JpaSpecificationExecutor<Contacts> {

}