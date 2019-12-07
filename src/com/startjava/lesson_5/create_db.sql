CREATE DATABASE jaegers;

CREATE TABLE Jaegers (
	id SERIAL PRIMARY KEY,
	modelName TEXT,
	mark SMALLINT,
	height REAL,
	weight REAL,
	status TEXT,
	origin TEXT,
	launch DATE,
	kaijuKILL SMALLINT
);




