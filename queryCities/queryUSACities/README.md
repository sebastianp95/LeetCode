## Query American Cities with Population Greater Than 100,000

Query all columns for all American cities in the `CITY` table with populations larger than `100,000`. The `CountryCode` for America is `USA`.

The `CITY` table is described as follows:

![CITY Table Schema](https://s3.amazonaws.com/hr-challenge-images/8137/1449729804-f21d187d0f-CITY.jpg)

---

## SQL Query
```sql
SELECT *
FROM CITY
WHERE Population > 100000
  AND CountryCode = 'USA';
