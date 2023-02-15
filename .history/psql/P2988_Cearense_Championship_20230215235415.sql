-- PROBLEM:
-- 2988 - Cearense Championship
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.003s
-- FILE SIZE:
-- 1.22 KB
-- MEMORY:
-- -
-- SUBMISSION:
-- 11/28/19, 8:26:12 AM


select a.name as name , 
    (
        select count(*)
        from matches
        where matches.team_1 = a.id or matches.team_2 = a.id 
    ) as amount,
    (
        SELECT SUM(
                CASE
                    WHEN (n.team_1 = a.id and n.team_1_goals > n.team_2_goals ) or (n.team_2 = a.id and n.team_2_goals > n.team_1_goals)
                        THEN 1
                    ELSE 0
                END)
        from matches n
    ) as victories,
    (
        SELECT SUM(
                CASE
                    WHEN (n.team_1 = a.id and n.team_1_goals < n.team_2_goals ) or (n.team_2 = a.id and n.team_2_goals < n.team_1_goals)
                        THEN 1
                    ELSE 0
                END)
        from matches n
    ) as defeats,
    (
        SELECT SUM(
                CASE
                    WHEN (n.team_1 = a.id and n.team_1_goals = n.team_2_goals ) or (n.team_2 = a.id and n.team_2_goals = n.team_1_goals)
                        THEN 1
                    ELSE 0
                END)
        from matches n
    ) as draws,
    (
        SELECT SUM(
                CASE
                    WHEN (n.team_1 = a.id and n.team_1_goals > n.team_2_goals ) or (n.team_2 = a.id and n.team_2_goals > n.team_1_goals)
                        THEN 3
                    WHEN (n.team_1 = a.id and n.team_1_goals = n.team_2_goals ) or (n.team_2 = a.id and n.team_2_goals = n.team_1_goals) 
                        THEN 1
                    ELSE 0
                END)
        from matches n
    ) as score
from teams a
order by score desc;