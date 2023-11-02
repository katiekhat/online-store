CREATE TABLE users (
    id serial PRIMARY KEY,
    email text NOT NULL UNIQUE,
    password text,
    first_name text,
    last_name text,
    last_login_date date,
    active boolean NOT NULL DEFAULT true,
    changed_by integer,
    changed_at date,
    created_by integer,
    created_at date
);

CREATE TABLE products (
    id serial PRIMARY KEY,
    ean text NOT NULL UNIQUE,
    name text,
    company_id int REFERENCES companies(id),
    country_id int REFERENCES countries(id),
    description text,
    active boolean NOT NULL DEFAULT true,
    changed_by int,
    changed_at date,
    created_by int,
    created_at date
);
INSERT INTO users (email, password, first_name, last_name, created_at)
VALUES
    ('info@example.com', 'password1', 'Keti', 'Khatiashvili', now());
