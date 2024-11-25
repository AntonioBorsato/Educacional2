alter table turmas add curso_id int;

alter table turmas add constraint FK_cursoturmas
foreign key (curso_id) references cursos(id);