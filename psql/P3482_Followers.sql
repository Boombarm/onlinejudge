-- PROBLEM: 3482 - Followers
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.005s
-- FILE SIZE: 1.25 KB
-- MEMORY: -
-- SUBMISSION: 3/24/24, 11:25:27 AM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://judge.beecrowd.com/en/problems/view/3482


select distinct on (winner, u1_name, u2_name) u1_name, u2_name from (select main.winner,
    (case when main.winner = main.u1_user_id then main.u1_name else main.u2_name end ) as u1_name,
    (case when main.winner != main.u2_user_id then main.u2_name else main.u1_name end ) as u2_name
from (
select q.u1_user_id, q.u1_name, q.u2_user_id, q.u2_name,
    (case when q.u1_posts < q.u2_posts
        then
            q.u1_user_id
        else
            q.u2_user_id
        end
    ) as winner
from
(
select t1.user_id as u1_user_id,
        t1.user_name as u1_name,
        t1.posts as u1_posts,
        t2.following_user_id_fk,
        t2.following_user_id_fk as u2_user_id,
        (select user_name from users where user_id = t2.following_user_id_fk) as u2_name,
        (select posts from users where user_id = t2.following_user_id_fk) as u2_posts
            from users t1
            right join followers t2
            on t1.user_id = t2.user_id_fk -- a follow b
            and t2.user_id_fk in (select following_user_id_fk
                   from followers
                   where user_id_fk = t2.following_user_id_fk)
             where t1.user_id is not null
             order by user_id
) q ) main order by main.winner) result;