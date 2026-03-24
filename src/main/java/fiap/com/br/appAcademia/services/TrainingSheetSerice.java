package fiap.com.br.appAcademia.services;

import fiap.com.br.appAcademia.models.TrainingSheet;
import fiap.com.br.appAcademia.repositories.TrainingSheetRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingSheetSerice {

    @Autowired
    TrainingSheetRepository repository;

    public List<TrainingSheet> getAllTraining(){
        return repository.findAll();
    }

    public TrainingSheet addTraining(TrainingSheet training) {
        return repository.save(training);
    }

    public TrainingSheet getTrainingById(Long id) {
        return repository.getReferenceById(id);
    }

    public void deleteTraining(Long id) {
        repository.deleteById(id);
    }

    public TrainingSheet updateTraining(Long id ,TrainingSheet training) {
        TrainingSheet oldTraining = getTrainingById(id);
        BeanUtils.copyProperties(oldTraining, training , "id");
        return repository.save(training);
    }

}
