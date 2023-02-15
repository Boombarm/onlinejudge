PROBLEM:
2624 - Number of Cities per Customers
ANSWER:
Accepted
LANGUAGE:
PostgreSQL (psql 9.4.19)
RUNTIME:
0.001s
FILE SIZE:
52 Bytes
MEMORY:
-
SUBMISSION:
1/10/18, 4:28:14 AM

select count(DISTINCT city) as count
from customers