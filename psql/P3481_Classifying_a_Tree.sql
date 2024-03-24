-- PROBLEM: 3481 - Classifying a Tree
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.005s
-- FILE SIZE: 976 Bytes
-- MEMORY: -
-- SUBMISSION: 3/24/24, 7:14:33 PM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://judge.beecrowd.com/en/problems/view/3480

with
  leaf_node as (
    -- คุณสมบัติของ leaf_node จะไม่มี node ถัดไป
    select node_id, 'LEAF' as "type"
    from nodes
    where pointer is null
  ),
  root_node as (
      -- คุณสมบัติของ root_node จะไม่มี node ไหน ชี้เข้าหา
      select node_id, 'ROOT' as type
      from nodes
      where node_id not in (
          select pointer from nodes
          where pointer is not null
      )
      limit 1
  ),
  inner_node as (
      -- คุณสมบัติของ inner_node จะมี node ที่ชี้เข้าหา และมี node ถัดไปเสมอ
      select node_id, 'INNER' as type
      from nodes
      where pointer is not null
      and node_id != (select node_id from root_node)
  )
select *
from leaf_node
union
SELECT * FROM inner_node
union
SELECT * FROM root_node
order by node_id