# demo_2024001
Interview Questions for Backend Engineers:
### Java Questions:
1. Write a program to print ALL permutations of a given string with repetition. e.g. input
ABC then output: AAA, AAB, AAC, ABA, ABB, ABC, ACA, ACB, ACC, etc.<br><br>
Ans: Please check this project in class "printPermutations" path: "src/main/java/org.example/printPermutations<br><br>
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
3. How many modifier types are there in Java? Please explain each type in detail.<br>
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
