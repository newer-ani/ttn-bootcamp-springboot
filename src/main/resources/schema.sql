   create table Employee
    (
       id int not null,
       name varchar(255) not null,
       designation varchar(255),
       primary key(id)
    );

    INSERT INTO Employee(ID, NAME, DESIGNATION)
    VALUES (10001, 'Ranga', 'Senior Software Engineer'),
              (10002, 'James', 'Java Developer'),
              (10003, 'Pieter', 'React Native Developer');