-- PROBLEM: 2603 - Customer Address
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.001s
-- FILE SIZE: 61 Bytes
-- MEMORY: -
-- SUBMISSION: 1/9/18, 10:00:09 AM
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2603

select name, street 
from customers 
where city = 'Porto Alegre'