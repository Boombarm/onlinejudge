-- PROBLEM:
-- 3001 - Update sem Where
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.002s
-- FILE SIZE:
-- 166 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 1/27/20, 8:40:27 AM
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/3001

select t.name,
(select CASE t.type  
 	when 'A' then 20.0
	when 'B' then 70.0
	when 'C' then 530.5
 END) as price
from products as t
order by price ,t.id desc;