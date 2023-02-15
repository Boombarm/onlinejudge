-- PROBLEM: 2745 - Taxes
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.001s
-- FILE SIZE: 76 Bytes
-- MEMORY: -
-- SUBMISSION: 3/29/18, 5:00:45 PM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2745

select name, ROUND(salary * 0.1, 2) as tax
from people
where salary > 3000