PROBLEM:
2610 - Average Value of Products
ANSWER:
Accepted
LANGUAGE:
PostgreSQL (psql 9.4.19)
RUNTIME:
0.001s
FILE SIZE:
61 Bytes
MEMORY:
-
SUBMISSION:
1/9/18, 11:19:35 AM


select round((sum(price)/count(*)),2) as price 
from products 