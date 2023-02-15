-- PROBLEM:
-- 2617 - Provider Ajax SA
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.002s
-- FILE SIZE:
-- 110 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 1/9/18, 4:21:50 PM

select b.name, a.name
from providers a,
     products b
where a.id = b.id_providers
and a.name = 'Ajax SA'