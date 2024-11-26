package grupointegrado.com.educacional.turmas.dto;

import grupointegrado.com.educacional.cursos.model.Curso;

public record TurmaRequestDTO(Integer ano, Integer semestre, Curso curso) {
}
