# DTO (Data Transfer Object) Nedir?

DTO, uygulama katmanları arasındaki verinin transferi için kullanılır. Projede oluşturulan entitylerimizi program arayüzünde aynı şekilde kullanmak yerine belirli verileri gösterebilecek bir tasarım sunar. Son kullanıcının bilmesini gerektirmeyen verileri ve güvenlik açığı oluşturabilecek durumlar bu şekilde önlenir. Tercih edilmesinin başlıca sebeplerinden birisi istekteki spesifik bilgileri tek bir grup haline getirerek sunucudaki send - response azaltımıdır. Ağ trafiğindeki yükü azaltır.
Kaynak olarak veritabanından gelen veriyi kullanır.

![image](https://user-images.githubusercontent.com/91599453/219679493-2c26d4e1-728e-4c22-b331-2210eeb95a6a.png)



