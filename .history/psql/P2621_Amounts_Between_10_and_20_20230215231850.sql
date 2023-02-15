-- PROBLEM:
-- 2621 - Amounts Between 10 and 20
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 132 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 1/9/18, 5:14:37 PM
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2621

select b.name
from providers a,
     products b
where a.id = b.id_providers
and b.amount between 10 and 20
and a.name like 'P%'