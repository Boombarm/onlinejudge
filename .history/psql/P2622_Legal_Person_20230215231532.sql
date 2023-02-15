select name
from customers a
RIGHT JOIN legal_person b
ON a.id = b.id_customers;