package grupointegrado.com.educacional.matriculas.dto;

import grupointegrado.com.educacional.aluno.model.Aluno;
import grupointegrado.com.educacional.turmas.model.Turma;

public record MatriculaRequestDTO(Aluno aluno, Turma turma) {
}
