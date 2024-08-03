package estrutura.controller;

import estrutura.service.ImpostoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/imposto")
public class ImpostoController {
    @Autowired
    private ImpostoService service;

    @PostMapping("/calcular")
    public ResponseEntity<Double> getImposto(@RequestBody Double number) {
        double result = service.calcularImposto(number);
        return ResponseEntity.ok(result);
    }
}
