package repository;

import model.PostComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PostCommentsRepository extends JpaRepository<PostComments, Long>, JpaSpecificationExecutor<PostComments> {

}