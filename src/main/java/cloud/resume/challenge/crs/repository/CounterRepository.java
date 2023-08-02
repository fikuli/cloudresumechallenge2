package cloud.resume.challenge.crs.repository;

import cloud.resume.challenge.crs.dao.Counter;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface CounterRepository extends CrudRepository<Counter, String> {

    Optional<Counter> findById(String id);
}
