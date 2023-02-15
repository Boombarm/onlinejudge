-- PROBLEM: 2602 - Basic Select
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 45 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 1/1/18, 9:19:40 AM

select name 
from customers 
where state = 'RS'