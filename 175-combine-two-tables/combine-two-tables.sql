# Write your MySQL query statement below
-- select firstName,lastName,city,state from Person
-- left join Address on Person.personId =Address.personId  ---->one method

select p.firstName,p.lastName,a.city,a.state from Person p
left join Address a on p.personId =a.personId
-- we just giving the naming