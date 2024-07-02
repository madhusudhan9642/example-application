package repository;

import model.Languages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LanguagesRepository extends JpaRepository<Languages, Long>, JpaSpecificationExecutor<Languages> {

}