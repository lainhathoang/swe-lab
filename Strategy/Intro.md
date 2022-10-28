# Strategy

## Định nghĩa

Là một behavior desgin pattern giúp định nghĩa một tập hợp các thuật toán giống nhau, encapsulate chúng và khiến chúng có thể thay thế cho nhau. Strategy làm cho phần thuật toán độc lập khỏi client sử dụng nó.

## Cấu trúc

![structure](https://refactoring.guru/images/patterns/diagrams/strategy/structure.png?id=c6aa910c94960f35d100bfca02810ea1)

1. *Context*: Sử dụng các strategy object, chỉ giao tiếp với các strategy object thông qua interface.
2. *Strategy (interface)*: Cung cấp 1 interface giúp context giao tiêps với các strategy object.
3. *ConcreteStrategies (implement từ Strategy)*: Implement các thuật toán khác nhau cho context sử dụng.
4. *Client*: tạo ra các strategy object và truyền vào context để sử dụng.