package kovteba.webservlet.annotatedcontrollers.matrixvariables;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/mv")
public class MatrixVariables {

    @GetMapping("/{id}")
    public void findPet(@PathVariable String id,
                        @MatrixVariable(name = "v1") int v1,
                        @MatrixVariable(name = "v2") int v2) {

        System.out.printf("%s %d %d", id, v1, v2);

    }
}
