package repository;

import model.OrganizationTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrganizationTypesRepository extends JpaRepository<OrganizationTypes, Long>, JpaSpecificationExecutor<OrganizationTypes> {

}