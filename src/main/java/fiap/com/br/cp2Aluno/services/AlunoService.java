package fiap.com.br.cp2Aluno.services;

import fiap.com.br.cp2Aluno.models.Aluno;
import fiap.com.br.cp2Aluno.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<Aluno> getAllStudents() {
        return repository.findAll();
    }

    public Aluno getStudentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    public Aluno addStudent(Aluno aluno) {
        return repository.save(aluno);
    }

    public Aluno updateStudent(Long id, Aluno alunoAtualizado) {
        Aluno aluno = getStudentById(id);
        aluno.setName(alunoAtualizado.getName());
        aluno.setCpf(alunoAtualizado.getCpf());
        aluno.setBirthDate(alunoAtualizado.getBirthDate());
        aluno.setAge(alunoAtualizado.getAge());
        aluno.setActive(alunoAtualizado.getActive());
        return repository.save(aluno);
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
