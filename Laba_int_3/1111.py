#Функция перевода строки в числовой вид
def Integere(n):
	b1 = 0
	nm = 0
	b1 = 10**(len(n) - 1)

	for i in range(len(n)):
		nm += (ord(n[i])-48) * b1 # nm 
		b1//=10
	return(nm)

#Открываем файл на чтение и запись
f = open('inputV.txt')
f1 = open('outputV.txt', 'w')
#Читаем файл
text = f.read()
#Разбиваем 
text = text.split('\n')

out = ''

#Цикл для нахождения суммы баллов и формирования предворительной строки ответа
for i in range(len(text)):
	s = text[i].split(' ')
	n1 = Integere(s[4])
	n2 = Integere(s[5])
	n3 = Integere(s[6])
	sn = (n1+n2+n3)
	out += s[0] + " " + s[1] + " | " + s[2] + " | " + s[3] + " | " + s[4] + " " + s[5] + " " + s[6] + " -> " + str(sn) + "\n"


out = out.split('\n')

ans=''
i = 0
#Сортировка строк по убыванию баллов
while i < (len(out) - 1):
	j = i + 1
	while j < (len(out) - 1):
		ans = out[i].split(' -> ')
		a = Integere(ans[1])
		ans = out[j].split(' -> ')
		a1 = Integere(ans[1])
		if a < a1:
			out[i], out[j] = out[j], out[i] #мы меняем местами две строки
		j+=1
		a1 = 0
	a = 0
	i+=1




ans = ''
#формирование окончательного ответа, запись в файл, вывод в стандартный output 
for i in range(len(out) - 1):
	out[i] = out[i].split(' -> ')
	out[i][1] = str(Integere(out[i][1])/3)
	ans = out[i][0] + " -> " + out[i][1]
	print(ans)
	f1.write(ans + '\n')


#Закрываем файлы 
f.close()
f1.close()