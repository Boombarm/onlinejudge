-- PROBLEM: 3480 - Adjacent Chairs
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.004s
-- FILE SIZE: 1.77 KB
-- MEMORY: -
-- SUBMISSION: 3/24/24, 6:37:50 PM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://judge.beecrowd.com/en/problems/view/3480

with full_table as (
    WITH numbered_rows AS (select *,
                                 ROW_NUMBER() OVER (ORDER BY id) AS row_num
                          from chairs t
                          where available = true
                            and (
                                  (select available from chairs where queue = t.queue and id = t.id - 1) -- prev
                                  or
                                  (select available from chairs where queue = t.queue and id = t.id + 1) -- next
                              ))
               SELECT  curr.id as id
                       ,curr.queue as queue
                      ,(case
                           when prev.id is null then curr.id
                           when prev.queue != curr.queue then curr.id
                           when curr.id - 1 > prev.id then curr.id
                           else prev.id
                          end) as pair_with,
                      (case
                           when prev.id is null then 'left'
                           when prev.queue != curr.queue then 'left'
                           when curr.id - 1 > prev.id then 'left'
                           else 'right'
                          end) as side
               FROM numbered_rows curr
                        LEFT JOIN numbered_rows prev ON curr.row_num = prev.row_num + 1
)
select
    (
        select queue from full_table where pair_with = q.pair_with limit 1
    ) as queue,
    (
        select id from full_table where pair_with = q.pair_with and side = 'left'
    ) as left,
    (
        select id from full_table where pair_with = q.pair_with and side = 'right'
    ) as right
from
(select pair_with
    from full_table
    group by pair_with
) q
order by "left"