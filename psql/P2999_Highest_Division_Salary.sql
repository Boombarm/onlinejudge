-- PROBLEM: 2999 - Highest Division Salary
-- ANSWER: Accepted
-- LANGUAGE: PostgreSQL (psql 9.4.19)
-- RUNTIME: 0.060s
-- FILE SIZE: 3.93 KB
-- MEMORY: -
-- SUBMISSION: 3/24/24, 4:45:33 PM
-- AUTHOR: Teerapat Phokhonwong
-- ProblemUrl: https://judge.beecrowd.com/en/problems/view/2999
-- Note: หาคนที่เงินเดือนเกินค่าเฉลี่ยในแผนก และมากกว่า 8000

-- #################################################
-- output
-- nome	                | salario
-- _________________________________
-- Jose Sampaio	        | 8700.00
-- Andre	            | 10350.00
-- Barbara	            | 9200.00
-- Jose da Silva	    | 10650.00
-- #################################################
-- departamento แผนก
-- empregado พนักงาน
-- #################################################

WITH lotacao_div_average AS
         (select main_empregado.lotacao_div,
                 ROUND(AVG(salary_by_matr.result)::numeric, 2 ) as salary_average
          from empregado main_empregado
                   left join (
              -- salary per matr
              select salary.matr,
                     salary.salary,
                     t_desconto.desconto,
                     (case
                          when t_desconto.desconto is not null then
                              salary.salary - t_desconto.desconto
                          else
                              salary.salary
                         end
                         ) as result
              from (select empregado.matr,
                           sum(t_salary.valor) as salary
                    from empregado
                             left join (select emp_venc.matr    as matr,
                                               vencimento.valor as valor,
                                               vencimento.nome
                                        from emp_venc
                                                 left join vencimento on emp_venc.cod_venc = vencimento.cod_venc
                                        order by matr, valor desc) t_salary on empregado.matr = t_salary.matr
                    group by empregado.matr) salary
                       left join (select empregado.matr, sum(desconto.valor) as desconto
                                  from empregado
                                           left join emp_desc on empregado.matr = emp_desc.matr
                                           left join desconto on emp_desc.cod_desc = desconto.cod_desc
                                  where desconto.valor is not null
                                  group by empregado.matr) t_desconto on t_desconto.matr = salary.matr
              -- END salary per matr
          ) salary_by_matr
                             on main_empregado.matr = salary_by_matr.matr
          where salary_by_matr.result is not null
          group by lotacao_div
)
select --*** Answer
       main_empregado.nome as nome,
       to_char (ROUND(salary_by_matr.result::numeric, 2), 'FM999999990.00') as salario
from empregado main_empregado
left join (
    -- salary per matr
    select salary.matr,
           salary.salary,
           t_desconto.desconto,
           (case
                when t_desconto.desconto is not null then
                    salary.salary - t_desconto.desconto
                else
                    salary.salary
               end
               ) as result
    from (select empregado.matr,
                 sum(t_salary.valor) as salary
          from empregado
                   left join (select emp_venc.matr    as matr,
                                     vencimento.valor as valor,
                                     vencimento.nome
                              from emp_venc
                                       left join vencimento on emp_venc.cod_venc = vencimento.cod_venc
                              order by matr, valor desc) t_salary on empregado.matr = t_salary.matr
          group by empregado.matr) salary
             left join (select empregado.matr, sum(desconto.valor) as desconto
                        from empregado
                                 left join emp_desc on empregado.matr = emp_desc.matr
                                 left join desconto on emp_desc.cod_desc = desconto.cod_desc
                        where desconto.valor is not null
                        group by empregado.matr) t_desconto on t_desconto.matr = salary.matr
    -- END salary per matr
) salary_by_matr
on main_empregado.matr = salary_by_matr.matr
left join lotacao_div_average on main_empregado.lotacao_div = lotacao_div_average.lotacao_div
where salary_by_matr.result is not null
and result >= 8000
and result >= lotacao_div_average.salary_average
order by main_empregado.lotacao_div;

