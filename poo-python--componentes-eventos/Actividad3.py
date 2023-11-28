import tkinter as tk 

# Funciones a utilizar

def agregar_nombre():
    listbox.insert(tk.END, entrada.get())
    entrada.delete(0, last=tk.END)
    

# Configuracion de ventana
ventana = tk.Tk()
ventana.title("Agregar nombres")
ventana.geometry("300x300")

label = tk.Label(ventana, text="Nombre:")
boton = tk.Button(ventana, text="Agregar", command = agregar_nombre)
entrada = tk.Entry(ventana, textvariable = tk.StringVar(ventana))
listbox = tk.Listbox(ventana, height=15, width=20)

label.grid(row=0, column=0, padx=10)
entrada.grid(row=0, column=1, padx=10)
boton.grid(row=0, column=2, padx=10)
listbox.grid(row=1, column=1, columnspan=1, padx=10, pady= 20)

ventana.mainloop()
