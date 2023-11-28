class Marca:
    _nombre = None

    def __init__(self, nombre):
        self.nombre = nombre

    def setMarca(self,nombre):
        self.nombre = nombre

    def getMarca(self):
        return self.nombre
    
    def setNombre(self,nombre):
        self.nombre = nombre
        
    def getNombre(self):
        return self.nombre