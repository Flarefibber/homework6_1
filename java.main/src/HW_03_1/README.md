### Выполненное задание
Выявить потенциально опасные моменты, в которых могут произойти сбои. Создать кастомные исключения и бросать в случае ошибки.

При этом:
* Написать собственный ексепшн и отловить его;
* Разобраться с аннотацией notnull.

## В программе реализованы классы: 


#### [MainApp.java](https://github.com/Flarefibber/homework_2_2/blob/master/java.main/src/HW_03_1/MainApp.java)

  Запускает программу.

#### [ObjectQueue.java](https://github.com/Flarefibber/homework_2_2/blob/master/java.main/src/HW_03_1/ObjectQueue.java)

  Реализует коллекцию.
  
  ObjectQueue содержит методы:
  
  + public ObjectQueue - конструктор класса ObjectQueue. Может принимать значение size_final, задающее максимальный размер стека. При отсутствии параметра или вводе значение меньше 2 устанавливает по умолчанию размер 16;
  
  + public void push(Object obj) - метод, добавляющий значение в ячейки стека;
  
  + public Object pullback() - метод, возвращающий последнее значение стека;
  
  + private Object pull() - сдвигает первую ячейку стека, удаляя её. Выполняется при достижении максимального размера стека;
  
  + public int size() - возвращает текущий размер стека.
  
  private class ObjectBox - вспомогательный объект класса ObjectQueue. 

#### [ObjectQueueTest.java](https://github.com/Flarefibber/homework_2_2/blob/master/java.main/srs/HW_03_1/ObjectQueueTest.java)

  Реализует тест для методов класса ObjectQueue.

#### [Menu.java](https://github.com/Flarefibber/homework_2_2/blob/master/java.main/src/HW_03_1/Menu.java)

  Реализует меню.
  
#### [MenuUtils.java](https://github.com/Flarefibber/homework_2_2/blob/master/java.main/src/HW_03_1/MenuUtils.java)

  Реализует утильные классы меню.

#### [StackException.java](https://github.com/Flarefibber/homework_2_2/blob/master/java.main/src/HW_03_1/StackException.java)

  Реализует класс исключения с конструктором.