package fiap.com.br.cp2Aluno.repositories;

import fiap.com.br.cp2Aluno.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}