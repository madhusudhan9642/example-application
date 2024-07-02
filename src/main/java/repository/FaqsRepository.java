package repository;

import model.Faqs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FaqsRepository extends JpaRepository<Faqs, Long>, JpaSpecificationExecutor<Faqs> {

}