CREATE TABLE countries (
    id serial PRIMARY KEY,
    iso_code_2 character(2) NOT NULL,
    iso_code_3 character(3) NOT NULL,
    name text NOT NULL,
    name_geo text
);
CREATE TABLE companies (
    id serial PRIMARY KEY,
    parent_id integer,
    country_id integer REFERENCES countries(id),
    name text,
    name_geo text,
    active boolean NOT NULL DEFAULT true,
    changed_by integer,
    changed_at date,
    created_by integer,
    created_at date
);

INSERT INTO countries (iso_code_2, iso_code_3, name, name_geo)
VALUES
    ('US', 'USA', 'United States', 'ამერიკა'),
    ('CA', 'CAN', 'Canada', 'კანადა'),
    ('UK', 'GBR', 'United Kingdom', 'გაერთიანებული სამეფო'),
	('GE', 'GEO', 'Georgia', 'საქართველო'),
	('DE', 'DEU', 'Germany', 'გერმანია');

