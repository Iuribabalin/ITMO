#Функция задаёт ряд фибоначи (рекурсией)
def fib(n):
    if n in (1, 2):
        return 1
    return fib(n - 1) + fib(n - 2)

#Функция перевода строки в числовой вид с помощью кодировки символа 
def Integere(n):
	nm = 0
	b = 0
	b = 10**(len(n) - 1)

	for i in range(len(n)):
		nm += (ord(n[i])-48) * b
		b//=10
	return(nm)
#Превод в двоичную СС +)
def ten_to_2(n):
	s = ''
	o = ''
	cnt = 0
	num = Integere(a[j])#Используем функцию перевода в число
	NumTest = str(num)

	while num > 0:
		s = s + str(num%2)
	#Разделяем точами тетрады
		cnt+=1
		if (cnt%4 == 0 and num > 1) :
			s = s + "."
			cnt = 0
		num//=2
		#Создаём вывод
	o = o + NumTest + " -> " + s[:: -1] + " "
	return(o)

#Перевод из фибоначивой в 10 СС
def fib_to_10(n):
	l = len(n) + 1
	num = 0
	numOut = 0
	o = ''
	for i in range(len(n)):
		num = Integere(n[i]) #Переводм строку в число
		numOut = numOut + fib(l)*num #используем функцию для получения элемента ряда фиб и умножаем на цифру числа в фиб СС
		l-=1
	#Создаем вывод
	o = o + a[j] + " -> " + str(numOut) + " "
	return(o)

#////////////////////////////////////////////////////////////////////////////////////////

#Открываем файл на чтение и запись
f = open('Input.txt')
f1 = open('Output.txt', 'w')
#Читаем файл и разбиваем его по переносу строки
text = f.read()
text = text.split('\n')


#цикл обработки данных (перевод из одной сс в другую)
for n in range(len(text)):
	#объявление переменных для перевода чисел
	out = ''
	a = text[n]
	a = a.split(' ')
	j = 2

	#Создание начальной строчки для вывода 1СС -> 2СС
	out = out + a[0] + " -> " + a[1] + ": "
	#Определяем из какого числа нам надо переводить, если 10 до в 2 СС, если fib то в 10 СС
	
	if a[0] == '10':
		while j < len(a):
			out += ten_to_2(a[j])
			j+=1

	elif a[0] == 'fib':
		while j < len(a):
			out += fib_to_10(a[j])
			j+=1
	#Выводы в стандартный и фаел +)
	print(out)
	f1.write(out + '\n')

#Закрываем файлы 
f.close()
f1.close()