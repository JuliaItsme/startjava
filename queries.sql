1. 
 SELECT * FROM Jaegers;
2.
SELECT * FROM Jaegers WHERE status = 'destroyed';
3.
SELECT * FROM Jaegers WHERE mark = '1' OR mark = '6';
4. 
SELECT * FROM Jaegers ORDER BY mark DESC;
5.
SELECT * FROM Jaegers WHERE LAUNCH = (SELECT MIN(launch) FROM Jaegers);
6. 
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers);
7.
SELECT AVG(weight) FROM Jaegers;
8.
UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'life';
9.
DELETE FROM Jaegers WHERE status = 'destroyed';