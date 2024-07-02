package repository;

import model.Nationalities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface NationalitiesRepository extends JpaRepository<Nationalities, Long>, JpaSpecificationExecutor<Nationalities> {

}