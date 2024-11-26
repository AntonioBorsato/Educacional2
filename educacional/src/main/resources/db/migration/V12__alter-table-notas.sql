alter table notas add disciplina_id int;

alter table notas add constraint FK_disciplina
foreign key (disciplina_id) references disciplinas(id);