package repository;

import model.ContactInfos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ContactInfosRepository extends JpaRepository<ContactInfos, Long>, JpaSpecificationExecutor<ContactInfos> {

}