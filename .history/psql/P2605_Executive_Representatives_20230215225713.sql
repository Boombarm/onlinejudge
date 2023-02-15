select a.name, b.name 
from products a, providers b, categories c
where a.id_providers = b.id
and a.id_categories = c.id
and a.id_categories = 6