select t.id from Weather t
join Weather p
on datediff(t.recordDate,p.recordDate)=1
where t.temperature > p.temperature


