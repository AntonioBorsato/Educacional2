alter table matriculas add turma_id int;

alter table matriculas add constraint FK_turmamatricula
foreign key (turma_id) references turmas(id);