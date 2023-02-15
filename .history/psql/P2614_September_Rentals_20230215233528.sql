-- PROBLEM: 2614 - September Rentals
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.002s
-- FILE SIZE: 130 Bytes
-- MEMORY: -
-- SUBMISSION: 1/9/18, 3:42:13 PM
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2614

select a.name, b.rentals_date
from customers a, rentals b
where b.id_customers = a.id
and b.rentals_date::text LIKE '2016-09-%'