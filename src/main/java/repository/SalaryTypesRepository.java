package repository;

import model.SalaryTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SalaryTypesRepository extends JpaRepository<SalaryTypes, Long>, JpaSpecificationExecutor<SalaryTypes> {

}