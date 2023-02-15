-- PROBLEM:
-- 2616 - No Rental
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 182 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 1/9/18, 4:15:45 PM
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2616

SELECT  l.id,l.name
FROM    customers l
WHERE   NOT EXISTS
        (
        SELECT  id_customers
        FROM    locations r
        WHERE   r.id_customers = l.id
        )