package kovteba.webservlet.annotatedcontrollers.consumableproducible;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@RestController
@RequestMapping(value = "/cp")
public class ConsumableProducible {

//    @PostMapping(consumes = "application/json")
    @PostMapping(consumes = "!application/json")
    public Pet consumable(@RequestBody Pet pet) {

        return pet;
    }

    @GetMapping(produces = "application/json")
    public Pet producible(WebRequest webRequest) {

        System.out.println(webRequest);
        return new Pet("pet_name");
    }


    static class Pet {

        private String name;

        public Pet() {
        }

        public Pet(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
