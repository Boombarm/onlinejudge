-- PROBLEM:
-- 2740 - League
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.001s
-- FILE SIZE:
-- 352 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 3/29/18, 5:47:14 PM



(
    SELECT 'Podium: '|| t1.team
    FROM (
            SELECT * FROM league 
            ORDER BY position ASC 
            LIMIT 3
        ) as t1
)
UNION ALL
(
    SELECT 'Demoted: '|| t2.team
    FROM (
            SELECT * FROM league 
            ORDER BY position DESC 
            LIMIT 2
        ) as t2
    ORDER BY team ASC
)