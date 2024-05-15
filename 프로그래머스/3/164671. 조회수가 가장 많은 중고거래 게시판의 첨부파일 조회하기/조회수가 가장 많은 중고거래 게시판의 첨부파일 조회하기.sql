-- 코드를 입력하세요
SELECT CONCAT('/home/grep/src/', f.BOARD_ID,'/', f.FILE_ID, f.FILE_NAME, f.FILE_EXT)
FROM (SELECT BOARD_ID
        FROM USED_GOODS_BOARD
        ORDER BY VIEWS DESC
        LIMIT 1) AS v JOIN USED_GOODS_FILE AS f ON v.BOARD_ID = f.BOARD_ID
ORDER BY f.FILE_ID DESC;