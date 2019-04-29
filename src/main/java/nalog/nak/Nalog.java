package nalog.nak;
/*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. */  
/* java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете java.
java.awt - подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
"*"-включение всех элементов библиотеки awt */
import java.awt.*;
import java.awt.event.*;
/* Импортируем:
javax.* — стандартные расширения.(Стандартные расширения (standard extensions) — это пакеты или набо-ры пакетов Java)
Swing - Библиотека графического интерфейса (конкретный пакет), В отличие от java.awt, javax.swing имеет более гибкую
систему управления и более широкий набор функций
"*"-включение всех элементов библиотеки Swing (jbutton,jpanel,jlabel и т.д.)
"." используется для выделения элементов из ссылки на объект.
*/
import javax.swing.*;  
/*библиотека необходимая для того, чтобы установить отступы*/
import javax.swing.border.*; 
/* (Public) - поля и методы класса Nalog доступны для всех других объектов и классов.
зарезервированное слово class - говорит транслятору, что мы собираемся описать новый класс Nalog.
Класс наследует функции элемента JFrame, который определён в стандартной библиотеке awt.
JFrame - само окно. JFrame содержит в себе всё необходимое для создания и функционирования окна программы - мы
используем его методы в своей программе. { }-описание класса располагается между фигурными скобками.
*/



	public class Nalog extends JFrame{
	private static final long serialVersionUID = 1L;
	/* Nalog() - это установка компонентов (панель вкладок) на JFrame.
	(Public) - означает что фрейм Nalog можно вызвать из любого файла который лежит в пакете NalogC.
	static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам
	и переменным можно обращаться через имя класса*/
	public static Nalog frame = new Nalog(); 
	/*
	Модификатор доступа public означает, что метод main(String[] args)виден и доступен любо-му классу.
	static позволяет определять статические методы. Это такие методы, которые являются об-щими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам
	и переменным можно обращаться через имя класса.
	void означает, что метод main(String[] args)не возвращает данных в программу, которая его вызвала,
	а просто выводит на экран строку.
	В методе main слова String[] args означают,что этот может получать массив объектов с ти-пом String, т.е. текстовые данные.
	Программа может состоять из нескольких классов, но только один из них содержит метод main().
	Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс,
	начинают свою работу с вызова метода main.
	*/
	public static void main(String[] args) { 
		/*Статический метод который добавляет объект в eventQueue
		 В EvenQueue много событий, таких как события клавиатуры или события мыши.*/
	EventQueue.invokeLater(new Runnable() {
		/* public - модификатор доступа, означающий, что метод run() виден и до-ступен любому классу.
		void ()означает, что метод run не возвращает данных в программу, которая его вызвала,
		а просто выводит на экран строку.
		Метод run с пустыми скобками, т.е. метод не имеет аргумен-тов(параметров)
		*/
	public void run() {
		/* Для задания блока программного кода, который требуется защитить от исключений, ис-пользуется ключевое слово try.
		Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
		Исключение – это проблемная ситуация, возникающая по мере выполнения кода програм-мы. Работает она так:
		1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнориру-ется, то есть выполнение
		доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то вы-полнение try на ней
		прерывается, и управление прыгает в начало блока catch(err).
		*/
	try {
		/*устанавливаем что окно Nalog видное пользователю*/
	frame.setVisible(true); 
	} catch (Exception e) {
		/* Для задания блока программного кода, который требуется защи-тить от исключений, используется ключевое слово try.
		Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
		Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
		1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение
		доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
		прерывается, и управление прыгает в начало блока catch(err).
		*/
	e.printStackTrace();
	}
	}
	});
	}
	/*панель на которой располагаются поля и кнопки. Панель доступна только для данного класса (private)*/
	private JPanel panel1;
	/* кнопки "Админ" и "Пользователь" которая доступна только для данного класса*/
	private JButton calc,calc2;
	/* компонент на котором располагается текст*/
	private JLabel label_1;
	/*статическое имя метода. Доступна всем*/
	public static double int_rad;
	/*значение начальных переменных*/
	static double a=13,a1=13,a2=15,a3=30,a4=35;
	/*Модификатор доступа public означает, что метод Nalog()виден и доступен любому классу.
	static означает, что не нужно создавать экземпляр(копию) объекта Nalog в памяти, чтобы использовать этот метод.
	Nalog - расположение на фрейме компонентов (панель вкладок), .*/
	public Nalog() { 
	/*устанавливает название окна*/
	setTitle("Меню");
	/*указывает ширину и высоту.*/
	setSize(225, 175); 
	/*установить посередине экрана*/
	setLocationRelativeTo(null);
	/*по закрытию формы - не закрывать приложение*/
	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	/* Оператор new создает экземпляр указанного класса
	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
	Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё простран-ство контейнера разбивается
	на пять частей. В каждой из этих частей располагается один компонент.
	При добавлении компонента на контейнер с BorderLayout разработчик обязательно указы-вает,
	куда именно он хочет поместить компонент.*/
	setLayout (new BorderLayout()); 
	/*Панель на которой располагается текстовое поле и кнопки*/
	panel1 = new JPanel();
	/*Добавление панели panel1 по центру*/
	add(panel1, BorderLayout.CENTER);
	/*установка внутренних отсту-пов(сверху,слева,снизу,справа)*/
	panel1.setBorder(new EmptyBorder(10,10,10,10));
	/* установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в
	 таблицу */
	/* на панели 3 строки, 1 столбец ,5 - расстояние между столбцами, 5 - между строками */
	panel1.setLayout(new GridLayout(3,1,5,5));
	/*Обозначаем что переменные calc,calc2  являются объектом
	 *  JButton в скобках - надпись на кнопке*/
	calc = new JButton("Пользователь");
	calc2 = new JButton("Админ");
	/*Обозначаем что переменная label_1 являются объектом JLabel и указываем ка-кой текст будет выводиться.
	JLabel.CENTER - выравнивание по центру
	*/
	label_1 = new JLabel("Зайти как:", JLabel.CENTER);
	/*Добавление компонента JLabel на панель panel1*/
	panel1.add(label_1);
	/*Добавление компонента JLabel на панель panel1*/
	panel1.add(calc);
	/*Добавление компонента JButton на панель panel1*/
	panel1.add(calc2);
	/*Обработка событий при нажатии на кнопку calc*/
	calc.addActionListener(new ActionListener() { 
           public void actionPerformed(ActionEvent e) {
        	   /*Вызов main2 из класса Nalog*/
        	   Nalog.main2(null);
        	   }
       });
	/*Обработка событий при нажатии на кнопку calc2*/
	calc2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	/*Вызов main из класса Password*/
        	Password.main(null);
     		}
 });
	}
	/*
	Модификатор доступа public означает, что метод main2(String[] args)виден и доступен любо-му классу.
	static позволяет определять статические методы. Это такие методы, которые являются об-щими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам
	и переменным можно обращаться через имя класса.
	void означает, что метод main2(String[] args)не возвращает данных в программу, которая его вызвала,
	а просто выводит на экран строку.
	В методе main2 слова String[] args означают,что этот может получать массив объектов с ти-пом String, т.е. текстовые данные.
	Программа может состоять из нескольких классов, но только один из них содержит метод main().
	Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс,
	начинают свою работу с вызова метода main2.
	*/
	
	
	
