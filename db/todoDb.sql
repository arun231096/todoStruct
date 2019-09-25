CREATE TABLE todo_user (
    id int PRIMARY KEY IDENTITY(1,1),
    username varchar(255) NOT NULL,
    password varchar(255),
    designation VARCHAR(255),
    email VARCHAR(255),
    mobile VARCHAR(255),
);

CREATE TABLE todo_table (
    id INT NOT NULL IDENTITY(1,1),
    title varchar(255) NOT NULL,
    message varchar(255),
    estimation INT,
    start_date VARCHAR(255),
    end_date VARCHAR(255),
    status VARCHAR(255),
    todo_user_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (todo_user_id) REFERENCES todo_user(id)
);

INSERT INTO todo_user (username, password) 
VALUES ('kumar', 'kumar');

SELECT *FROM todo_user;