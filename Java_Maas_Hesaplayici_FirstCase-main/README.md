# Java Maaş Hesaplayıcı

Çalışana ait bilgiler(kullanıcı tarafından girilen) ile çalışanın vergi, maaş artışı(zammı) ve ek mesai ücretlerini hesaplıyoruz. 

## Açıklama

Java'da içerisinde 4 nitelik ve 5 metod bulunduran bir [Employee](https://github.com/aytacaydemir/Java_Maas_Hesaplayici_FirstCase/blob/main/JAVA_Maas_Hesaplayici/src/Employee.java) class'ı yaratıyoruz. 


-Employee class'ı nitelikleri:

- name : Çalışanın adı ve soyadı
- salary : Çalışanın maaşı
- workHours : Haftalık çalışma saati
- hireYear : Çalışanın işe başlangıç yılı

-Employee class'ı metodları:

- Employee(name,salary,workHours,hireYear) -> constructor metod olup 4 parametre alır.
- tax() -> Maaşa uygulanan vergiyi hesaplar. Maaş 1000 TL üzerinde ise %3 vergi uygulanır. 1000 TL altında ise vergi uygulanmaz. 
- bonus() -> Çalışanın aylık ek mesai ücretlerini hesaplar. Çalışanın haftalık 40 saat üzerinde çalıştığı her saat için 30 TL ek mesai ücreti hesaplanır. 
- raiseSalary() -> Çalışanın işe başlangıç yılına göre maaş artışını hesaplar. (içerisinde bulunan yıl 2021 olarak alınmıştır) Çalışanın deneyimi 10 yıldan az ise %5,
 10 yıldan 19 yıla kadar ise %10, 19 yıldan fazla ise %15 yıllık zam oranı belirlenir. Vergi ve bonuslar da dikkate alınarak maaş artışı hesaplanır. 
- toString() -> Çalışana ait bilgileri ekrana bastıracaktır. 

## Başlangıç

### Programı Çalıştırmak İçin

* [Main](https://github.com/aytacaydemir/Java_Maas_Hesaplayici_FirstCase/blob/main/JAVA_Maas_Hesaplayici/src/Main.java) class içerisinde bir Employee nesnesi yaratıyoruz ve çalışana ait bilgileri yarattığımız constructor metoddaki sıra ile giriyoruz. 
* Örneğin : ```Employee calisan = new Employee("Aytaç Aydemir", 2000, 45, 1985);```

* Girdiğimiz çalışan bilgileri neticesinde çalışana ait mevcut ve hesaplanması gereken bilgileri ekrana bastırmak için oluşturduğumuz nesne içerisindeki "toString()" metodunu çağırıyoruz. 

* Örneğin : ```System.out.println(calisan.toString());```

**Örnek Konsol Çıktısı: 
```  
 Adı : Aytaç Aydemir
 Maaşı : 2000.0
 Çalışma Saati : 45.0
 Başlangıç Yılı : 1985
 Vergi : 60.0
 Bonus (aylık) : 600.0
 Maaş Artışı : 381.0
 Vergi ve Bonuslar ile birlikte maaş : 2540.0
 Toplam Maaş : 2981.0
 ```

