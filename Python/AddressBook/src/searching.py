name=input("Please enter your name")
name=name.lower()

addressbook = open("addressbookdb.txt")

for line in addressbook: 
    record = line.split('|')
    if record[0] == name:
        found = True
        break
    else: 
        found = False
        continue
        
if found == False:
    print("Name not found, unlucky!!")
else:
    print(record[0], record[1])