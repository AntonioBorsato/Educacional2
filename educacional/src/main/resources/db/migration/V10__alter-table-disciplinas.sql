alter table disciplinas add professor_id int;

alter table disciplinas add constraint FK_professor
foreign key (professor_id) references professores(id);