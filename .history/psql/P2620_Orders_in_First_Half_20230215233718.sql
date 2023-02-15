-- PROBLEM: 2620 - Orders in First Half
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.001s
-- FILE SIZE: 155 Bytes
-- MEMORY: -
-- SUBMISSION: 1/9/18, 5:09:55 PM
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2620

select a.name , b.id
from customers a,
     orders b
where b.id_customers = a.id
and b.orders_date < '2016-07-01'
order by b.id asc, b.orders_date asc