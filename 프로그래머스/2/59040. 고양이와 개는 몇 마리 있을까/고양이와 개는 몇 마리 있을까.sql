-- 코드를 입력하세요
SELECT animal_type, count(ANIMAL_TYPE)
from ANIMAL_INS
group by animal_type
order by animal_type