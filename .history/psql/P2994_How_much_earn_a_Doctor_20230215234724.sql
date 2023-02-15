-- PROBLEM:
-- 2994 - How much earn a Doctor?
-- ANSWER:
-- Accepted
-- LANGUAGE:
-- PostgreSQL (psql 9.4.19)
-- RUNTIME:
-- 0.004s
-- FILE SIZE:
-- 285 Bytes
-- MEMORY:
-- -
-- SUBMISSION:
-- 1/31/20, 3:16:58 AM


select t1.name, 
(select  cast(sum( (t2.hours * 150) + (((t2.hours * 150) * t3.bonus)/ 100))  as decimal(10,1) ))  as salary 
from doctors t1
left join attendances t2 on t1.id = t2.id_doctor
left join work_shifts t3 on t2.id_work_shift = t3.id
group by t1.id
order by salary desc