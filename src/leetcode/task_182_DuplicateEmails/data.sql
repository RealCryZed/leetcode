SELECT distinct email from Person WHERE email IN
(SELECT email FROM Person GROUP BY email HAVING count(*) > 1 )