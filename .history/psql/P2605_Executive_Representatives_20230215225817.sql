-- PROBLEM:
-- 2605 - Executive Representatives
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.002s
-- FILE SIZE: 147 Bytes
-- MEMORY: -
-- SUBMISSION: 1/9/18, 10:29:22 AM

select a.name, b.name 
from products a, providers b, categories c
where a.id_providers = b.id
and a.id_categories = c.id
and a.id_categories = 6