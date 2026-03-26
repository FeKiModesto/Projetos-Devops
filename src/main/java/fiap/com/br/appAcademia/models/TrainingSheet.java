package fiap.com.br.appAcademia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TrainingSheet {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String exerciceName;
    private Integer repsNumber;
    private Integer seriesNumber;
    private Boolean active;
}
