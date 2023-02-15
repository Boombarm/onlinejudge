-- PROBLEM: 2610 - Average Value of Products
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.001s
-- FILE SIZE: 61 Bytes
-- MEMORY: -
-- SUBMISSION: 1/9/18, 11:19:35 AM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2610

select round((sum(price)/count(*)),2) as price 
from products 