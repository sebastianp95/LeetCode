## Query All Attributes of Every Japanese City in the CITY Table
Query all attributes of every Japanese city in the `CITY` table. The `COUNTRYCODE` for Japan is `JPN`.

The `CITY` table is described as follows:

![CITY Table Schema](https://s3.amazonaws.com/hr-challenge-images/8137/1449729804-f21d187d0f-CITY.jpg)

---

### SQL Query
```sql
SELECT * 
FROM CITY
WHERE COUNTRYCODE = "JPN";
```

### Output

- 1613 Neyagawa JPN Osaka 257315  
- 1630 Ageo JPN Saitama 209442  
- 1661 Sayama JPN Saitama 162472  
- 1681 Omuta JPN Fukuoka 142889  
- 1739 Tokuyama JPN Yamaguchi 107078  