public static void main2(String[] args) { 
	/*SwingUtilities.invokeLater предназначена для запуска асинхронной операции. 
	 * Она сохраняет действие (Runnable), и запускает его на одной из следующих итераций цикла сообщений.*/
SwingUtilities.invokeLater(new Runnable() { 
	/* public - модификатор доступа, означающий, что метод run() виден и до-ступен любому классу.
	void ()означает, что метод run не возвращает данных в программу, которая его вызвала,
	а просто выводит на экран строку.
	Метод run с пустыми скобками, т.е. метод не имеет аргумен-тов(параметров)
	*/
public void run() { 
	/* компонент на котором располагается окно*/
final JFrame form2 = new JFrame();
/*панель на которой располагаются текстовые поля, поле ввода и кнопки.*/
JPanel panel, panel1; 
/* кнопки "Рассчитать" и "В меню" */
JButton calc,calc2; 
/* компоненты на котором располагается текст*/
JLabel label_1,label_2,label_3, label_4,label_n;
final JLabel sum_n;
final JLabel sum;
JLabel label_n1, label_n2, label_n3, label_n4; 
/* текстовое поле в которое пользователь вводит данные */
final JTextField sum_ok;
/* компонент переключатель (при нажатии на одну из
таких кнопок ранее нажатая кнопка возвращается в исходное состояние)*/
JRadioButton rad_13, rad_13_1,rad_15, rad_30, rad_35;
/*устанавливает название окна в form2*/
form2.setTitle("Калькулятор НДФЛ");
/*указывает ширину и высоту в form2.*/
form2.setSize(475, 290); 
/*установить посередине экрана в form2*/
form2.setLocationRelativeTo(null); 
/*по закрытию формы - не закрывать приложение в form2*/
form2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
/*к панели добавляем менеджер BorderLayout в form2 */
form2.setLayout (new BorderLayout()); 
/*окно создается видемым*/
form2.setVisible(true); 
/*Панель на которой располагается текстовое поле и кнопки-переключатели*/
panel = new JPanel(); 
/*Панель на которой располагается кнопки*/
panel1 = new JPanel();
/*Добавление панели panel по центру в form2*/
form2.add(panel, BorderLayout.CENTER); 
/*Добавление панели panel2 снизу в form2*/
form2.add(panel1, BorderLayout.SOUTH); 
/*установка внутренних отсту-пов(сверху,слева,снизу,справа)*/
panel.setBorder(new EmptyBorder(10,0,10,10)); 
/*установка внутренних отсту-пов(сверху,слева,снизу,справа)*/
panel1.setBorder(new EmptyBorder(10,10,10,10)); 
/* установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в 
 * таблицу */
/* на панели 9 строк, 2 столбца,5 - расстояние ме-жду столбцами,  0- между строками  */
panel.setLayout(new GridLayout(9,2,5,0)); 
/*на панели 1 строка,2 столбец, будут расположены кнопки*/
panel1.setLayout(new GridLayout(1,2)); 
/*Обозначаем что переменные label_1,label_2,label_3, label_4,label_n,sum_n,
 * sum,label_n1,label_n2,label_n3,label_n4 являются объектом
 *  JLabel и указываем ка-кой текст будет выводиться.
JLabel.CENTER - выравнивание по центру
JLabel.LEFT - выравнивание по левому краю
JLabel.RIGHT - выравнивание по правому краю
*/
label_1 = new JLabel("Вычитать налог для:", JLabel.LEFT); 
label_2 = new JLabel("Резидент", JLabel.LEFT); 
label_3 = new JLabel("Сумма налога, руб.", JLabel.LEFT); 
label_4 = new JLabel("Сумма на руки, руб.", JLabel.LEFT); 
label_n = new JLabel(""); 
label_n1 = new JLabel("Нерезидент"); 
label_n2 = new JLabel("Доход", JLabel.RIGHT); 
label_n3 = new JLabel("это:", JLabel.LEFT); 
label_n4 = new JLabel("");
sum_n = new JLabel("", JLabel.CENTER); 
sum = new JLabel("", JLabel.CENTER); 
/*Обозначаем что переменные calc,calc2  являются объектом
 *  JButton в скобках - надпись на кнопке*/
calc = new JButton("Рассчитать"); 
calc2 = new JButton("В меню"); 
/* текстовое поле в которое пользователь вводит данные */
sum_ok = new JTextField(); 
/*выравнивание текста по центру*/
sum_ok.setHorizontalAlignment(JTextField.CENTER);
/*установка внутренних отступов для текстового по-ля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)*/
sum_ok.setMargin(new Insets(2, 5, 2, 5)); 
/*Группа кнопок*/
/*Обозначаем что переменные rad_13, rad_13_1,rad_15, 
 * rad_30, rad_35 являются компонентом переключателем
 *  JRadioButton и указываем какой текст будет выводиться.
JRadioButton.LEFT - выравнивание по левому краю
*/
ButtonGroup group = new ButtonGroup(); 
rad_13 = new JRadioButton("Иное",false);
/*Добовляем в группу кнопку переменные
 * rad_13, rad_13_1,rad_15, 
 * rad_30, rad_35*/
group.add(rad_13); 
rad_13.setHorizontalAlignment(JRadioButton.LEFT); 
rad_13_1 = new JRadioButton("Любой доход гражданина ЕАЭС",false); 
group.add(rad_13_1); 
rad_13_1.setHorizontalAlignment(JRadioButton.LEFT); 
rad_15 = new JRadioButton("Дивиденты", false); 
group.add(rad_15); 
rad_15.setHorizontalAlignment(JRadioButton.LEFT); 
rad_30 = new JRadioButton("Иное", false); 
group.add(rad_30); 
rad_30.setHorizontalAlignment(JRadioButton.LEFT); 
rad_35 = new JRadioButton("Выйгрыш,займ или приз", false); 
group.add(rad_35); 
rad_35.setHorizontalAlignment(JRadioButton.LEFT); 
/*Добавление компонентов JRadioButton, JLabel, JTextField на панель panel*/
panel.add(label_1); 
panel.add(label_n); 
panel.add(label_2); 
panel.add(label_n1); 
panel.add(label_n2); 
panel.add(label_n3); 
panel.add(rad_35); 
panel.add(rad_13_1); 
panel.add(rad_13); 
panel.add(rad_15); 
panel.add(label_n4); 
panel.add(rad_30); 
panel.add(label_3); 
panel.add(sum_n); 
panel.add(label_4); 
panel.add(sum); 
panel.add(sum_ok); 
/*Добавление кнопок на панель panel1*/
panel1.add(calc); 
panel1.add(calc2); 
/* 	rad_13 - компонент переключатель
	"."  - указывает к какой переменной следует применить слушателя.
	addActionListener - добавление слушателя ActionListener к переключателю
	new - Оператор new создает экземпляр указанного класса 
	(Для того чтобы кнопки стали функциональными, каждой из них необходимо при-своить обработчик событий, 
	который будет отвечать за реагирование на события. 
	В нашем случае требуется идентифицировать событие нажатия на переключатель – путем щелчка мышью. 
	Поэтому будет использоваться интерфейс "ActionListener", 
	предназначенный для обработки событий "ActionEvent".
	тело интерфейса указывается ниже после фигурной скобки "{" 		*/ 
rad_13.addActionListener(new ActionListener() 
{ 
	/* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
		который реализуется путем простого вызова обработчика событий ActionPerformed.
		Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
		Ключевое слово void означает, что метод main() не возвращает данных в программу, кото-рая его вызвала. 
	*/
public void actionPerformed(ActionEvent e) 
{ 
	/*присвоение int_rad значение "a"*/
int_rad=a; 
/*Очистить текстовое поле*/
sum_n.setText("");
/*Очистить текстовое поле*/
sum.setText(""); 
} 
}); 
/* 	rad_13_1 - компонент переключатель
"."  - указывает к какой переменной следует применить слушателя.
addActionListener - добавление слушателя ActionListener к переключателю
new - Оператор new создает экземпляр указанного класса 
(Для того чтобы кнопки стали функциональными, каждой из них необходимо при-своить обработчик событий, 
который будет отвечать за реагирование на события. 
В нашем случае требуется идентифицировать событие нажатия на переключатель – путем щелчка мышью. 
Поэтому будет использоваться интерфейс "ActionListener", 
предназначенный для обработки событий "ActionEvent".
тело интерфейса указывается ниже после фигурной скобки "{" 		*/ 
rad_13_1.addActionListener(new ActionListener() 
{ 
public void actionPerformed(ActionEvent e) 
{ 
	/*присвоение int_rad значение "a1"*/
int_rad=a1; 
/*Очистить текстовое поле*/
sum_n.setText("");
/*Очистить текстовое поле*/
sum.setText(""); 
} 
}); 
/* 	rad_15 - компонент переключатель
"."  - указывает к какой переменной следует применить слушателя.
addActionListener - добавление слушателя ActionListener к переключателю
new - Оператор new создает экземпляр указанного класса 
(Для того чтобы кнопки стали функциональными, каждой из них необходимо при-своить обработчик событий, 
который будет отвечать за реагирование на события. 
В нашем случае требуется идентифицировать событие нажатия на переключатель – путем щелчка мышью. 
Поэтому будет использоваться интерфейс "ActionListener", 
предназначенный для обработки событий "ActionEvent".
тело интерфейса указывается ниже после фигурной скобки "{" 		*/ 
rad_15.addActionListener(new ActionListener() 
{ public void actionPerformed(ActionEvent e) 
{ 
	/*присвоение int_rad значение "a2"*/
int_rad=a2; 
/*Очистить текстовое поле*/
sum_n.setText("");
/*Очистить текстовое поле*/
sum.setText("");  
} 
}); 
/* 	rad_30 - компонент переключатель
"."  - указывает к какой переменной следует применить слушателя.
addActionListener - добавление слушателя ActionListener к переключателю
new - Оператор new создает экземпляр указанного класса 
(Для того чтобы кнопки стали функциональными, каждой из них необходимо при-своить обработчик событий, 
который будет отвечать за реагирование на события. 
В нашем случае требуется идентифицировать событие нажатия на переключатель – путем щелчка мышью. 
Поэтому будет использоваться интерфейс "ActionListener", 
предназначенный для обработки событий "ActionEvent".
тело интерфейса указывается ниже после фигурной скобки "{" 		*/ 
rad_30.addActionListener(new ActionListener() 
{ public void actionPerformed(ActionEvent e) 
{ 
	/*присвоение int_rad значение "a3"*/
int_rad=a3; 
/*Очистить текстовое поле*/
sum_n.setText("");
/*Очистить текстовое поле*/
sum.setText(""); 
} 
}); 
/* 	rad_35 - компонент переключатель
"."  - указывает к какой переменной следует применить слушателя.
addActionListener - добавление слушателя ActionListener к переключателю
new - Оператор new создает экземпляр указанного класса 
(Для того чтобы кнопки стали функциональными, каждой из них необходимо при-своить обработчик событий, 
который будет отвечать за реагирование на события. 
В нашем случае требуется идентифицировать событие нажатия на переключатель – путем щелчка мышью. 
Поэтому будет использоваться интерфейс "ActionListener", 
предназначенный для обработки событий "ActionEvent".
тело интерфейса указывается ниже после фигурной скобки "{" 		*/ 
rad_35.addActionListener(new ActionListener() 
{ public void actionPerformed(ActionEvent e) 
{ 
	/*присвоение int_rad значение "a4"*/
int_rad=a4; 
/*Очистить текстовое поле*/
sum_n.setText("");
/*Очистить текстовое поле*/
sum.setText(""); 
} 
}); 
/*Обработка событий при нажатии на кнопку calc2*/
calc2.addActionListener(new ActionListener() 
{ 
public void actionPerformed(ActionEvent e) 
/*Закрывает form2 но не закрывает программу*/
{form2.dispose();}});
/* 	calc - кнопка Рассчитать 
	"."  - указывает к какой переменной (кнопке) следует применить слушателя.
	addActionListener - добавление слушателя ActionListener к кнопке
	new - Оператор new создает экземпляр указанного класса 
	(Для того чтобы кнопки стали функциональными, каждой из них необходимо при-своить обработчик событий, 
	который будет отвечать за реагирование на события. 
	В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
	Поэтому будет использоваться интерфейс "ActionListener", 
	предназначенный для обработки событий "ActionEvent".
	тело интерфейса указывается ниже после фигурной скобки "{"
	*/ 
calc.addActionListener(new 
ActionListener() 
{ 
	/* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
		который реализуется путем простого вызова обработчика событий ActionPerformed.
		Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
		Ключевое слово void означает, что метод main() не возвращает данных в программу, кото-рая его вызвала. 
	*/
public void actionPerformed(ActionEvent e) 
{ 
	/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
		если в текстовые поля введены буквы или символы (текст, который невоз-можно преобразовать в цифры).
		Если введены некорректные данные, то выдает ошибку */	
if (isValidInput(sum_ok, "сумму оклада")) { 
	/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Nalog.
	Преобразование данных в тип Double. */ 
	double d = Double.valueOf(sum_ok.getText().toString()); 
	/*Расчёт суммы налога*/
	double pr = int_rad; 
	/*Расчёт суммы на руки*/
	tax tax = new tax();
	
	double t = tax.calcTax(d, pr);
	double t2 = tax.calcTax2(d, pr);
	/* String - указываем что переменная будет иметь строковый тип,
	 * s_pmax - название новой переменной,
	 * String.format - преобразование переменной в строкой тип,
	 	%.2f - указываем что переменная имеет тип Float, показываем 2 знака после запятой,
	 	d_pmax - переменная типа double, которую надо преобразовать в строковый тип
	 	 */ 

	String s_sum_n = String.format("%.2f", t); 
	/* Записываем строковую переменную в поля Jlabel */
	sum_n.setText(s_sum_n); 
	String s_sum = String.format("%.2f", t2); 
	/* Записываем строковую переменную в поля Jlabel */
	sum.setText(s_sum); 


} 
} 

}

		); 
} 



/*проверка данных, введенных пользователем*/
public boolean isValidInput(JTextField jtxt, String description) {
	/*если был введен какой-либо текст*/
    JDialog D = new JDialog();
  /*проверка на ввод только целого числа*/
    if (jtxt.getText().trim().length() > 0) {
    	/* Для задания блока программного кода, который требуется защитить от исключений, исполь-зуется ключевое слово try. 
		Сразу же после try-блока помещается блок catch, задающий тип исключе-ния которое вы хотите обрабатывать.
		Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
		1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
		доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
		 прерывается, и управление прыгает в начало блока catch(err).
		*/     
        try { 
        	/*попытка преобразовать текст в целое число   */
             double num = Double.parseDouble(jtxt.getText().replace(',','.'));    
           /*если все нормально - возвращаем true*/
            return true; 
           	/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
        			Сразу же после try-блока помещается блок catch, задающий тип исключе-ния которое вы хотите обрабатывать.
        			Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
        			1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
        			доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
        			 прерывается, и управление прыгает в начало блока catch(err).
        			*/
        } catch (NumberFormatException e) {
            /*расположить курсор в текстовое поле, чтобы пользователь еще раз ввел число*/
            jtxt.requestFocus();
            /*очистить текстовое поле*/
            jtxt.setText("");
               /*предупреждение - неверный формат числа*/
            JOptionPane.showMessageDialog(D, "Вы должны ввести число!", "Ошибка", JOptionPane.WARNING_MESSAGE);
          /* ошибка - возвращаем false */
            return false;
        }
     /* если пользователь не ввёл никаких данных*/
    } else {
        /*предупреждение, что нужно ввести данные*/
        JOptionPane.showMessageDialog(D, "Введите " + description, "Ошибка", JOptionPane.WARNING_MESSAGE);
        /*расположить курсор в текстово окне, чтобы пользователь еще раз ввел число*/
        jtxt.requestFocus();
      /*очистить текстовое поле*/
        jtxt.selectAll();
        /*ошибка - возвращаем false*/
        return false;
    }
}	});


}

