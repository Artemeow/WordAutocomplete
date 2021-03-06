# Word-Autocomplete

trying to do this task

Задача:
Реализовать функцию автодополнения следующим образом: по началу слова необходимо выдавать список из 10 наиболее часто встречающихся слов, начинающихся с указанного префикса. Сортировать варианты автодополнения в порядке убывания частоты использования. В случае равенства частот - варианты сортируются естественным образом (по алфавиту). Если вариантов меньше 10, то выдавать столько, сколько нашли.

**I часть**

Решение должно быть в виде консольного java-приложения. Исходные данные подаются через стандартный поток ввода, а все результаты выводятся в стандартный поток вывода.

Исходные данные:

В первой строке находится единственное число N (1 ≤ N ≤ 10^5) - количество слов в словаре. Каждая из следующих N строк содержит слово wi (непустая последовательность строчных латинских букв длиной не более 15) и целое число ni (1 ≤ ni ≤ 10^6) - частота употребления слова wi. Слово и число разделены единственным пробелом. Ни одно слово не повторяется более одного раза. В (N+2)-й строке находится число M (1 ≤ M ≤ 15000). В следующих M строках содержатся слова uj (непустая последовательность строчных латинских букв длиной не более 15) - начала слов, введённых пользователем.

Результат:

Для каждой из M строк необходимо вывести наиболее употребляемые слова, начинающиеся с uj. Варианты дополнения для каждого слова необходимо разделять переводами строк.

Пример:
**stdin**

5

kare 10

kanojo 20

karetachi 10

korosu 7

sakura 3

3

k

ka

kar

**stdout**

kanojo

kare

korosu

karetachi


kanojo

kare

karetachi


kare

karetachi


**II часть**

Решение должно быть в виде web-приложения с использованием [Spring MVC] (http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html) и [AngularJS] (https://angularjs.org/). Запускать приложение на [Apache Tomcat] (http://tomcat.apache.org/). Исходные данные подаются через файл.

Исходные данные:

В первой строке находится единственное число N (1 ≤ N ≤ 10^5) - количество слов в словаре. Каждая из следующих N строк содержит слово wi (непустая последовательность строчных латинских букв длиной не более 15) и целое число ni (1 ≤ ni ≤ 10^6) - частота употребления слова wi. Слово и число разделены единственным пробелом. Ни одно слово не повторяется более одного раза.

Результат:

На главной странице web-приложения должна быть единственная строка с вводом. Ввод символов в строку должен сопровождаться выдачей вариантов автодополнения.

Дополнительные требования:

Использование [maven] (https://maven.apache.org/) приветствуется (либо требуется иной скрипт для сборки)
Код на Java в стиле, соответствующем рекомендациям http://google.github.io/styleguide/javaguide.html
