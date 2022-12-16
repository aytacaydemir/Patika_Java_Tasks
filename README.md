# ITouch Chat Application

## Project Description

ITouch chat application is the final project of Flutter Bootcamp organized by WFP & Kodluyoruz. With the mobile application created within the scope of this project,
it is aimed that users who log in to the application with their own users can communicate each other via message. 


##Login Page

Login Page için [flutter_login 4.1.1](https://pub.dev/packages/flutter_login) paketi kullanılmıştır. Bu paket aracılığı ile email/password validation sağlanmakla 
birlikte, kullanıcının login alanlarına girdiği email-password bilgileri DB üzeirinden sorgulanmakta, ilgili user bilgilerinin mevcut olduğu doğrulandığı 
takdirde Home_page'e yönlendirmektedir. Aynı zamanda bu package sayesinde, giriş sağlandığı takdirde animasyon ile ana sayfaya geçiş yapmaktadır. Aşağıya videosunu koy.

Shared Preferences kullanılarak, kullanıcı uygulamadan Log Out olmadığı sürece (Home Page'deki ayarlar butonundan Log Out'a tıklamadığı sürece)
uygulama arka planda çalışmayacak şekilde kapatılsa dahi uygulamaya tekrar girildiğinde, son giriş yapmış user bilgileri ile Login Sayfasına uğramadan Home Page'e
yönlendirmektedir.


##Home Page

##Tabbar: Home Page içerisinde TabBar kullanılmış olup, kullanıcının sağa ve sola kaydırarak veya TabBarView'daki ikonlara tıklayarak 
Chats Page ve Friends Page sayfaları arasında geçiş yapması sağlanmıştır. Aralarında geçiş yapılan Chats ve Friends alanlarında, kullanıcıya ait mevcut chat'ler ve 
arkadaşlar Firestore Database'den Stream Builder yapısı ile dinlenmekte, bu yapı sayesinde DB'de bir değişiklik olduğunda güncellenmekte ve cihaz offline duruma
geçtiğinde mevcut datayı saklayabilmektedir. 

##Settings Button (Profile, Log out, About App)

Home Page'in appBar'ında bulunan bu butonda PopupMenuButton kullanılarak, Profile Page, LogOut ve About App seçenekleri seçilebilmekte. 


##Conversation Page




##Profile Page




##About App Page



##Add Friend/Start Chat Buttons



##Kullanılan Package'lar
#[popup_card: ^0.1.0](https://pub.dev/packages/popup_card)
#[shared_preferences: ^2.0.15](https://pub.dev/packages/shared_preferences)
#[flutter_login: ^4.1.1](https://pub.dev/packages/flutter_login)
#[firebase_core: ^2.3.0](https://pub.dev/packages/firebase_core)
#[cloud_firestore: ^4.1.0](https://pub.dev/packages/cloud_firestore)




## Installation
You can download [apk file](https://github.com/aytacaydemir/flutter_chatApplication/blob/main/apk/app-release.apk) to your phone and after installation, you can 
login with one of the users as "gmail: aytactest@gmail.com password: 123123" and "gmail: alitest@gmail.com password: 123123". Application is not avaliable to 
registration 
for different users in version 0.0.1. 

Because Firestore Database is used in the project, the read and write permissions of the database are up to 29-12-2022. Since it will not possible to 
login with the specified users after this date, it is planned that the project will communicate via local db in the following(after 0.0.1) versions. 

#@step1
##Download the apk file to your phone from this [link](https://github.com/aytacaydemir/flutter_chatApplication/blob/main/apk/app-release.apk). 
##Allow setup permission.
##Login with the user credentials which specified in the Installation section. 

## How to Use the Project
