# Builder 
## Định nghĩa
- **Cho phép xây dựng một đối tượng phức tạp bằng cách sử dụng các đối tượng đơn giản & sử dụng tiếp cận từng bước.**  
    => Nói cách khác là tách nhỏ constructor để dễ khởi tạo hơn.
- Có thể cho phép tạo ra các kiểu thể hiện khác nhau của một đối tượng bằng cách sử dụng cùng 1 constructor.
## Cấu trúc
![structure](https://refactoring.guru/images/patterns/diagrams/builder/structure.png?id=fe9e23559923ea0657aa5fe75efef333)
1. *Builder*: là một interface, khai báo các bước chung cho các loại builder.
2. *Concrete Bulider*: Cung cấp các cách triển khai khác nhau cho Buidler.
3. *Product*: là các đối tượng kết quả do các Concrete tạo ra, không nhất thiết phải cùng 1 giao diện lớp.
4. *Director*: xác định thứ tự gọi các bước construction.

=> Đối tượng director không trực tiếp tạo nên các p roduct mà sẽ gọi tới builder interface để tạo.