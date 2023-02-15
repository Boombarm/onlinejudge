-- PROBLEM: 2743 - Number of Characters
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.001s
-- FILE SIZE: 69 Bytes
-- MEMORY: -
-- SUBMISSION: 3/29/18, 4:36:19 PM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2743

select name, length(name) as length 
from people
order by length DESC