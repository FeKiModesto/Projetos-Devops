package fiap.com.br.appAcademia.services;

import fiap.com.br.appAcademia.models.GymStudent;
import fiap.com.br.appAcademia.repositories.GymStudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymStudentService {

    @Autowired
    private GymStudentRepository repository;

    public List<GymStudent> getAllStudents() {
        return repository.findAll();
    }

    public GymStudent addStudent(GymStudent student) {
        return repository.save(student);
    }

    public GymStudent getStudentById (Long id){
        return repository.getReferenceById(id);
    }

    public void deleteStudent(Long id) {
        repository.delete(getStudentById(id));
    }

    public GymStudent updateStudent(Long id, GymStudent student) {
        getStudentById(id);
        student.setId(id);
        return repository.save(student);
    }

}
