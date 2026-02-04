class Privatedemo:
    __num = 0
    def count(self):
        self.__num += 1
        print("count = ", self.__num)
        
number = Privatedemo()
number.count()
number.count()
number.count()

