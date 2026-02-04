'''Create a class Publisher (name). Derive class Book from Publisher with 
attributes title an d author. Derive class Python from Book with attributes price 
and no_of_pages.  Write a program that displays information about a Python 
book. Use base class constructor invocation and method overriding.'''


class Publisher:
    def __init__(self, name):
        self.name = name

    def display(self):
        print("Publisher Name:", self.name)

class Book(Publisher):
    def __init__(self, name, title, author):
        super().__init__(name)
        self.title = title
        self.author = author

    def display(self):
        super().display()
        print("Book Title:", self.title)
        print("Author:", self.author)


class Python(Book):
    def __init__(self, name, title, author, price, no_of_pages):
        super().__init__(name, title, author)
        self.price = price
        self.no_of_pages = no_of_pages

    def display(self):
        super().display()
        print("Price: ₹", self.price)
        print("Number of Pages:", self.no_of_pages)


publisher_name = input("Enter the name of the publisher: ")
book_title = input("Enter the title of the book: ")
book_author = input("Enter the author of the book: ")
book_price = int(input("Enter the price of the book: "))
book_pages = int(input("Enter the number of pages: "))


python_book = Python(publisher_name, book_title, book_author, book_price, book_pages)


print("\nDetails of the Python Book:")
python_book.display()
