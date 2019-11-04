

f = open('Ffile.xml', 'r', encoding = "utf-8")
f1 = open('out.yaml', 'w', encoding = "utf-8")



xml = f.read()

hpxml = xml.split('\n')

hpxml[0] = hpxml[0].split(' ')
hpxml[0][0] = hpxml[0][0].split('<')

hpxml[1] = hpxml[1].split('\t')
hpxml[1][1] = hpxml[1][1].split('<')
hpxml[1][1][1] = hpxml[1][1][1].split('>')

hpxml[2] = hpxml[2].split(' ')
hpxml[2][0] = hpxml[2][0].split('\t')
hpxml[2][0][2] = hpxml[2][0][2].split('<')

f1.write(hpxml[0][0][1] + " :\n\t" + hpxml[1][1][1][0] + " :\n\t\t" + hpxml[2][0][2][1] + " :\n\t\t\t-\n\t\t\t")

xml = xml.split(hpxml[0][0][1])

xml = xml[1].split(hpxml[1][1][1][0])

hpxml = xml[0].split('>\n\t')

hpxml = hpxml[0].split(' ')

lastOut = ""
i = 1

while i < len(hpxml):
	hpxml[i] = hpxml[i].split('=')
	lastOut = lastOut + "\t" + "_" + hpxml[i][0] + ": "
	hpxml[i][1] = hpxml[i][1].split('"')
	lastOut = lastOut + hpxml[i][1][1]
	if i < len(hpxml)-1:
		lastOut += "\n"
	i += 1

xml = xml[1].split('>')

i = 0
while i < len(xml):
	xml[i] = xml[i].split('"') 
	i+=1

i = 1
j = 0
while i < len(xml) - 1:
	while j < len(xml[i])-1:
		if j%2 == 1 :
			if ((j == 7) and (i == 8)):
				f1.write('"' + xml[i][j] + '"\n')
			elif j == 0:
				f1.write('"' + xml[i][j] + '"\n\t\t\t')
			elif j == 7:
				f1.write('"' + xml[i][j] + '"\n\t\t\t')
			else:
				f1.write('"' + xml[i][j] + '"\n\t\t\t\t')
		if j%2 == 0:
			hp = xml[i][j].split(' ')
			hp[1] = hp[1].split('=')
			f1.write("_" + hp[1][0] + ": ")
		j += 1
		if ((j == 8) and (i != 8)):
			f1.write("-\n\t\t\t")
	j = 0
	i += 1

f1.write(lastOut)
