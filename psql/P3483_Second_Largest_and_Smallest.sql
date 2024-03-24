-- PROBLEM: 3483 - Second Largest and Smallest
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.001s
-- FILE SIZE: 359 Bytes
-- MEMORY: -
-- SUBMISSION: 3/24/24, 9:50:35 AM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://judge.beecrowd.com/en/problems/view/3483
-- เอาข้อมูลที่ค่า population มากที่สุด อันดับที่สอง และ population น้อยที่สุดอันดับที่สอง

create view solved as
select city_name, population
from (
    select city_name,
      population,
      RANK() OVER (
          ORDER BY population desc
      ) as largest_rank,
      RANK() OVER (
          ORDER BY population asc
      ) as smallest_rank
    from cities
    order by population desc
) t
where t.largest_rank = 2
or t.smallest_rank = 2
order by t.population desc