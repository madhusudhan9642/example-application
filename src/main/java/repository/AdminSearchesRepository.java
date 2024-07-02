package repository;

import model.AdminSearches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AdminSearchesRepository extends JpaRepository<AdminSearches, Long>, JpaSpecificationExecutor<AdminSearches> {

}