### TODO список
___
### Описание проекта:
Проект представляет из себя приложение "TODO список", реализованы функции создания и сохранения списка задач, выведения его на экран, просмотр отдельных задач, их редактирование, отметка об исполнении и удаление;
___
### Стек технологий:
+ Spring Boot 2.7.3,
+ Thymeleaf 2.7.3,
+ Bootstrap 2.7.3,
+ Liquibase 4.15.0,
+ PostgreSQL 42.12.2;
___
### Требования к окружению:
+ Java 17,
+ Maven 3.9.6,
+ PostgreSQL 16;

### Как запустить:

+ Из консоли: 
Провести сборку проекта:

`mvn compile`

+ Запустить проект:

`mvn exec:java -Dexec.mainClass=ru.job4j.Main`

+ В браузере открыть
http://localhost:8080/tasks

**Виды.**

- Страница со списком всех заданий. В таблице отображаем имя, дату создания и состояние (выполнено или нет)
- На странице со списком три ссылки: "Все", "Выполненные", "Новые". При переходе по ссылкам в таблице нужно отображать:
  все задания, только выполненные или только новые.
- ![1.PNG](src%2Fmain%2Fresources%2Fstatic%2Fimage%2Fscreenshot%2F1.PNG)

- http://localhost:8080/tasks/add
- "Добавить задание".
- ![4.PNG](src%2Fmain%2Fresources%2Fstatic%2Fimage%2Fscreenshot%2F4.PNG)

- http://localhost:8080/tasks/{id}
- Страница с подробным описанием задания.
- Кнопки: "Выполнено", "Редактировать", "Удалить".
- ![2.PNG](src%2Fmain%2Fresources%2Fstatic%2Fimage%2Fscreenshot%2F2.PNG)

- http://localhost:8080/tasks/edit/{id}
- Кнопка "Редактировать" переводит пользователя на отдельную страницу для редактирования.
- ![3.PNG](src%2Fmain%2Fresources%2Fstatic%2Fimage%2Fscreenshot%2F3.PNG)
