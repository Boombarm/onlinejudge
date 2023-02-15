(
    SELECT 'Podium: '||t1.team
    FROM (
            SELECT * FROM league ORDER BY position ASC LIMIT 3
            ) as t1
)
UNION ALL
(
    SELECT 'Demoted: '||t2.team
    FROM (
            SELECT * FROM league ORDER BY position DESC LIMIT 2
            ) as t2
    ORDER BY team ASC
)