-- PROBLEM:
-- 2993 - Most Frequent
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.002s
-- FILE SIZE:
-- 87 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 12/2/19, 2:45:59 AM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2993

select mode() within group  (order by amount) as most_frequent_value
from value_table;