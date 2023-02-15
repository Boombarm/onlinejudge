-- PROBLEM:
-- 2741 - Students Grades
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 89 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 3/29/18, 4:45:27 PM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2741

select 'Approved: '|| name, grade
from students
where grade >= 7
order by grade desc
