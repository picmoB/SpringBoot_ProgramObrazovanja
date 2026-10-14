insert into polaznik(ime, prezime)
values
    ('Šime', 'Šimić'),
    ('Jure', 'Jurić'),
    ('Frane', 'Franić');

insert into program_obrazovanja(naziv, csvet)
values
    ('Java', '5'),
    ('Python', '5'),
    ('C++', '5');

insert into upis(polaznik_id, program_obrazovanja_id)
values
    (1, 1),
    (2, 2),
    (3, 3);
