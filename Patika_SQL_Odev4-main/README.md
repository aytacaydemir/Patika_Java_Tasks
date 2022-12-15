# Patika_SQL_Odev4
Patika.dev eğitimi kapsamında, SQL derslerinin 4. ödevi



1. film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız.


```  select DISTINCT replacement_cost from film;  ```


2. film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?

``` select count(DISTINCT replacement_cost) from film;  ```  21

3. film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?

 ```  select count(*) from film where title LIKE 'T%' AND rating='G';  ```   9 

4. country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?

  ```  select count(*) from country where country LIKE '_____' ;  ```   13

5. city tablosundaki şehir isimlerinin kaç tanesi 'R' veya r karakteri ile biter?

  ```  select count(*) from city where city ILIKE '%r' ;  ```  33
  
  
  


- [Patika](https://app.patika.dev/)
- [Patika Profilim](https://app.patika.dev/aytac)
