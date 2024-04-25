package br.com.teste;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
       
        Object[] objetos = new Object[2];
        objetos[0] = new MeuObjeto("Valor 1", "Valor 2");
        objetos[1] = new MeuObjeto("Outro valor 1", "Outro valor 2");

        
        return new Greeting(counter.incrementAndGet(), String.format(template, name), "teztooo", objetos);
    }
}
