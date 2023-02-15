-- PROBLEM:
-- 2995 - The Sensor Message
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 117 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 1/30/20, 9:52:53 AM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2995

SELECT temperature  ,COUNT(mark) AS number_of_records
	FROM records 
	GROUP BY temperature,mark
	ORDER BY mark asc