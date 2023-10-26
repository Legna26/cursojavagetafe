UPDATE TB_GUERREROS SET vehiculo_id = 3

SELECT * FROM TB_VEHICULOS_GUERRA;

ALTER TABLE TB_VEHICULOS_GUERRA MODIFY tipo ENUM('Nave Terricola', 'Nave Marciana');
UPDATE TB_VEHICULOS_GUERRA SET tipo = Nave Terricola;

DROP TABLE IF EXISTS TB_VEHICULOS_GUERRA;

CREATE TABLE TB_VEHICULOS_GUERRA (
    id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "id autoincremental",
    nombre varchar(20) not null COMMENT "NOMBRE",
    ataque NUMERIC(2) NOT NULL DEFAULT 5,
    defensa NUMERIC(2) NOT NULL DEFAULT 5,
    tipo ENUM('Nave Terricola', 'Nave Marciana') NOT NULL
);

INSERT INTO TB_VEHICULOS_GUERRA (nombre, tipo, ataque, defensa) 
VALUES ("Galáctica", "Nave Terricola", 6, 4);

INSERT INTO TB_VEHICULOS_GUERRA (nombre, tipo, ataque, defensa) 
VALUES ("Estrella Milenaria", "Nave Marciana", 8, 2);

SELECT * FROM TB_GUERREROS;

UPDATE TB_GUERREROS SET vehiculo_id = 1 WHERE tipo='Terrícola';

UPDATE TB_GUERREROS SET tipo='Terricola' WHERE vehiculo_id = 1;