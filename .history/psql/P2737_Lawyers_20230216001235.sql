-- PROBLEM:
-- 2737 - Lawyers
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 350 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 3/29/18, 4:28:43 PM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2625

    select name , customers_number 
    from lawyers
    where customers_number = (select max(customers_number) from lawyers)
UNION ALL
	select name , customers_number 
    from lawyers
	where customers_number = (select min(customers_number) from lawyers)
UNION ALL
	SELECT 'Average' AS name, sum(customers_number)/count(*) AS sum
	FROM lawyers