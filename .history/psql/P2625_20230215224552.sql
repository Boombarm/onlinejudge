select concat(
            	substring(cpf from 1 for 3),
            	'.',
            	substring(cpf from 4 for 3),
            	'.',
                substring(cpf from 7 for 3),
            	'-',
                substring(cpf from 10 for 2)
             ) as CPF
from customers a
right join natural_person b
on b.id_customers = a.id