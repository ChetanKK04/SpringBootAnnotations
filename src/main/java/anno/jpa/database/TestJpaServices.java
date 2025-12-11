package anno.jpa.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TestJpaServices {

    @Autowired
    private  TestJpaRepository testJpaRepository;

    @Autowired
    @Qualifier("TestJpaStrategyIDAutoRepository")
    private  TestJpaStrategyIDAutoRepository testJpaStrategyIDAutoRepository;


    public JpaUserStrategyIDAuto addJpaUserStrategyIDAuto(JpaUserStrategyIDAuto jpaUser) {
        JpaUserStrategyIDAuto saveuser = testJpaStrategyIDAutoRepository.save(jpaUser);
        return saveuser;
    }

    public JpaUser adduser(JpaUser jpaUser) {
        JpaUser saveuser = testJpaRepository.save(jpaUser);
        return saveuser;
    }
}
