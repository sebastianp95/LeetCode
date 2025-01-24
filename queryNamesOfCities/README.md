## Query American City Names with Population Greater Than 120,000
Query the `NAME` field for all American cities in the `CITY` table with populations larger than `120,000`. The `CountryCode` for America is `USA`.

The `CITY` table is described as follows:

![CITY Table Schema](https://s3.amazonaws.com/hr-challenge-images/8137/1449729804-f21d187d0f-CITY.jpg)

---

### SQL Query
```sql
SELECT NAME 
FROM CITY
WHERE POPULATION > 120000 AND COUNTRYCODE = "USA"
```

### Your Output (stdout)            ### Expected Output
- Scottsdale                         - Scottsdale
- Corona                             - Corona
- Concord                            - Concord
- Cedar Rapids                       - Cedar Rapids
