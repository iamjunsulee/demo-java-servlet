package me.junsu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
    private final HelloService helloService;

    public SampleController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hi")
    @ResponseBody
    public String getName() {
        return "Hi, " + helloService.getName();
    }

    @GetMapping("/sample")
    public String getSample() {
        return "sample";
    }
}
