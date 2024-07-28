-- 코드를 작성해주세요
Select count(*) as FISH_COUNT
From FISH_INFO
where LENGTH < 10 OR LENGTH IS NULL
