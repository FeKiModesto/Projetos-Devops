package fiap.com.br.cp2Aluno.controllers;

import fiap.com.br.cp2Aluno.models.Aluno;
import fiap.com.br.cp2Aluno.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping
    public List<Aluno> listAll() {
        return service.getAllStudents();
    }

    @PostMapping
    public ResponseEntity<Aluno> add(@RequestBody Aluno aluno) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addStudent(aluno));
    }

    @GetMapping("{id}")
    public ResponseEntity<Aluno> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getStudentById(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Aluno> update(@PathVariable Long id, @RequestBody Aluno aluno) {
        return ResponseEntity.ok(service.updateStudent(id, aluno));
    }
}