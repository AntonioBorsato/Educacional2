package grupointegrado.com.educacional.notas.dto;

import grupointegrado.com.educacional.aluno.model.Aluno;
import grupointegrado.com.educacional.disciplinas.model.Disciplina;

import java.util.Date;

public record NotaRequestDTO(Double nota, Date data_lancamento, Disciplina disciplina, Aluno aluno) {
}