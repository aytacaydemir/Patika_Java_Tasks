# Patika_SQL_Odev8
Patika.dev eğitimi kapsamında, SQL derslerinin 8. ödevi




1. test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.


```
CREATE TABLE employee (
    id INTEGER ,
    name VARCHAR(50) ,
	birthday date,
	email VARCHAR(50)
);
```


2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.


```
insert into employee (id, name, birthday, email) values (1, 'eyezafovich0', '2021-11-13', 'hwindas0@wired.com');
insert into employee (id, name, birthday, email) values (2, 'wmcallan1', '2022-03-01', 'mtartt1@mashable.com');
insert into employee (id, name, birthday, email) values (3, 'mbretland2', '2021-11-30', 'btreharne2@xing.com');
insert into employee (id, name, birthday, email) values (4, 'kwillan3', '2022-02-05', 'slackham3@cpanel.net');
insert into employee (id, name, birthday, email) values (5, 'cmetterick4', '2022-04-18', 'rarchibold4@miibeian.gov.cn');
insert into employee (id, name, birthday, email) values (6, 'jdurrell5', '2022-02-05', 'gcullinane5@printfriendly.com');
...
...
...
```

3. Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.


```
UPDATE employee
SET name = 'Aytac',
	birthday = '1995-01-18',
	email='aytacaydemr@gmail.com'
WHERE id = 1;
```

4. Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

```
DELETE from employee
where name='Aytac';
```





- [Patika](https://app.patika.dev/)
- [Patika Profilim](https://app.patika.dev/aytac)
