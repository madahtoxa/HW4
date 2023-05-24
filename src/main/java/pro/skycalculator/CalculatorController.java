package pro.skycalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping()
    public String greating() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return String.format("%s+%s=%s", a, b, service.plus(a, b));
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return String.format("%s-%s=%s", a, b, service.minus(a, b));
    }

    @GetMapping("/multyply")
    public String multyply(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return String.format("%s*%s=%s", a, b, service.multyply(a, b));
    }

    @GetMapping("/devide")
    public String devide(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        if(b==0){
            return "На ноль делить нельзя";
        }
        return String.format("%s/%s=%s", a, b, service.devide(a, b));
    }
}