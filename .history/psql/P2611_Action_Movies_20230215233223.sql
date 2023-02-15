-- PROBLEM: 2611 - Action Movies
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.001s
-- FILE SIZE: 101 Bytes
-- MEMORY: -
-- SUBMISSION: 1/9/18, 11:23:39 AM
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2611

select a.id,a.name 
from movies a, genres b
where a.id_genres = b.id
and b.description = 'Action';