package grupointegrado.com.educacional.matriculas.controller;

import grupointegrado.com.educacional.matriculas.model.Matricula;
import grupointegrado.com.educacional.matriculas.dto.MatriculaRequestDTO;
import grupointegrado.com.educacional.matriculas.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaRepository repository;

    @GetMapping
    public ResponseEntity<List<Matricula>> findAll() {
        List<Matricula> matriculas = repository.findAll();
        return ResponseEntity.ok(matriculas);
    }

    @PostMapping
    public ResponseEntity<Matricula> save(@RequestBody MatriculaRequestDTO dto) {
        Matricula matricula = new Matricula();
        matricula.setAluno(dto.aluno());
        matricula.setTurma(dto.turma());

        Matricula savedMatricula = repository.save(matricula);
        return ResponseEntity.ok(savedMatricula);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Matricula> update(@PathVariable Integer id, @RequestBody MatriculaRequestDTO dto) {
        Matricula matricula = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Matrícula não encontrada com o ID especificado."));

        matricula.setAluno(dto.aluno());
        matricula.setTurma(dto.turma());

        Matricula updatedMatricula = repository.save(matricula);
        return ResponseEntity.ok(updatedMatricula);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        Matricula matricula = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Matrícula não encontrada com o ID especificado."));

        repository.delete(matricula);
        return ResponseEntity.noContent().build();
    }
}