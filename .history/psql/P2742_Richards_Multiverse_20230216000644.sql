-- PROBLEM:
-- 2742 - Richard's Multiverse
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.002s
-- FILE SIZE:
-- 233 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 3/30/18, 5:44:31 AM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2625

select t1.name, round(t1.omega*1.618::numeric, 3) as "The N Factor"
from life_registry t1, dimensions t2
where t1.dimensions_id = t2.id
and t1.name like 'Richard%'
and t2.name in ('C774','C875')
order by t1.omega asc