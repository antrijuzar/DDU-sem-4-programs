# Create a class Counter having one member variable count. Initialize
# it with zero with creation of each object and also write member
# method countUp to increase the value of count by one with every
# method call.
class Counter:
    def __init__(self):
        self.count = 0
    def countUp(self):
        self.count += 1
    def setCount(self,value):
        self.count = value
    def getCount(self):
        return self.count
        

c = Counter()
c.countUp()
c.countUp()
c.countUp()
# print("Current count is ",c.getCount())