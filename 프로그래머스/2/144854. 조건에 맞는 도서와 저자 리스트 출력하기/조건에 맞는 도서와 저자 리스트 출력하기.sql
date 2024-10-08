-- 코드를 입력하세요
SELECT A.BOOK_ID as BOOK_ID, B.AUTHOR_NAME as AUTHOR_NAME, DATE_FORMAT(A.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK as A
LEFT JOIN AUTHOR as B ON A.AUTHOR_ID = B.AUTHOR_ID
WHERE A.CATEGORY LIKE '경제'
# GROUP BY A.AUTHOR_ID
ORDER BY PUBLISHED_DATE