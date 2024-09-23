package ie.atu.week2_refresher;

import org.springframework.web.bind.annotation.*;

@RestController
public class Week2Refresher {
    @GetMapping("/hello")
    public String message() {
        return "hello";
    }

    @GetMapping("/hello/{name}")
    public String myName(@PathVariable String name) {
        return "hello, " + name;
    }

    @GetMapping("/search")
    public String search(@RequestParam String search1, @RequestParam String search2) {
        return search1 + " " + search2;
    }



}
