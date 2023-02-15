-- PROBLEM: 2625 - CPF Validation
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.001s
-- FILE SIZE: 345 Bytes
-- MEMORY: -
-- SUBMISSION: 1/10/18, 5:01:07 AM

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