# Write your MySQL query statement below
Select e.name AS Employee
From Employee e
JOIN Employee m
ON e.managerId = m.id
Where e.salary > m.salary;