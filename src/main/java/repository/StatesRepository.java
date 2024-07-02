package repository;

import model.States;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StatesRepository extends JpaRepository<States, Long>, JpaSpecificationExecutor<States> {

}