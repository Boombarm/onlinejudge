-- PROBLEM:
-- 2613 - Cheap Movies
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 89 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 1/9/18, 2:46:29 PM


select a.id,a.name
from movies a, prices b
where a.id_prices = b.id
and b.value < 2.00