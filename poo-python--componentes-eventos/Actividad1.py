from tkinter import *
import tkinter

ventana = Frame(height=250,width=450)
ventana.grid(padx=5,pady=5)

def sumar():
   resultado= int(numero1.get())+int(numero2.get())
   Label(text=resultado,font=("Broadway",15),fg="blue").place(width=14,x=130,y=160)

def restar():
   resultado= int(numero1.get())-int(numero2.get())
   Label(text=resultado,font=("Broadway",15),fg="blue").place(width=14,x=200,y=160)

def multiplicar():
  resultado= int(numero1.get())*int(numero2.get())
  Label(text=resultado,font=("Broadway",15),fg="blue").place(width=14,x=270,y=160)

def dividir():
   if int(numero2.get())==0:
          resultado="error"
   elif int(numero2.get())!=0:
          resultado= int(numero1.get())/int(numero2.get())
   Label(text=resultado,font=("Broadway",15),fg="blue").place(width=60,x=340,y=160)


resultado=0
numero1 = IntVar()
numero2 = IntVar()
titulo = Label(text="Calculadora bàsica",font=("Algerian",15)).place(x=150,y=30)
nu1 = Entry(textvariable=numero1).place(width=130,x=180,y=60)
nu2 = Entry(textvariable=numero2).place(width=130,x=180,y=90)
bsumar = Button(text="suma",command=sumar).place(width=80, x=50,y=120)
botonre = Button(text="resta",command=restar).place(width=80, x=150,y=120)
botonpor = Button(text="multiplicacion",command=multiplicar ).place(width=90, x=250,y=120)
botondi = Button(text="dividir",command=dividir).place(width=80, x=350,y=120)
ventana.mainloop()