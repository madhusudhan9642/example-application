package repository;

import model.Seos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SeosRepository extends JpaRepository<Seos, Long>, JpaSpecificationExecutor<Seos> {

}