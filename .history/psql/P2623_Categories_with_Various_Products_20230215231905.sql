-- PROBLEM:
-- 2623 - Categories with Various Products
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 241 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 1/10/18, 4:22:53 AM
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2623

select a.name, b.name
from products a,
     categories b
where a.id_categories = b.id
and a.amount > 100
and 
(a.id_categories = 1 
 or a.id_categories = 2 
 or a.id_categories = 3
 or a.id_categories = 6
 or a.id_categories = 9
)