-- PROBLEM:
-- 2996 - Package Delivery
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.003s
-- FILE SIZE:
-- 454 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 1/31/20, 2:22:56 AM


select year ,sender, receiver from 
(select id, year, 
(select name from users tt where t1.id_user_sender = tt.id ) as sender ,
(select name from users tt where t1.id_user_receiver = tt.id ) as receiver
-- select year , id_user_sender as sender, id_user_receiver as receiver
from packages t1
left join users t2 on t1.id_user_sender =  t2.id
where (t1.id_user_sender != 2 and t1.id_user_receiver != 2)
order by id desc
) tmain
order by year desc