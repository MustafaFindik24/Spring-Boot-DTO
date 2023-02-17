# DTO (Data Transfer Object) Nedir?

DTO, uygulama katmanları arasındaki verinin transferi için kullanılır. Projede model katmanında oluşturulan entitylerimizi program arayüzünde aynı şekilde kullanmak yerine belirli verileri gösterebilecek bir tasarım sunar. Son kullanıcının bilmesini gerektirmeyen verileri ve güvenlik açığı oluşturabilecek durumlar bu şekilde önlenir. Tercih edilmesinin başlıca sebeplerinden birisi istekteki spesifik bilgileri tek bir grup haline getirerek sunucudaki send - response azaltımıdır. Ağ trafiğindeki yükü azaltır. Kaynak olarak veritabanından gelen veriyi kullanır.

![image](https://user-images.githubusercontent.com/91599453/219679493-2c26d4e1-728e-4c22-b331-2210eeb95a6a.png)

# Java tabanlı Spring Boot projesinde DTO kullanımı

Spring Boot kullanarak bir user projesi oluşturuldu. Kullanıcı bilgileriyle CRUD işlemleri gerçekleştirilmesi amaçlandı. Swagger UI kullanılarak PostgreSQL veri tabanı olarak kullanıldı. 

![image](https://user-images.githubusercontent.com/91599453/219682138-05015efa-08ee-4ba6-acca-08acddd92c02.png)

application.properties dosyasında Postgresql DB bağlantısı ve Swagger UI propertyleri oluşturuldu.

!![image](https://user-images.githubusercontent.com/91599453/219682469-ff239518-be37-49c5-88ca-b285b1c64f3e.png)



