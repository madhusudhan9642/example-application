package repository;

import model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PostsRepository extends JpaRepository<Posts, Long>, JpaSpecificationExecutor<Posts> {

}