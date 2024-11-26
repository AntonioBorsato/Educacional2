package grupointegrado.com.educacional.notas.model;

import grupointegrado.com.educacional.aluno.model.Aluno;
import grupointegrado.com.educacional.cursos.model.Curso;
import grupointegrado.com.educacional.disciplinas.model.Disciplina;
import grupointegrado.com.educacional.turmas.model.Turma;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "notas")
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Double nota;

    @Column
    @Temporal(TemporalType.DATE)
    private Date data_lancamento;

    @ManyToOne
    @JoinColumn(name = "aluno_id", referencedColumnName = "id")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "disciplina_id", referencedColumnName = "id")
    private Disciplina disciplina;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Date getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(Date data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}