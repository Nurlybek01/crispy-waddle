from tkinter import *
window = Tk()
window.title('Доставка почты KazPost')
window.geometry("300x200")
window.iconbitmap("kazpost.ico")


label_1 = Label(window, text = "Kazpost", fg = "black")
label_1.grid(row = 0, column = 3)

label_2 = Label(window, text = "Выберите способ доставки", fg = "black", width = 40)
label_2.grid(row = 2, column = 3)

button_1 = Button(window, text = "Автодоставка", fg = "black")
button_1.grid(row = 4, column = 3)

button_2 = Button(window, text = "Квадрокоптер", fg = "black")
button_2.grid(row = 6, column = 3)

button_3 = Button(window, )










window.mainloop()