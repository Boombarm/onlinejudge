-- PROBLEM: 2607 - Providers' City in Alphabetical Order
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.001s
-- FILE SIZE: 40 Bytes
-- MEMORY: -
-- SUBMISSION: 1/9/18, 10:46:33 AM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2607

select city 
from providers 
ORDER BY city