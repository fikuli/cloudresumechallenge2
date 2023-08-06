package cloud.resume.challenge.crs.controller;

import cloud.resume.challenge.crs.service.CounterService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class CounterController {
    private int hede;

    @GetMapping
    public String hede() {
        return "hede: " + hede++;
    }


    private final CounterService counterService;

    public CounterController(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping("/counter")
    public int getCounter() {
        this.counterService.save("hede", hede);
        return hede++;
    }

    @GetMapping("/hede")
    public int getHede() {
        return hede++;
    }
}
