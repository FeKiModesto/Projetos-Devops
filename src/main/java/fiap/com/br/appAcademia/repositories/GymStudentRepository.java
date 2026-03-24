package fiap.com.br.appAcademia.repositories;

import fiap.com.br.appAcademia.models.GymStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymStudentRepository extends JpaRepository<GymStudent, Long> {
}
