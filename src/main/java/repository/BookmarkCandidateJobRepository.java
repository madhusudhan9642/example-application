package repository;

import model.BookmarkCandidateJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookmarkCandidateJobRepository extends JpaRepository<BookmarkCandidateJob, Long>, JpaSpecificationExecutor<BookmarkCandidateJob> {

}