PROBLEM:
2609 - Products by Categories
ANSWER:
Accepted
LANGUAGE:
PostgreSQL (psql 9.4.19)
RUNTIME:
0.002s
FILE SIZE:
113 Bytes
MEMORY:
-
SUBMISSION:
1/9/18, 11:10:25 AM

select b.name, sum(a.amount) as sum
from products a, categories b
where a.id_categories = b.id
GROUP BY b.name