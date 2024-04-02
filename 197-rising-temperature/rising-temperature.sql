# Write your MySQL query statement below
SELECT a.id as id
FROM Weather a
INNER JOIN Weather b ON DATEDIFF(a.recordDate, b.recordDate) = 1
WHERE a.temperature > b.temperature
