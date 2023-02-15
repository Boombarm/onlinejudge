-- PROBLEM:
-- 2738 - Contest
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 173 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 3/29/18, 6:08:39 PM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2738


select t1.name,ROUND(((t2.math*2)+(t2.specific*3) + (t2.project_plan*5))/10::numeric,2) as avg
from candidate t1, score t2
where t1.id = t2.candidate_id
order by avg desc