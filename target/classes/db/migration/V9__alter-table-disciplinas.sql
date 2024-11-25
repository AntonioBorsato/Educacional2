alter table disciplinas add curso_id int;

alter table disciplinas add constraint FK_cursodisciplinas
foreign key (curso_id) references cursos(id);