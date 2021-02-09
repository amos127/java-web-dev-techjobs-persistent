## Part 1: Test it with SQL

SELECT COLUMN_NAME, DATA_TYPE FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME='job';

id / int
employer / varchar
name / varchar
skills / varchar

## Part 2: Test it with SQL

SELECT name FROM employer WHERE location LIKE 'Saint Louis';

## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL

SELECT DISTINCT skill.name, skill.description
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
ORDER BY skill.name ASC;