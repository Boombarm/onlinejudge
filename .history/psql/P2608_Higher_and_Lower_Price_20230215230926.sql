-- PROBLEM:
-- 2608 - Higher and Lower Price
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 43 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 1/9/18, 10:51:32 AM
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2608

select max(price), min(price) 
from products