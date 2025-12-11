package anno.jpa.database;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("TestJpaStrategyIDAutoRepository")
public interface TestJpaStrategyIDAutoRepository extends JpaRepository<JpaUserStrategyIDAuto, Id> {
}
