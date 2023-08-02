package cloud.resume.challenge.crs.service;

import cloud.resume.challenge.crs.dao.Counter;
import cloud.resume.challenge.crs.repository.CounterRepository;
import org.springframework.stereotype.Service;

@Service
public class CounterService {
    private final CounterRepository counterRepository;

    public CounterService(CounterRepository counterRepository) {
        this.counterRepository = counterRepository;
    }

    public void save(String key, Integer value) {
        counterRepository.save(new Counter(key, value));
    }
}
