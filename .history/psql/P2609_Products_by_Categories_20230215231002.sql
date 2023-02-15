select b.name, sum(a.amount) as sum
from products a, categories b
where a.id_categories = b.id
GROUP BY b.name