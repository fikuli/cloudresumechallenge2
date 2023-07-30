package cloud.resume.challenge.crs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {
    private int hede;

    @GetMapping
    public String hede() {
        return "hede: " + hede++;
    }
}
