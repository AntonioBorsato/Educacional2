alter table notas add aluno_id int;

alter table notas add constraint FK_alunonotas
foreign key (aluno_id) references alunos(id);