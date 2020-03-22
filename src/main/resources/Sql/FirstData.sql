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

INSERT INTO shooter (shooter_id, shooter_name, shooter_surname, category_id, shooter_city, shooter_country, shooterClass_id)
VALUES
(1, 'Ivan', 'Ivanov', 1, 'Brest', 'Belarus', 1),
(2, 'Sergey', 'Petrov', 2, 'Moscow', 'Russia', 2);