<html>
  
<div align="center">
  ✉️✉️✉️📫📫📫
<h1>Integracíon mensaje con API Twilio y WhatsApp</h1>
  <img src="https://github.com/Magucho/Automatizacion_Twilio_WhatsApp/assets/98346054/1208731e-f780-45ef-add8-b1355866471c">
</div>


 --- 
<div align="center">
<h1>📜Hablando un poco del proyecto</h1>
<p>Mediante una interface personalizada, integraré mensajeria de texto hacia el cliente con quien tendré comunicación; mediante un numero telefonico de celular.</p>
</div>

---
<div align="center">
  <h1>📚Libreria</h1>
  <p>Utilizando la dependencia en el proyecto via Maven </p>
  
```xml
<dependency>
  <groupId>com.twilio.sdk</groupId>
  <artifactId>twilio</artifactId>
  <version>9.X.X</version>
  <scope>compile</scope>
</dependency>
```
</div>

---
<div align="center">
  <h1>
    <img src="https://github.com/Magucho/Automatizacion_Twilio_WhatsApp/assets/98346054/87c29bda-ecd1-46c7-a25f-839e28c11d8a" width=20 height="20">
    Diseño</h1>
<img src="https://github.com/Magucho/Automatizacion_Twilio_WhatsApp/assets/98346054/5f9d3982-1728-4e34-920a-e428e37cbedd">
</div>

---
<div align="center">
  <h1> <img src="https://github.com/Magucho/Automatizacion_Twilio_WhatsApp/assets/98346054/c9c34f7a-cec2-4c66-b357-29642909a474" width=20 height="20">Video </h1>


https://github.com/Magucho/Automatizacion_Twilio_WhatsApp/assets/98346054/daf06e13-2c61-4403-8b95-57b3d0730125  
<p>El video hace una pequeña demostración del objetivo.</p>
</div>

---
<div align="center">
  <h1> <img src="https://github.com/Magucho/Automatizacion_Twilio_WhatsApp/assets/98346054/e631a659-4355-4b6a-8468-a0b1b77aade9" width=20 height="20"> Video Explicado</h1>
 
  <a  href="https://www.linkedin.com/feed/update/urn:li:activity:7127419867128815616/" target="_blank" >
  <img src="https://img.shields.io/hackernews/user-karma/11?color=blue&label=LinkedIn&logo=data:image/png;base64,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&logoColor=blue&style=for-the-badge"
           alt="linkedin"/>
</a>
  <a href="https://www.facebook.com/magucho.gomez/videos/814594310352248">
  <img src="https://img.freepik.com/fotos-premium/logotipo-facebook-neon-espacio-texto-graficos-fondo-azul_494516-176.jpg?w=360" alt="Facebook Badge" width=100/></a>
  
</div>

</html>
