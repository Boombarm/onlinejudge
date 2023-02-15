-- PROBLEM: 2990 - Employees CPF
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.002s
-- FILE SIZE: 216 Bytes
-- MEMORY: -
-- SUBMISSION: 1/30/20, 8:16:13 AM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://www.beecrowd.com.br/judge/en/problems/view/2990

select t1.cpf, t1.enome, t2.dnome
from empregados t1
left join departamentos t2 on t1.dnumero = t2.dnumero 
where CAST(t1.cpf AS bigint) not in (
 	select CAST(cpf_emp AS bigint) from trabalha
)
order by t1.cpf