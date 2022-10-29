# Adapter

## Định nghĩa
- Là mẫu thiết kế chuyển đổi khuôn mẫu của 1 lớp thành một khuôn mẫu khác mà phía client muốn.  

![image](https://images.viblo.asia/14db6fde-2687-47fb-986b-87b3508011ad.jpg)

## Cấu trúc
Có 2 cách để cài đặt adapter:   
1. Object adapter - thành phần    
- Là một thành phần implement interface và setup cả service object lên đó.
![object adapter](https://refactoring.guru/images/patterns/diagrams/adapter/structure-object-adapter.png?id=33dffbe3aece294162440c7ddd3d5d4f)  
2. Class adapter - thừa kế  
- Thừa kế từ Class gốc sau đó cài đặt thêm để có thể tương tác với service   
![class adapter](https://refactoring.guru/images/patterns/diagrams/adapter/structure-class-adapter.png?id=e1c60240508146ed3b98ac562cc8e510)