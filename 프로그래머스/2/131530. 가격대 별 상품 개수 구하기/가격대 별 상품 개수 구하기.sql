-- 코드를 입력하세요
SELECT FLOOR(price/10000) * 10000 as PRICE_GROUP, count(*) as PRODUCTS
from product
group by FLOOR(price/10000) * 10000
order by PRICE_GROUP