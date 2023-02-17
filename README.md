# DTO (Data Transfer Object) Nedir?

DTO, uygulama katmanları arasındaki verinin transferi için kullanılır. Projede model katmanında oluşturulan entitylerimizi program arayüzünde aynı şekilde kullanmak yerine belirli verileri gösterebilecek bir tasarım sunar. Son kullanıcının bilmesini gerektirmeyen verileri ve güvenlik açığı oluşturabilecek durumlar bu şekilde önlenir. Tercih edilmesinin başlıca sebeplerinden birisi istekteki spesifik bilgileri tek bir grup haline getirerek sunucudaki send - response azaltımıdır. Ağ trafiğindeki yükü azaltır. Kaynak olarak veritabanından gelen veriyi kullanır.

![image](https://user-images.githubusercontent.com/91599453/219679493-2c26d4e1-728e-4c22-b331-2210eeb95a6a.png)

# Java tabanlı Spring Boot projesinde DTO kullanımı

Spring Boot kullanarak bir user projesi oluşturuldu. Kullanıcı bilgileriyle CRUD işlemleri gerçekleştirilmesi amaçlandı. Swagger UI kullanılarak PostgreSQL veri tabanı olarak kullanıldı. 

![image](https://user-images.githubusercontent.com/91599453/219682138-05015efa-08ee-4ba6-acca-08acddd92c02.png)

application.properties dosyasında Postgresql DB bağlantısı ve Swagger UI propertyleri oluşturuldu.

![image](https://user-images.githubusercontent.com/91599453/219682469-ff239518-be37-49c5-88ca-b285b1c64f3e.png)

Repository, Service ve Controller katmanları oluşturularak CRUD işlemleri HTTP metotları kullanılarak sağlandı. Ricardson Maturity Model 2.Seviye path yazımı kullanıldı. Configuration anotasyonu kullanılarak sınıfın bir config dosyası hale getirilmesi sağlandı. ModelMapper sınıfı Maven üzerinden dependency olarak eklenerek config dosyası projeye eklendi. 

![image](https://user-images.githubusercontent.com/91599453/219683277-67b97d1b-a8f5-44d0-8671-3a8b7d172ffb.png)

Farklı isteklere göre farklı veriler üzerinde değişiklik yapabilmek için birden fazla DTO oluşturuldu.

![image](https://user-images.githubusercontent.com/91599453/219683729-6c21d1d7-4261-4192-a028-898f8de76acf.png)

ModelMapper Dependency Injection yöntemiyle Service katmanına dahil edilerek Model katmanındaki entitylerin map() metoduyla DTO olarak dönüşümü sağlandı.

![image](https://user-images.githubusercontent.com/91599453/219684370-1741bce1-6266-4565-ba0e-527abe46647b.png)

Controller katmanında mapping işlemleri sonrasında Swagger üzerinden oluşturulan veri transfer objeleri kontrol edildi.

![image](https://user-images.githubusercontent.com/91599453/219685671-0440af0a-130d-48a6-a0fa-02ae224de586.png)

Dönen response'un istenilen şekilde GET isteğindeki verileri listelediği görüldü.

![image](https://user-images.githubusercontent.com/91599453/219685921-b66c3950-65f2-490f-85a4-a929ea6376e7.png)








