INSERT INTO peliculas
    (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
VALUES
    ('Shrek',        90,  'ANIMADA',         NULL, '2024-06-01', 'D'),
    ('Inception',    148, 'CIENCIA_FICCION', NULL, '2010-07-16', 'D'),
    ('Titanic',      195, 'DRAMA',            4.6, '1997-12-19', 'D'),
    ('John Wick',    101, 'ACCION',          NULL, '2014-10-24', 'D'),
    ('El Conjuro',   112, 'TERROR',           3.0, '2013-07-19', 'D'),
    ('Coco',         105, 'ANIMADA',          4.7, '2017-10-27', 'D'),
    ('Interstellar', 169, 'CIENCIA_FICCION',  5.0, '2014-11-07', 'D')
ON CONFLICT (titulo) DO NOTHING;