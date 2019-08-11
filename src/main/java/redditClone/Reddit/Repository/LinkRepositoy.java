package redditClone.Reddit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import redditClone.Reddit.domain.Link;

public interface LinkRepositoy extends JpaRepository<Link,Long> {
}
