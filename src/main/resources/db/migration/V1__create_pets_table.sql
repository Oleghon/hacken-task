CREATE TABLE pets(
    id uuid NOT NULL PRIMARY KEY,
    name VARCHAR(200) NOT NULL,
    breed VARCHAR(200) NOT NULL,
    age NUMERIC(25) NOT NULL,
    weight NUMERIC(150) NOT NULL,
    description TEXT NOT NULL
);