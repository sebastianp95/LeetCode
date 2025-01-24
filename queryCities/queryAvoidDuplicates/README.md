## Query CITY Names with Even ID Numbers
Query a list of `CITY` names from the `STATION` table for cities that have an even ID number. Exclude duplicates from the result.  

The `STATION` table is described as follows:

![STATION Table Schema](https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg)

---

### SQL Query
```sql
SELECT DISTINCT CITY 
FROM STATION
WHERE ID % 2 = 0;
```

### Output

- Kissee Mills  
- Loma Mar  
- Tipton  
- Glencoe  
- Chignik Lagoon  
- Albany  
- Manchester  
- Cahone  
