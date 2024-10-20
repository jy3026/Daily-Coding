-- 코드를 입력하세요
SELECT a.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY, SUM(b.PRICE * s.SALES) AS TOTAL_SALES
FROM BOOK AS b JOIN AUTHOR AS a ON b.AUTHOR_ID = a.AUTHOR_ID
        JOIN BOOK_SALES AS s ON b.BOOK_ID = s.BOOK_ID
WHERE SALES_DATE LIKE '2022-01%'
GROUP BY a.AUTHOR_ID, b.CATEGORY
ORDER BY a.AUTHOR_ID, b.CATEGORY DESC;