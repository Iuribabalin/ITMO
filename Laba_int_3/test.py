def Integere(n):
	nm = 0
	b = 0
	b = 10**(len(n) - 1)

	for i in range(len(n)):
		nm += (ord(n[i])-48) * b
		b//=10
	return(nm)

def ten_to_fi(n):
    f0, f1 = 0, 1
    resnum = [] # в этот список заносятся номера чисел ф. из которых состоит данное число
    num = -1 
    finres = '' # это строка окончательного результата
    while n != 0: 
        while f1 <= n: # перебираем числа ф. пока не найдем число большее данного
            f0, f1 = f1, f0 + f1
            num += 1 
            if f1 > n:              # если текущее число ф. больше данного
                n -= f0             # вычитаем его из данного
                resnum.append(num)  # и добавляем его номер в список, при этом
                f0, f1 = 0, 1       # сбрасываем числа ф. и
                num = -1            # счетчик их номера
                
    i = resnum[0]   # у нас есть список с номерами чисел ф. образующих данное число.
    while i > 0:    # следует его обработать и представить в виде числа в ф. сс
        k = 0
        check = False 
        while k < len(resnum): 
            if i == resnum[k]:
                finres += '1'
                check = True
            k += 1
        if check == False:
            finres += '0'
        i -= 1
 
    return finres

#Сори но мне леь думать поэтому через список кодировок =)
def heX(n):
	h = '0000 0001 0010 0011 0100 0101 0110 0111 1000 1001 1010 1011 1100 1101 1110 1111'
	h = h.split(' ')
	s = ''
	num = 0
	k = 0
	for i in range(len(n)):
		if n[i] == '0':
			s = s + h[0]
		elif n[i] == '1':
			s = s + h[1]
		elif n[i] == '2':
			s = s + h[2]
		elif n[i] == '3':
			s = s + h[3]
		elif n[i] == '4':
			s = s + h[4]
		elif n[i] == '5':
			s = s + h[5]
		elif n[i] == '6':
			s = s + h[6]
		elif n[i] == '7':
			s = s + h[7]
		elif n[i] == '8':
			s = s + h[8]
		elif n[i] == '9':
			s = s + h[9]
		elif n[i] == 'A':
			s = s + h[10]
		elif n[i] == 'B':
			s = s + h[11]
		elif n[i] == 'C':
			s = s + h[12]
		elif n[i] == 'D':
			s = s + h[13]
		elif n[i] == 'E':
			s = s + h[14]
		elif n[i] == 'F':
			s = s + h[15]
	k = len(s) - 1
	for i in range(len(s)):
		num += Integere(s[i]) * 2**(k)
		k -= 1
	return(num)


#Открываем файл на чтение и запись
f = open('inputM.txt')
f1 = open('outputM.txt', 'w')
#Читаем файл и разбиваем его по переносу строки
text = f.read()
text = text.split('\n')

#цикл обработки данных (перевод из одной сс в другую)
for n in range(len(text)):
	j = 2
	a = text[n]
	a = a.split(' ')
	out = ''
	out = out + a[0] + " -> " + a[1] + ": "

	if a[0] == '10':
		while j < len(a):
			out = out + a[j] + " -> " + ten_to_fi(Integere(a[j])) + " "
			j+=1
	elif a[0] == '16':
		while j < len(a):
			out = out + a[j] + " -> " + str(heX(a[j])) + " "
			j+=1
	print(out)
	f1.write(out + '\n')

#Закрываем файлы 
f.close()
f1.close()