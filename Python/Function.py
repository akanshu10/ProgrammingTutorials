class Person:
    def __init__(self,fname,lname):
        self.fname=fname
        self.lname=lname
    def welcome1(self):
        print("My name is "+self.fname+" "+self.lname)
class Student(Person):
    def __init__(self,fname,lname):
        super().__init__(fname,lname)
        self.fname=fname
        self.lname=lname
    def Welcome(self):
        print("Hello"+self.fname +" "+self.lname)
p1=Person("akanshu","kumar")
p1.welcome1()
s1=Student("AKanshu","Rajput")
s1.welcome1()
s1.Welcome()