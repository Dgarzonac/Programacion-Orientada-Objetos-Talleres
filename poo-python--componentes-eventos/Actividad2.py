import tkinter as tk

def cambioVentana():
    ventanaInicio.withdraw()
    ventanaPrincipal.deiconify()

def salir():
    ventanaPrincipal.withdraw()
    ventanaInicio.deiconify()

ventanaInicio = tk.Tk()
ventanaInicio.geometry("300x300")
ventanaInicio.title("Ventana inicio")

# Crear el botón y centrarlo en la ventana de inicio
boton1 = tk.Button(ventanaInicio, text="Ventana principal", command=cambioVentana)
boton1.place(relx=0.5, rely=0.5, anchor=tk.CENTER)

ventanaPrincipal = tk.Toplevel()
menuBar = tk.Menu(ventanaPrincipal)
ventanaPrincipal.config(menu=menuBar)
ventanaPrincipal.geometry("300x300")
ventanaPrincipal.title("Ventana principal")

menuArchivo = tk.Menu(menuBar, activebackground="white", activeforeground="white")
menuBar.add_cascade(label="Archivo", menu=menuArchivo)
menuArchivo.add_command(label="Salir", command=salir)

ventanaPrincipal.withdraw()

ventanaInicio.mainloop()
