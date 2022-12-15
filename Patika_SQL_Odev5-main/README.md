# Patika_SQL_Odev5
Patika.dev eğitimi kapsamında, SQL derslerinin 5. ödevi


1. film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en uzun (length) 5 filmi sıralayınız.


      ```    select title from film where title LIKE '%n' ORDER BY length DESC LIMIT 5   ```
      

2. film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en kısa (length) ikinci(6,7,8,9,10) 5 filmi(6,7,8,9,10) sıralayınız.


      ```   select title from film where title LIKE '%n' ORDER BY length ASC OFFSET 5 LIMIT 5;    ```
      

3. customer tablosunda bulunan last_name sütununa göre azalan yapılan sıralamada store_id 1 olmak koşuluyla ilk 4 veriyi sıralayınız.


      ```    select * from customer where store_id=1 order by last_name desc LIMIT 4;   ```





- [Patika](https://app.patika.dev/)
- [Patika Profilim](https://app.patika.dev/aytac)
