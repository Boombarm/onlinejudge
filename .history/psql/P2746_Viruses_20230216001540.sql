-- PROBLEM: 2746 - Viruses
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.001s
-- FILE SIZE: 50 Bytes
-- MEMORY: -
-- SUBMISSION: 3/29/18, 5:04:01 PM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2746

select replace(name, 'H1', 'X') as name 
from virus