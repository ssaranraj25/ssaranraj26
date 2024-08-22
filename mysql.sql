create database Demo11
use Demo11
CREATE TABLE Tab2(
std_reg INT PRIMARY KEY,
std_name VARCHAR(50) NOT NULL,
std_cgp DECIMAL(10,2)
);
SELECT * FROM Tab2;
INSERT INTO Tab2(std_reg,std_name,std_cgp)
VALUES(108,'saran',80),
(109,'rsk',70),
(110,'hdk',60);


 
DELETE FROM Tab2
WHERE std_reg=109;

ALTER TABLE Tab2
ADD std_depart VARCHAR(50);

SELECT * FROM Tab2
ORDER BY std_name ASC;

SELECT std_name,COUNT(*) AS num_student
FROM Tab2
GROUP BY std_depart;
