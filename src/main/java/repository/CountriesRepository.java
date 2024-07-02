package repository;

import model.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CountriesRepository extends JpaRepository<Countries, Long>, JpaSpecificationExecutor<Countries> {

}