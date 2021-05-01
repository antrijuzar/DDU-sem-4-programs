# In above program override countUp method to increase the value of 
# count by 2 with each method call.
from p1 import Counter
class CountDown(Counter):
    def __init__(self):
        super().__init__()
    def countDown(self):
        self.count -= 1
    def countUp(self):
        self.count += 2

c = CountDown()
c.countUp()
c.countUp()
c.countUp()
c.countDown()
c.countDown()
print("Current count is ",c.getCount())