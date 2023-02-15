-- PROBLEM:
-- 2604 - Under 10 or Greater Than 100
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 65 Bytes
-- MEMORY: -
-- SUBMISSION: 1/9/18, 10:20:47 AM

select id, name 
from products  
where price < 10 
or price > 100