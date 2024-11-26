package grupointegrado.com.educacional.disciplinas.dto;

import grupointegrado.com.educacional.cursos.model.Curso;
import grupointegrado.com.educacional.professores.model.Professor;

public record DisciplinaRequestDTO(String nome, String codigo, Curso curso, Professor professor) {
}
