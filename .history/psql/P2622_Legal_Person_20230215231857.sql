-- PROBLEM:
-- 2622 - Legal Person
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 83 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 1/10/18, 3:20:55 AM
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2622

select name
from customers a
RIGHT JOIN legal_person b
ON a.id = b.id_customers;