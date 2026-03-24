package fiap.com.br.appAcademia.controllers;

import fiap.com.br.appAcademia.models.GymStudent;
import fiap.com.br.appAcademia.repositories.GymStudentRepository;
import fiap.com.br.appAcademia.services.GymStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gym-student")
public class GymStudentConstroller {

    @Autowired
    private GymStudentService service;

    @GetMapping
    public List<GymStudent> listAll() {
        return service.getAllStudents();
    }

    @PostMapping
    public ResponseEntity<GymStudent> add(@RequestBody GymStudent gymStudent) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.addStudent(gymStudent));
    }

    @GetMapping("{id}")
    public ResponseEntity<GymStudent> getbyId(@PathVariable Long id) {
        return  ResponseEntity.ok(service.getStudentById(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<GymStudent> delete(@PathVariable Long id) {
        service.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<GymStudent> update(@PathVariable Long id, @RequestBody GymStudent gymStudent) {
        return ResponseEntity.ok(service.updateStudent(id, gymStudent));
    }

}
