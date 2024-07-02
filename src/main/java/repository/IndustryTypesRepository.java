package repository;

import model.IndustryTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IndustryTypesRepository extends JpaRepository<IndustryTypes, Long>, JpaSpecificationExecutor<IndustryTypes> {

}