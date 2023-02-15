select a.id,a.name 
from products a, categories b 
where a.id_categories = b.id 
and b.name like 'super%'