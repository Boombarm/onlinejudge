



class Product:
    def __init__(self, name, price) -> None:
        self.name = name
        self.__price = price # Private Attributes

    def get_price(self):
        return self.__price

class Order:

    def __init__(self) -> None:
        self.sum = 0.00
        self.product = list()
        
        
    def add_product(self,p:Product):
        self.product.append(p)
        self.sum += p.get_price()
        
    def display():
        print(sum)



        
if __name__ == '__main__':
    order = Order()
    order.add_product(Product('product A',1234))
    order.add_product(Product('product B',222.05))
    for i in order.product:
        print(i.name ,i.get_price())
    print('total:',order.sum)