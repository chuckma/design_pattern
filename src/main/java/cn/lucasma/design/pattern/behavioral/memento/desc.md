##### 备忘录模式

定义 ：保存一个对象的某个状态，以便在适当的时候恢复对象

简单来说 就是 "后悔药功能"

类型 行为型


适用场景

> * 保存和恢复数据相关业务场景
> * 想恢复到之前的状态

优点

> * 为用户提供一种可恢复的机制
> * 存档信息的封装

缺点

> * 资源占用

相关设计模式

> * 状态设计模式
    备忘录模式是用实例来表示的，状态模式是用类来表示状态的。