package estrutura.controller;

import estrutura.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fibonacci")
public class FibonacciController {
    @Autowired
    private FibonacciService service;

    @PostMapping("/calcular")
    public ResponseEntity<Float> getFibonacci(@RequestBody Float number) {
        float result = service.calculateFibonacci(number);
        return ResponseEntity.ok(result);
    }
}
