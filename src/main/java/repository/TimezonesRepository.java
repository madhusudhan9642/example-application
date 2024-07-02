package repository;

import model.Timezones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TimezonesRepository extends JpaRepository<Timezones, Long>, JpaSpecificationExecutor<Timezones> {

}