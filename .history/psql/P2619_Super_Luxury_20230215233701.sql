-- PROBLEM: 2619 - Super Luxury
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.002s
-- FILE SIZE: 195 Bytes
-- MEMORY: -
-- SUBMISSION: 1/9/18, 4:31:39 PM
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2619

select a.name, b.name , a.price
from products a,
     providers b,
     categories c
where a.id_providers = b.id
and   a.id_categories = c.id
and a.price > 1000
and c.name = 'Super Luxury'