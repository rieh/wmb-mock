create schema mqm authorization mqm

CREATE TABLE component ( 
  id INTEGER NOT NULL GENERATED BY DEFAULT AS IDENTITY, 
  name VARCHAR(255) NOT NULL, 
  PRIMARY KEY (id),
  CONSTRAINT ix1 UNIQUE (name) 
);

CREATE TABLE lookup ( 
  id INTEGER NOT NULL GENERATED BY DEFAULT AS IDENTITY, 
  component_id INTEGER NOT NULL, 
  name VARCHAR(255) NOT NULL, 
  value VARCHAR(255), 
  ttl INTEGER NOT NULL, 
  ttd INTEGER NOT NULL, 
  CONSTRAINT ix1 UNIQUE (name), 
  PRIMARY KEY (id), 
  CONSTRAINT fk1 FOREIGN KEY (component_id) REFERENCES component (id) 
);