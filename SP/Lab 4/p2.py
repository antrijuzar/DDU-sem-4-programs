# Import above module(consider that Counter class is defined in file 
# P1.py) and derive a class CountDown from Counter class with one more 
# method countDown to decrease a value of count by one with every
# method call.
from p1 import Counter
class CountDown(Counter):
    def __init__(self):
        super().__init__()
    def countDown(self):
        self.count -= 1

c = CountDown()
c.countUp()
c.countUp()
c.countUp()
c.countDown()
c.countDown()
print("Current count is ",c.getCount())