### Выполненное задание
Реализована коллекция, которая имеет фиксированный размер.
Размер задаётся:
+ по умолчанию 16;
+ по указанию пользователя.

При этом:
* Размер коллекции после инициализации меняться не может;
* Каждый новый элемент добавляется в конец. После того, как количество элементов достигло максимума - при добавлении нового элемента коллекция "сдвигается" влево. 1-й элемент удаляется, а каждый следующий смещается на один элемент влево.

## В программе реализованы классы: 


#### [MainApp.java](https://github.com/Flarefibber/Bitbucket2/blob/master/HW_02_2/MainApp.java)

  Запускает программу.

#### [ObjectQueue.java](https://github.com/Flarefibber/Bitbucket2/blob/master/HW_02_2/ObjectQueue.java)

  Реализует коллекцию.
  
  ObjectQueue содержит методы:
  
  + public ObjectQueue - конструктор класса ObjectQueue. Может принимать значение size_final, задающее максимальный размер стека. При отсутствии параметра или вводе значение меньше 2 устанавливает по умолчанию размер 16;
  
  + public void push(Object obj) - метод, добавляющий значение в ячейки стека;
  
  + public Object pullback() - метод, возвращающий последнее значение стека;
  
  + private Object pull() - сдвигает первую ячейку стека, удаляя её. Выполняется при достижении максимального размера стека;
  
  + public int size() - возвращает текущий размер стека.
  
  private class ObjectBox - вспомогательный объект класса ObjectQueue. 

#### [MainAppTest.java](https://github.com/Flarefibber/Bitbucket2/blob/master/HW_02_2/MainAppTest.java)

  Реализует тест для методов класса ObjectQueue.

#### [Menu.java](https://github.com/Flarefibber/Bitbucket2/blob/master/HW_02_2/MainAppTest.java)

  Реализует меню.
  
#### [MenuUtils.java](https://github.com/Flarefibber/Bitbucket2/blob/master/HW_02_2/MainAppTest.java)

  Реализует утильные классы меню.
