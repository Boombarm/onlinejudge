-- PROBLEM:
-- 2744 - Passwords
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 55 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 3/29/18, 4:38:37 PM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2744

select id, password, md5(password) as MD5
from account