# Auto_web_Java
Тест-кейс 1. Проверка пагинации в разделе новостей.
№	Шаг	Ожидаемый результат
1	Перейти на сайт: https://www.trxtraining.ru/	Открыта главная страница интернет магазина TRX.
2	Нажать на раздел «Публикации» в главном меню	Открыта страница «Публикации», слева появляется панель навигации.
3	Нажать на раздел «Новости» в панели навигации	Открыт раздел Новостей с возможностью пролистывания и выбора следующих страниц новостей путём пагинации внизу раздела.
4	Нажать на «→» в панели пагинации внизу раздела.	Открыта следующая по порядку страница новостей.
5	Нажать на «6» в панели пагинации внизу раздела.	Открыта страница новостей под номером «6».
6	Нажать на «←» в панели пагинации внизу раздела.	Открыта страница новостей под номером «5».
7	Нажать на кнопку «Закрыть»	Страница закрыта.

 
Тест-кейс 2. Вывод сообщения о дубликате при повторной регистрации. 
Условия:
1.	Пользователь успешно авторизован в системе с данными, содержащимися в этом тест-кейсе. 
№	Шаг	Ожидаемый результат
1	Перейти на сайт: https://www.trxtraining.ru/	Открыта главная страница интернет магазина TRX.
2	Нажать на значок «Личный кабинет» в главном меню	Открыта страница «Регистрации».
3	Заполнить обязательные поля в форме регистрация следующими данными:
●	Фамилия - Лутохин;
●	Имя - Дмитрий;
●	Телефон - +7 (910) 234-93-75;
●	Email - dmitry.yand2.mail@yandex.ru
●	Пароль - TRXtest1
●	Подтверждение пароля - TRXtest1	Поля заполнены.
4	Нажать на кнопку «Зарегистрироваться»	Регистрация не удалась, выведено сообщение «Пользователь с таким e-mail'ом уже существует»










Тест-кейс 3. Добавление товара в корзину. 
Условия:
1.	Пользователь успешно авторизован в системе.
№	Шаг	Ожидаемый результат
1	Перейти на сайт: https://www.trxtraining.ru/	Открыта главная страница интернет магазина TRX.
2	Нажать на значок «Личный кабинет» в главном меню	Открыта страница «Регистрации».
3	Заполнить обязательные поля в форме «Вход» следующими данными:
●	Login- dmitry.yand2.mail@yandex.ru
●	Пароль - TRXtest1	Поля заполнены.
4	Нажать на кнопку «Вход»	Открыта страница «Изменение настроек пользователя» с персональными данными.
5	Нажать на раздел «Каталог» в главном меню.	Открыта страница каталога «Магазин», слева появляется панель навигации.
6	Нажать на раздел «Аксессуары» в панели навигации.	Открыт раздел Аксессуары с товарами.
7	Выбрать из имеющегося списка товаров «TRX ШЕЙКЕР» и нажать на его изображение.	Открыта страница подробного описания выбранного товара с возможностью просмотреть другие изображения этого товара.
8	Нажать на другое уменьшенное изображение внизу основного изображения товара.	Открыта страница подробного описания товара с выбранным изображением.
9	Нажать на кнопку «В корзину»	Выведено сообщение об успешном добавлении товара в корзину.
10	Нажать на кнопку «Ок» в появившемся окне.	Открыта страница подробного описания выбранного товара. На значке «Корзина»
в панели главного меню появляется цифра «1».
11	Нажать на значок «Корзина»
в панели главного меню.	Открыта страница «Корзина» с добавленным товаром.
12	Нажать на кнопку «Закрыть»	Страница закрыта.

Тест-кейс 4. Удаление товара из корзины. 
Условия:
1. Пользователь успешно авторизован в системе.
2. В корзину добавлен заказ. 
3. Куки от предыдущего сеанса авторизации не удалены.
№	Шаг	Ожидаемый результат
1	Перейти на сайт: https://www.trxtraining.ru/	Открыта главная страница интернет магазина TRX с авторизованным пользователем.
2	Нажать на значок «Корзина»
в панели главного меню.	Открыта страница «Корзина» с добавленным товаром.
3	Нажать на кнопку «Удалить»
в графе «количество» у добавленного товара.	Открыта страница «Корзина» с текстом «Ваша корзина пуста».
4	Нажать на кнопку «Закрыть»	Страница закрыта.