public double Nalog(int  d_sum_ok, String string, int i) {
	double d_sum_n = d_sum_ok/100*i; 
	System.out.print(d_sum_n);
	return d_sum_n;
}







/*
Модификатор доступа public означает, что метод main(String[] args)виден и доступен любо-му классу.
static позволяет определять статические методы. Это такие методы, которые являются об-щими для класса, а не для
отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам
и переменным можно обращаться через имя класса.
void означает, что метод main(String[] args)не возвращает данных в программу, которая его вызвала,
а просто выводит на экран строку.
В методе main слова String[] args означают,что этот может получать массив объектов с ти-пом String, т.е. текстовые данные.
Программа может состоять из нескольких классов, но только один из них содержит метод main().
Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс,
начинают свою работу с вызова метода main.
*/
public static void main1(String[] args) { 
	/*SwingUtilities.invokeLater предназначена для запуска асинхронной операции. 
	 * Она сохраняет действие (Runnable), и запускает его на одной из следующих итераций цикла сообщений.*/
SwingUtilities.invokeLater(new Runnable() { 
	/* public - модификатор доступа, означающий, что метод run() виден и до-ступен любому классу.
	void ()означает, что метод run не возвращает данных в программу, которая его вызвала,
	а просто выводит на экран строку.
	Метод run с пустыми скобками, т.е. метод не имеет аргумен-тов(параметров)
	*/
public void run() { 
	/* компонент на котором располагается окно*/
final JFrame form3 = new JFrame(""); 
/*устанавливает название окна*/
form3.setTitle("Изменение налоговой ставки"); 
/*указывает ширину и высоту.*/
form3.setSize(475, 290); 
/*установить посередине экрана*/
form3.setLocationRelativeTo(null); 
/*по закрытию формы - не закрывать приложение*/
form3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
/* Оператор new создает экземпляр указанного класса
Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё простран-ство контейнера разбивается
на пять частей. В каждой из этих частей располагается один компонент.
При добавлении компонента на контейнер с BorderLayout разработчик обязательно указы-вает,
куда именно он хочет поместить компонент.*/
form3.setLayout (new BorderLayout()); 
/*окно создается видемым*/
form3.setVisible(true); 
/* кнопки "Изменить" и "В меню" */
JButton calc3,calc4; 
/*панели на котором располагаются поля и кнопки.*/
JPanel panel2,panel3; 
/* компоненты на котором располагается текст*/
JLabel label_1,label_n1,label_n2,label_n3,label_n4, 
label_n5,label_n6,label_n7,label_n8,label_n9,label_n10, 
label_n11,label_n12,label_n13,label_n14,label_n15,label_n16, 
label_n17,label_n18,label_n121,label_n131,label_2,label_3; 
/* текстовое поле в которое администратор вводит данные для изменения */
final JTextField sum_ok;
final JTextField sum_ok1;
final JTextField sum_ok2;
final JTextField sum_ok3;
final JTextField sum_ok4; 
/*Панель на которой располагается текстовое поле и кнопки-переключатели*/
panel2 = new JPanel(); 
/*Панель на которой располагается кнопки*/
panel3 = new JPanel(); 
/*Добавление панели panel2 по центру в form3*/
form3.add(panel2, BorderLayout.CENTER);
/*Добавление панели panel3 снизу в form3*/
form3.add(panel3, BorderLayout.SOUTH); 
/*установка внутренних отсту-пов(сверху,слева,снизу,справа)*/
panel2.setBorder(new EmptyBorder(10,10,10,10)); 
/*установка внутренних отсту-пов(сверху,слева,снизу,справа)*/
panel3.setBorder(new EmptyBorder(10,10,10,10)); 
/* установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в
таблицу */
/* на панели 7 строки, 4 столбеца ,5 - расстояние между столбцами, 0 - между строками */
panel2.setLayout(new GridLayout(7,4,5,0)); 
/*на панели 1 строка,2 столбец, будут расположены кнопки*/
panel3.setLayout(new GridLayout(1,2)); 
/*Обозначаем что переменные label_1,label_n1,label_n2,label_n3,label_n4, 
label_n5,label_n6,label_n7,label_n8,label_n9,label_n10, 
label_n11,label_n12,label_n13,label_n14,label_n15,label_n16, 
label_n17,label_n18,label_n121,label_n131,label_2,label_3 являются объектом
 *  JLabel и указываем ка-кой текст будет выводиться.
JLabel.CENTER - выравнивание по центру
JLabel.LEFT - выравнивание по левому краю
JLabel.RIGHT - выравнивание по правому краю
*/
label_1 = new JLabel("Изменить процент", JLabel.LEFT); 
label_n1 = new JLabel("налоговой ставки", JLabel.LEFT); 
label_n2 = new JLabel("для:", JLabel.LEFT); 
label_n3 = new JLabel("", JLabel.LEFT); 
label_n4 = new JLabel("Девидент", JLabel.LEFT); 
label_n5 = new JLabel("", JLabel.LEFT); 
label_n6 = new JLabel("Недевидент", JLabel.LEFT); 
label_n7 = new JLabel("", JLabel.LEFT); 
label_n8 = new JLabel("", JLabel.LEFT); 
label_n9 = new JLabel("Доход", JLabel.RIGHT); 
label_n10 = new JLabel("это:", JLabel.LEFT); 
label_n11 = new JLabel("", JLabel.LEFT); 
label_n12 = new JLabel("Выйгрыш или", JLabel.LEFT); 
label_n121 = new JLabel("займ", JLabel.LEFT); 
label_n13 = new JLabel("Любой доход", JLabel.LEFT); 
label_n131 = new JLabel("гражданина ЕАЭС", JLabel.LEFT); 
label_2 = new JLabel("", JLabel.LEFT); 
label_3 = new JLabel("", JLabel.LEFT); 
label_n14 = new JLabel("Иное", JLabel.LEFT); 
label_n15 = new JLabel("Дивиденты", JLabel.LEFT); 
label_n16 = new JLabel("", JLabel.LEFT); 
label_n17 = new JLabel("", JLabel.LEFT); 
label_n18 = new JLabel("Иное", JLabel.LEFT); 
/*Обозначаем что переменные calc,calc2  являются объектом
 *  JButton в скобках - надпись на кнопке*/
calc3 = new JButton("В меню"); 
calc4 = new JButton("Изменить"); 
/* текстовое поле в которое пользователь вводит данные */
sum_ok = new JTextField(); 
/*выравнивание текста по центру*/
sum_ok.setHorizontalAlignment(JTextField.CENTER);
/*установка внутренних отступов для текстового по-ля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)*/
sum_ok.setMargin(new Insets(2, 5, 2, 5)); 
/* текстовое поле в которое пользователь вводит данные */
sum_ok1 = new JTextField(); 
/*выравнивание текста по центру*/
sum_ok1.setHorizontalAlignment(JTextField.CENTER); 
/*установка внутренних отступов для текстового по-ля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)*/
sum_ok1.setMargin(new Insets(2, 5, 2, 5)); 
/* текстовое поле в которое пользователь вводит данные */
sum_ok2 = new JTextField(); 
/*выравнивание текста по центру*/
sum_ok2.setHorizontalAlignment(JTextField.CENTER); 
/*установка внутренних отступов для текстового по-ля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)*/
sum_ok2.setMargin(new Insets(2, 5, 2, 5)); 
/* текстовое поле в которое пользователь вводит данные */
sum_ok3 = new JTextField(); 
/*выравнивание текста по центру*/
sum_ok3.setHorizontalAlignment(JTextField.CENTER); 
/*установка внутренних отступов для текстового по-ля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)*/
sum_ok3.setMargin(new Insets(2, 5, 2, 5)); 
/* текстовое поле в которое пользователь вводит данные */
sum_ok4 = new JTextField(); 
/*выравнивание текста по центру*/
sum_ok4.setHorizontalAlignment(JTextField.CENTER); 
/*установка внутренних отступов для текстового по-ля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)*/
sum_ok4.setMargin(new Insets(2, 5, 2, 5)); 
/*Добавление компонентов JLabel, JTextField на панель panel2*/
panel2.add(label_1); 
panel2.add(label_n1); 
panel2.add(label_n2); 
panel2.add(label_n3); 
panel2.add(label_n4); 
panel2.add(label_n5); 
panel2.add(label_n6); 
panel2.add(label_n7); 
panel2.add(label_n8); 
panel2.add(label_n9); 
panel2.add(label_n10); 
panel2.add(label_n11); 
panel2.add(label_n12); 
panel2.add(sum_ok); 
panel2.add(label_n13); 
panel2.add(sum_ok1); 
panel2.add(label_n121); 
panel2.add(label_2); 
panel2.add(label_n131); 
panel2.add(label_3); 
panel2.add(label_n14); 
panel2.add(sum_ok2); 
panel2.add(label_n15); 
panel2.add(sum_ok3); 
panel2.add(label_n16); 
panel2.add(label_n17); 
panel2.add(label_n18); 
panel2.add(sum_ok4);
/*Добавление кнопок на панель panel3*/
panel3.add(calc3); 
panel3.add(calc4); 
/*Обработка событий при нажатии на кнопку calc3*/
calc3.addActionListener(new ActionListener() 
{ 
public void actionPerformed(ActionEvent e) 
/*Закрывает form2 но не закрывает программу*/
{form3.dispose();}}); 
/*Обработка событий при нажатии на кнопку calc4*/
calc4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) { 
	/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
	если в текстовые поля введены буквы или символы (текст, который невоз-можно преобразовать в цифры).
	Если введены некорректные данные, то выдает ошибку */
if (isValidInput(sum_ok,"")) {
	/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Nalog.
	Преобразование данных в тип Double. */ 
a4= Double.parseDouble(sum_ok.getText().replace(',','.')); 
/*присвоение int_rad значение "a4"*/
int_rad=(int) a4; 
} 
if (isValidInput(sum_ok1,"")) { 
	/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Nalog.
	Преобразование данных в тип Double. */ 
a1= Double.parseDouble(sum_ok1.getText().replace(',','.')); 
/*присвоение int_rad значение "a1"*/
int_rad=(int) a1; 
} 
/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
если в текстовые поля введены буквы или символы (текст, который невоз-можно преобразовать в цифры).
Если введены некорректные данные, то выдает ошибку */
if (isValidInput(sum_ok2,"")) {
	/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Nalog.
	Преобразование данных в тип Double. */ 
a= Double.parseDouble(sum_ok2.getText().replace(',','.'));
/*присвоение int_rad значение "a"*/
int_rad=(int) a; 
} 
/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
если в текстовые поля введены буквы или символы (текст, который невоз-можно преобразовать в цифры).
Если введены некорректные данные, то выдает ошибку */
if (isValidInput(sum_ok3,"")) { 
	/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Nalog.
	Преобразование данных в тип Double. */ 
a2= Double.parseDouble(sum_ok3.getText().replace(',','.')); 
/*присвоение int_rad значение "a2"*/
int_rad=(int) a2; 
} 
/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
если в текстовые поля введены буквы или символы (текст, который невоз-можно преобразовать в цифры).
Если введены некорректные данные, то выдает ошибку */
if (isValidInput(sum_ok4,"")) { 
	/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Nalog.
	Преобразование данных в тип Double. */ 
a3= Double.parseDouble(sum_ok4.getText().replace(',','.'));; 
/*присвоение int_rad значение "a3"*/
int_rad=(int) a3; 
} 
} 
/*проверка данных, введенных пользователем*/
public boolean isValidInput(JTextField jtxt, String description) {
	/*если был введен какой-либо текст*/
    JDialog D = new JDialog();
  /*проверка на ввод только целого числа*/
    if (jtxt.getText().trim().length() > 0) {
    	/* Для задания блока программного кода, который требуется защитить от исключений, исполь-зуется ключевое слово try. 
		Сразу же после try-блока помещается блок catch, задающий тип исключе-ния которое вы хотите обрабатывать.
		Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
		1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
		доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
		 прерывается, и управление прыгает в начало блока catch(err).
		*/     
        try { 
        	/*попытка преобразовать текст в целое число   */
             double num = Double.parseDouble(jtxt.getText().replace(',','.'));    
           /*если все нормально - возвращаем true*/
            return true; 
           	/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
        			Сразу же после try-блока помещается блок catch, задающий тип исключе-ния которое вы хотите обрабатывать.
        			Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
        			1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
        			доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
        			 прерывается, и управление прыгает в начало блока catch(err).
        			*/
        } catch (NumberFormatException e) {
            /*расположить курсор в текстовое поле, чтобы пользователь еще раз ввел число*/
            jtxt.requestFocus();
            /*очистить текстовое поле*/
            jtxt.setText("");
               /*предупреждение - неверный формат числа*/
            JOptionPane.showMessageDialog(D, "Вы должны ввести число!", "Ошибка", JOptionPane.WARNING_MESSAGE);
          /* ошибка - возвращаем false */
            return false;
        }
     /* если пользователь не ввёл никаких данных*/
    } else {
        /*предупреждение, что нужно ввести данные*/
        JOptionPane.showMessageDialog(D, "Введите " + description, "Ошибка", JOptionPane.WARNING_MESSAGE);
        /*расположить курсор в текстово окне, чтобы пользователь еще раз ввел число*/
        jtxt.requestFocus();
      /*очистить текстовое поле*/
        jtxt.selectAll();
        /*ошибка - возвращаем false*/
        return false;
    }
}	}); 
} 
}); 
}








}