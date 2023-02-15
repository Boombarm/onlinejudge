-- PROBLEM:
-- 2615 - Expanding the Business
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 42 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 1/9/18, 3:46:51 PM


select city from customers
GROUP BY city;