DELETE p1
FROM Person p1
INNER JOIN Person p2
ON p1.Email = p2.Email
WHERE p1.Id > p2.Id;
