package fiap.com.br.appAcademia.controllers;

import fiap.com.br.appAcademia.models.GymStudent;
import fiap.com.br.appAcademia.models.TrainingSheet;
import fiap.com.br.appAcademia.services.GymStudentService;
import fiap.com.br.appAcademia.services.TrainingSheetSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/training-sheet")
public class TrainingSheetConstroller {

    @Autowired
    private TrainingSheetSerice service;

    @GetMapping
    public List<TrainingSheet> listAll() {
        return service.getAllTraining();
    }

    @PostMapping
    public ResponseEntity<TrainingSheet> add(@RequestBody TrainingSheet training) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.addTraining(training));
    }

    @GetMapping("{id}")
    public ResponseEntity<TrainingSheet> getbyId(@PathVariable Long id) {
        return  ResponseEntity.ok(service.getTrainingById(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<TrainingSheet> delete(@PathVariable Long id) {
        service.deleteTraining(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<TrainingSheet> update(@PathVariable Long id, @RequestBody TrainingSheet training) {
        return ResponseEntity.ok(service.updateTraining(id, training));
    }
}
