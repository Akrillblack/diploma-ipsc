INSERT INTO shooter_class (shooterClass_id, class_name)
VALUES
(1, 'Open'),
(2, 'Standard'),
(3, 'Modify'),
(4, 'Manual');

INSERT INTO category (category_id, category_name)
VALUES
(1, 'Overall'),
(2, 'Senior'),
(3, 'Lady');

INSERT INTO shooter (shooter_id, shooter_name, shooter_surname, category_id, shooter_city, shooter_country, shooter_class_id)
VALUES
(1, 'Ivan', 'Ivanov', 1, 'Brest', 'Belarus', 1),
(2, 'Sergey', 'Petrov', 2, 'Moscow', 'Russia', 2),
(3, 'Petr', 'Petrov', 1, 'Minsk', 'Belarus', 3),
(4, 'Elena', 'Romanova', 3, 'Gomel', 'Belarus', 1),
(5, 'Sergey', 'Ivanov', 2, 'SPB', 'Russia', 2),
(6, 'Vladimir', 'Sokolov', 1, 'Orel', 'Russia', 3),
(7, 'Kate', 'Vilks', 3, 'Vilnius', 'Lithuania', 1),
(8, 'Vladislav', 'Mikuts', 2, 'Vitebsk', 'Belarus', 4),
(9, 'Svetlana', 'Kosheva', 3, 'Minsk', 'Belarus', 4),
(10, 'Nikolay', 'Degtyarik', 2, 'Brest', 'Belarus', 1),
(11, 'Dmitri', 'Potapov', 1, 'Gomel', 'Belarus', 3),
(12, 'Alena', 'Karelina', 3, 'Grodno', 'Belarus', 1);