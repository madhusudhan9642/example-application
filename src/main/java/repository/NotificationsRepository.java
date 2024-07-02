package repository;

import model.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface NotificationsRepository extends JpaRepository<Notifications, String>, JpaSpecificationExecutor<Notifications> {

}