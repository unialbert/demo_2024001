# demo_2024001
Interview Questions for Backend Engineers:
### Java Questions:
1. Write a program to print ALL permutations of a given string with repetition. e.g. input ABC then output: AAA, AAB, AAC, ABA, ABB, ABC, ACA, ACB, ACC, etc.<br><br>
Ans: Please check this project in class "printPermutations" path: "src/main/java/org.example/printPermutations<br><br>
and result like this picture.<br>
![image](https://github.com/0xAlbertLin/demo_2024001/assets/46127917/d1c411bb-7f54-43c6-aaa4-0e1f10f812c1)
2. What’s the difference between process and thread?<br><br>
Ans:<br>
每一個Process都是獨立的，且擁有獨立的記憶體空間及資源，但Process無法直接與另一個Process進行溝通。<br>
Thread是Process中的最小單位，若多個Thread都在同一個Process中可以共享該Process的記憶體及資源，<br>
而Process與Process之間則需要透過IPC或者共用記憶體的方式進行溝通。<br>
一個Process中可以擁有多個Thread，<br>
以聊天室為例，可以由一個Process所完成，但Process會分配出多個Thread<br>
而每個Thread都有自己該負責的工作，例如一個負責發送訊息(Thread #1)，另一個負責接收訊息(Thread #2)。<br>
而這兩個Thread都是由同一個Process所分配出來的，且可以高效的共享彼此資源。<br>
如同一間工廠下有多個員工。而工廠負責提供資源，員工則使用這些資源來完成各自的工作。<br><br>
3. How many modifier types are there in Java? Please explain each type in detail.<br><br>
Ans:<br>
10種<br>
public:&nbsp;使class、method、constructor或variable可以被任何其他類別訪問。如果其他class不在同一個package中，<br>&emsp;&emsp;&emsp;&nbsp;也可以通過import該類別的方式來訪問public修飾的成員。<br>
private:&nbsp;使method、constructor或variable只能在其所在的class內部訪問。<br>
protect:&nbsp;使method、constructor或method可以被相同package內的其他class或不同package中的subclass訪問。<br>
default:&nbsp;如果沒有設定任何修飾符，則只有同一個包內的其他class可以訪問該class、method、constructor或variable。<br>
static:&nbsp;用於創建class method和class Variable，表示該成員屬於class本身，而不是具體的實例。<br>
final:&nbsp;用於修飾calss、method和變數。final類別不能被繼承，final方法不能被子類重寫，final變數 一旦賦值後不能被修改。<br>
abstract:&nbsp;用於創建abstract class和abstract method。abstract class不能被實例化，abstract method必須由subclass提供實現。<br>
synchronized:&nbsp;用於method，表示該class在同一時刻只能被一個thread訪問，用於實現thread安全。<br>
transient:&nbsp;用於防止字段的序列化。當對象被序列化時（例如存儲到文件中），該字段不會被序列化。<br>
volatile:&nbsp;可以確保在應用程式中的可見性，當一個variable的前面被加上Volatile後，當它的被修改就會即時被更新到主記憶體。<br>
4. What’s the difference between “abstract” and “interface”? Why would you use one over the other?<br><br>
Ans:<br>
The abstract keyword is used to declare an abstract class, <br>
and its properties and methods can be inherited by using extends<br>
An abstract class can be seen as a partial implementation.<br>
It can contain completed functionalities, <br>but also leaves some functionalities to be implemented by its subclasses.<br>
A class can inherit from only one abstract class.<br><br>
The interface keyword is used to declare a new interface, which can be implemented using implements<br>
In an interface, all methods are abstract and have no implementation. <br>
However, starting from Java 8, interfaces can have default and static methods with implementations.<br>
A class can implement multiple interfaces.<br><br>
If there are common implementations that can be shared among all subclasses, <br>
but certain methods require unique implementations in each subclass, an abstract class is the ideal choice. <br>
On the other hand, if the purpose is merely to establish a set of standard methods that different classes should implement, <br>
without the need for shared implementation, then an interface is the preferable option<br>
5. In JVM, what will store in “stack” and “heap”?<br><br>
Ans:<br>
Stack:<br>
- The stack is used to store local variables, method calls, and return values.<br>
- When a method is invoked, a new frame is created on the stack to hold the method's local variables and other related information.<br>
- Each thread has its own stack, and operations on the stack are generally fast and efficient.<br>
Heap:<br>
- The heap is where all object instances and arrays are stored in Java.<br>
- When an object is created in the program (e.g., using the new keyword), it's stored in the heap.<br>
- The heap is shared among all threads, so accessing and managing data on the heap requires more resources and time.<br>
For example,I declare these String:

    ```
    String strA = "abc";
    String strB = "abc";
    ```
    both strA and strB refer to the same string instance "abc" in the string constant pool. <br>
    In Java, the string constant pool is a special memory area where literal strings are stored. <br>
    Since strings are immutable in Java, when multiple string variables have the same literal value, <br>
    they actually refer to the same instance in the string constant pool.<br><br>
    On the other hand, if you declare the strings this way:
    ```
    String strA = new String("abc");
    String strB = new String("abc");
    ```
    In this case, each new String("abc") creates a new string object in the heap memory, <br>
    even though their contents are the same.<br>
    Therefore, strA and strB are referencing two different object instances in the heap.<br><br>
    So,strings declared with literals are stored in the string constant pool and can be shared, <br>
    while strings created with the new keyword are always created as new objects in the heap. <br><br>
6. What are the design patterns you are familiar with? Please describe the use cases you
have done before.<br><br>
Ans:<br>
- Singleton Pattern:<br>
Consider a logging system in an application where you want only one logger instance throughout the application. <br>
Using the Singleton pattern, you ensure that all calls to the logger use the same instance, centralizing log management.<br><br>
- Factory Pattern:<br>
Suppose an enterprise offers two types of query services: "Service A" and "Service B". <br>
I defined a query interface and then created classes for each service that implement this interface. <br>
By using a switch case statement for call function, <br>
I can execute queries for either Service A or Service B based on the data passed in by the user.<br><br>

### API Questions:
1. What is dependency injection? What is the purpose of it?<br><br>
Ans:<br>
It is a design pattern used to implement the principle of Inversion of Control(IOC). <br>
It is widely used in object-oriented programming languages like Java to achieve better decoupling of code. <br>
Purpose of Dependency Injection:<br>
Decoupling: Dependency Injection separates the creation of dependencies from the client class that uses them.<br>
This reduces the tight coupling between classes, making the code more maintainable, extendable, and testable.<br><br>
Flexibility and Testability: Dependency Injection allows for the swapping of injected implementations,<br>
which is useful for changing program behaviors or using mock objects for testing.<br><br>
For example,suppose there is a MessageService interface and an EmailService class that implements this interface.<br>
If a Client class relies on MessageService to send messages, the instance of EmailService can be injected into the Client,<br>
rather than the Client creating an instance of EmailService internally.<br><br>
2. What’s REST, and what are the benefits of using it?<br><br>
Ans:<br>
REST refers to a software architectural style used for designing web application interfaces.<br>
It employs standard HTTP methods such as GET, POST, PUT, DELETE, etc., for network communication.<br><br>
- Simplicity and Lightweight: REST uses standard HTTP methods, making it a simple and lightweight choice for developing web services.
- Statelessness: In REST architecture, the server does not store the state of the client. This means each request must contain all necessary information to process it.
- Cachability: REST allows responses from the client and server to be cached, enhancing the efficiency of subsequent requests.
- Scalability: Due to its statelessness and layered system, REST supports extensive interaction between numerous clients and servers.
- Universality: REST uses the standard HTTP protocol, making it easy to implement across various types of platforms and languages.
- Ease of Modification and Extension: With its clear definition of resources and actions, REST APIs are relatively easy to modify and extend.<br><br>
3. How does the HTTP 304 Not Modified cache mechanism be implemented between client and server?<br><br>
Ans:<br>
- Initial Client Request: The client sends an HTTP request to the server to fetch a specific resource.
- Server Response: The server returns the resource and includes the resource's Last-Modified time or an ETag (Entity Tag, a unique identifier of the resource) in the HTTP response header.
- Subsequent Client Request: When the client needs the same resource again, it includes an If-Modified-Since header (with the previously received last modification time) or an If-None-Match header (with the previously received ETag) in the request.
- Checking for Updates: The server checks if the resource has been changed since the time/ETag provided in the If-Modified-Since or If-None-Match header.
- 304 Not Modified: If the resource has not changed, the server responds with 304 Not Modified, instead of sending the full content of the resource.
- Using Cache: Upon receiving the 304 response, the client loads the resource from its local cache instead of redownloading it from the server.<br><br>
4. How does the HTTPS protocol work?<br><br>
Ans:<br>
HTTPS protocol is a secure version of the HTTP protocol. It protects data transmission through the following ways:<br>
- Encryption: All data transmitted between the user and the server is encrypted. This means that even if the data is intercepted during transmission, it cannot be easily read.
- Authentication: HTTPS uses digital certificates to ensure that you are communicating with the intended server, preventing "man-in-the-middle" attacks.
- Data Integrity: Ensures that the data transmitted is not altered during transmission.<br><br>
5. What is an XSS attack? How to prevent it?<br><br>
Ans:<br>
An XSS attack is a common web security vulnerability that allows attackers to inject malicious script codes into web pages viewed by other users.<br>
When these pages are accessed by other users, the scripts execute, allowing the attacker to steal data, hijack user sessions, <br>
deface web content, or perform other malicious activities.<br><br>
and how to prevent it?
- Validate Input: Strictly validate and sanitize all incoming data.
- Escape Output: Escape all output data before displaying it on web pages.
- Implement Content Security Policy (CSP): Implement a Content Security Policy by setting appropriate HTTP headers.
- Use Secure Programming Frameworks: Some modern web development frameworks and libraries, like React and Angular, come with built-in mechanisms to guard against XSS.
- Avoid Storing Sensitive Data in Cookies: Refrain from storing sensitive information in cookies, such as session identifiers, as they can be hijacked through XSS attacks.
- Use HTTP Only and Secure Flags: For sensitive cookies, using HTTP Only and Secure flags can increase security.<br><br>
6. What is a SQL Injection attack? How to prevent it?<br><br>
Ans:<br>
SQL Injection attack is a web security threat that occurs at the data layer of an application.<br>
Attackers exploit insecure database queries by inserting or 'injecting' malicious SQL code into them.<br>
This attack can be used to bypass security measures, access, modify,<br>
or delete data, and could potentially take control over the entire database system.<br><br>
how to prevent it?
- Use Parameterized Queries: This is one of the most effective ways to prevent SQL injections. Parameterized queries ensure that the database engine can distinguish between code and data, so preventing malicious input from being interpreted as SQL code.
- Use ORM Frameworks: Object-Relational Mapping (ORM) frameworks provide an abstraction layer that can help prevent SQL injections, as they typically automatically use parameterized queries.
- Validate and Sanitize Input Data: Rigorously validate user input data, removing or escaping any potentially malicious inputs.
- Apply the Principle of Least Privilege: Ensure that the account used for database connections has only the minimum privileges necessary to perform the current task.
- Regular Updates and Patches: Keep your application and database management systems up-to-date, applying all security updates and patches.
- Error Handling: Avoid displaying detailed information about the database structure in the application's error messages, which could provide useful information to attackers.<br><br>
7. What’s Spring Boot? What are the benefits of using it?<br><br>
Ans:<br>
It's an open source Java framework.<br>
it's has a series of IoC (Inversion of Control) container designs, Dependency Injection (DI), and integrates AOP (Aspect-Oriented Programming) features.<br>
Both Spring Boot and Spring MVC are frameworks, and their core is based on Spring.<br>
Spring Boot includes Spring MVC and simplifies configuration.<br>
The purpose of Spring Boot is to provide a set of tools for rapidly building and easily configuring Spring applications, without the need for redefining basic configuration.<br>
It can be considered one of the quickest methods for developing REST-based web applications in Java.
- Rapid Project Construction: Spring Boot provides a plethora of starter dependencies that aid in the rapid construction of projects.
- Simplified Configuration: The automatic configuration mechanism reduces the complex configuration typically required for traditional Spring applications.
- Embedded Web Server: Supports servers like Tomcat and Jetty, simplifying the deployment of web applications.
- Microservices Support: Well-suited for building applications with a microservices architecture.
- Strong Community and Ecosystem: There is an abundance of tutorials, documentation, and community support available.<br><br>
8. What is the difference between CI and CD?<br><br>
Ans:<br>
Continuous Integration:<br>
The goal of CI is to detect errors early by integrating frequently, thereby reducing integration problems during development.<br>
Continuous Deployment:<br>
The aim of CD is to make the software delivery process as automated and frequent as possible, ensuring rapid and continuous release of new features and fixes.<br><br>

### AWS Questions:
1. What is CloudFront?<br><br>
Ans:<br>
CloudFront uses data centers distributed around the world to temporarily store (cache) content like images and videos.<br>
This way, when users access this content, they can retrieve it from the nearest data center rather than directly from the original server.<br>
This shortens the distance for data transmission, reduces transfer time and latency, thereby enhancing the user experience.<br><br>
2. What is AMI?<br><br>
Ans:<br>
An image maintained and technically supported by AWS, it also provides the information needed to launch instances. <br>
When you launch an instance, you must specify an AMI. If you need multiple instances with the same configuration, <br>
you can launch multiple instances from a single AMI. When you need instances with different configurations,<br>
you can use different AMIs to launch the instances.<br><br>
3. Please describe the differences between S3 and EC2.<br><br>
Ans:<br>
S3 is primarily used for data storage and retrieval.<br>
EC2 instances are virtual servers that can run applications. They can be used for various computing tasks, such as hosting applications or websites.<br><br>
4. What is the container, and why do you need it?<br><br>
Ans:<br>
Containers are lightweight, portable software execution environments that allow developers to package an application and all its dependencies into an isolated environment.<br>
Containers are similar to traditional virtual machines (VM) but are more lightweight and flexible.<br><br>
container technology provides a faster, more efficient, and more reliable way to develop, deploy, and manage applications, <br>
especially in the context of modern software development environments that require rapid iteration and scalability.<br><br>

### Non-Technical Questions:
1. What do you think a great Java software engineer should do? What should he avoid?<br><br>
Ans:<br>
我認為需要持續學習並更新資訊。<br>
以及若有許多重複性程式碼，可以做成一個function或是做成utils的共用元件，並免增加程式的複雜性。<br>
程式碼的可讀性，與註解。<br>
程式碼在運行時的效率<br>
and we should be avoid<br>
程式碼JDK版本，安全性更新等資訊。<br>
避免太多的重複性程式碼<br>
未經過測試就將程式進行MERGE AND PULL REQUEST<br>
避免未與主管或團隊討論就進行開發，反而增加後續維護的時間。<br><br>
2. How do you think a day at this job would be? Please describe chronologically in hours.<br><br>
Ans:<br>
9:00 ~ 10:00 <br>
上班，檢查信件或行事曆，確認是否有什麼代辦事項該注意的。<br>
10:00 ~ 12:00 <br>
決定代辦事項的優先順序，或者詢問主管的優先程度，並開始一天的工作，進行開發、維修bug等等。<br>
12:00 ~ 13:00 <br>
午餐時間。<br>
13:00 ~ 15:00 <br>
繼續完成工作，或者有在開發或維護上遇上問題可以與同事討論開發的方向是否正確。
15:00 ~ 15:30 <br>
休息一下。<br>
15:30 ~ 17:30 <br>
為開發或維護的事項進行一個暫停點的收尾，並且記錄下來隔日維護需要注意的事項，以防忘記前一日開發的內容及需要注意的事項。<br>
17:30 ~ 18:00 <br>
整理今日上班的進度，與需匯報的問題，檢查郵件等等。<br>
18:00 <br>
下班<br>
3. Share a difficult decision you made: What was the issue? What actions did you take on this matter? What is the result?<br><br>
Ans:<br>
這是我在之前上班所遇過的事情，在開發中約接近60%~70%的進度，因為在某項功能開發中發現了一些問題，所以需要將整個代碼的架構重寫(回想起來是類似於叠代的問題)。<br>
所以發現的當下，與一同開發的的夥伴進行討論並與主管告知狀況，是否有其他補救的方式，討論無果後，我們分別進行了工作的分配，而為了更加的好維護，將許多功能拆分成了function，<br>
在重新整理好架構後，將模組化完成的function功能進行放入測試，進行的非常順利，在此之中，也與客戶提前事先告知此項狀況，並且也做了一些文件，但由於這項改動，<br>
對於整體程式碼運行的效率提升非常多，且因模組化後，也能更方便快速的維護，客戶們也非常的開心。<br><br>
### Others:
1. Is there a personal Github link that you can provide?<br><br>
Ans:<br>
https://github.com/0xAlbertLin
