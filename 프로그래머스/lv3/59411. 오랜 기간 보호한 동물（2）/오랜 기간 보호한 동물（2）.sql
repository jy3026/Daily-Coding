-- 코드를 입력하세요
SELECT i.ANIMAL_ID, i.NAME
FROM ANIMAL_INS AS i JOIN ANIMAL_OUTS AS o ON i.ANIMAL_ID = o.ANIMAL_ID
ORDER BY DATEDIFF(o.DATETIME,i.DATETIME) DESC
limit 2