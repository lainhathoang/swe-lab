# Observer
## Định nghĩa
Định nghĩa một mối phụ thuộc 1 - n giữa các đối tượng để khi mà 1 đối tượng có sự thay đổi trạng thái thì nó sẽ thông báo và cập nhật cho các thành phần còn lại một các tự động.
## Cấu trúc
![struture](https://refactoring.guru/images/patterns/diagrams/observer/structure.png)
1. *Publisher (subject)*: lớp chính, cần được lắng nghe. Khi có event thì sẽ thông báo cho các observer được khai báo trong subscriber interface.
2. *Subscriber (interface) (obeserver)*: interface để publisher báo có mỗi khi có sự kiện.
3. *Concrete Subscribers (implement từ interface)*: cài đặt cụ thể hành động cần làm khi nhận được event từ publisher.