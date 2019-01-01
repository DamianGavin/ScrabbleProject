package ie.gmit.sw.controllers;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("scrabble/v1/")
public class AppController {


    @GetMapping("test")
    public String functionName(@RequestParam("x") int x, @RequestParam("y") int y) {
        return "Working " + x + " y " + y;
    }
}