-- PROBLEM:
-- 2618 - Imported Products
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 193 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 1/9/18, 4:27:01 PM
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2618

select a.name, b.name, c.name
from products a,
     providers b,
     categories c
where a.id_providers = b.id
and a.id_categories = c.id
and b.name = 'Sansul SA'
and c.name = 'Imported'