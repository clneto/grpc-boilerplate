package clneto.sales.controller;

import clneto.sales.EchoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @Autowired
    EchoClient echoClient;

    @GetMapping("/echo/{name}")
    public String echo(@PathVariable(name="name") String name) {
        return echoClient.greet(name);
    }
}
