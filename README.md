![uber-calle-banner](https://github.com/user-attachments/assets/c032b997-6631-4f84-acb6-a78d5ca3ba15)
# Desafio Uber Open-Source (10/04/2019)
O processo seletivo consistia em escolher um dos 4 desafios Open-Source da empresa Uber para vagas na area de desenvolvimento de software. Objetivo de concluir o desafio e avançar em backend Java
## Conclusão 
Defini a interface EmailSenderGatway com metodo que aceita 3 parametros, toEmail, subject e body, Ter uma interface ajuda a abstrair a lógica de envio de email, permitindo que o sistema utilize diferentes implementações.

Em service crie a função EmailSenderService que implementa a lógica de envio de emails do sistema, usando o EmailSenderGateway para realmente enviar o email e apliquei injeção de independencia fazendo o sistema mais flexível e fácil de testar.

Em controllers crie as funções responsaveis por expor a API de envio de emails, a rota de api define um endpoint para receber requisições POST na URL'/api/email'. O metedo sendEmail: Recebe uma requisição com os dados do email no corpo (EmailRequest), tenta enviar o email chamando emailSenderService.sendEmail() e retorna uma resposata de successo ou não.

Em AwsConfig criei a classe que configura o cliente Amazon SES para que possa ser injetado no Spring. 'amazonSimpleEmailService' cria e configura o cliente SES usando 'AmazonSimpleEmailServiceClientBuilder'.

A classe 'SesEmailSender' implementa 'EmailSenderGateway' usando o Amazon SES para realmente enviar o email com o serviços da Amazon.

## Ferramentas 
* Java
* Spring
* AWS SES
## Desafio que escolhi 
```
Email Service
Create a service that accepts the necessary information and sends emails. It should provide an abstraction between two different email service providers. If one of the services goes down, your service can quickly failover to a different provider without affecting your customers.

Example Email Providers:

SendGrid - Simple Send Documentation
Mailgun - Simple Send Documentation
SparkPost - Developer Hub
Amazon SES - Simple Send Documentation
All listed services are free to try and are pretty painless to sign up for, so please register your own test accounts on each.
```
## Link Completo 
```
https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md
```
