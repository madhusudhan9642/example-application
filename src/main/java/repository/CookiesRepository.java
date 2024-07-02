package repository;

import model.Cookies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CookiesRepository extends JpaRepository<Cookies, Long>, JpaSpecificationExecutor<Cookies> {

}