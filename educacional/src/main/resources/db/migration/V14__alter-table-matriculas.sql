alter table matriculas add aluno_id int;

alter table matriculas add constraint FK_alunomatricula
foreign key (aluno_id) references alunos(id);