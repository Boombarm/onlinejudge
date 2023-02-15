-- PROBLEM: 2606 - Categories
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.003s
-- FILE SIZE: 108 Bytes
-- MEMORY: -
-- SUBMISSION: 1/9/18, 10:39:09 AM

select a.id,a.name 
from products a, categories b 
where a.id_categories = b.id 
and b.name like 'super%'