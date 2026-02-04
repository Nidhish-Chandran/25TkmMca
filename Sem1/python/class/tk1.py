import tkinter as tk

root = tk.Tk()

w = tk.Label(
    root,
    text="Hello",
    cursor="arrow",
    font=("Times New Roman", 16),
    bg="lightgreen"
)
w.pack()

root.mainloop()
