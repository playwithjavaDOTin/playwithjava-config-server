package playwithjava.in;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @GetMapping(value = "/")
    public String home() {
        return "Welcome to PlayWithJava Config-Server !!";
    }
}
