def num_en_lista(num,l):
    """int,list -> bool
       OBJ: Decir si el número está en la lista"""
    l2 = []
    for pal in l:
        l2.append(pal)
    if(len(l2) == 0):
        return False
    if(num == l2[0]):
        return True
    elif(num != l2[0]):
        l2.remove(l2[0])
        return num_en_lista(num,l2)

#Probador
l = [0,4,3,7,2,8,54,3,6,2,45]
print(num_en_lista(78,l))
print(num_en_lista(54,l))
print(num_en_lista(45,l))
