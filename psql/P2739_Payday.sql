-- PROBLEM: 2739 - Payday
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.001s
-- FILE SIZE: 66 Bytes
-- MEMORY: -
-- SUBMISSION: 3/29/18, 5:17:39 PM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2739

select name ,  EXTRACT(DAY FROM payday)::integer as day
from loan