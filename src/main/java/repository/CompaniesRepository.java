package repository;

import model.Companies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CompaniesRepository extends JpaRepository<Companies, Long>, JpaSpecificationExecutor<Companies> {

}