package repository;

import model.UserPlans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserPlansRepository extends JpaRepository<UserPlans, Long>, JpaSpecificationExecutor<UserPlans> {

}