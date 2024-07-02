package repository;

import model.Testimonials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestimonialsRepository extends JpaRepository<Testimonials, Long>, JpaSpecificationExecutor<Testimonials> {

}