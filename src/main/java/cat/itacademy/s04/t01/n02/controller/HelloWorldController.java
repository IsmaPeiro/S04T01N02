package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @GetMapping("HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOW") String name) {
        return "Hello, " + name + ". You're running a Gradle project";
    }
    
    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String saluda2(@PathVariable(required = false) String name) {
        if (name != null) {
            return "Hello, " + name + ". You're running a Gradle project";
        } else {
            return "Hello, you're running a Gradle project";
        }
    }
}