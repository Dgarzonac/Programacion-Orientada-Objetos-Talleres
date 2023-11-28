from zooAnimales.animal import Animal

class Pez(Animal):
    salmones=0
    bacalaos=0
    peces=[]
    
    def __init__(self, nombre, edad, habitat, genero, colorEscamas, cantidadAletas):
        super().__init__(nombre, edad, habitat, genero)
        self._colorEscamas=colorEscamas
        self._cantidadAletas=cantidadAletas
        Pez.peces.append(self)
        
    
    @classmethod
    def crearSalmon(cls, nombre, edad, genero):
        Pez.salmones+=1
        return cls(nombre, edad, "oceano", genero, "rojo", 6)
    
    @classmethod
    def crearBacalao(cls, nombre, edad, genero):
        Pez.bacalaos+=1
        return cls(nombre, edad, "oceano", genero, "gris", 6)
    
    def movimiento():
        return "nadar"
    
    @classmethod
    def cantidadPeces(self):
        return len(self.peces)
    
    def getPeces(self):
        return self.peces
    
    def setPeces(self, peces):
        self.peces=peces

    def getCantidadAletas(self):
        return self._cantidadAletas
    
    def setCantidadAletas(self, cantidadAletas):
        self._cantiadaAletas=cantidadAletas
    
    def getColorEscamas(self):
       return self._colorEscamas
    
    def setColorEscamas(self, colorEscamas):
        self._colorEscamas=colorEscamas

    def toString(self):
        return self.__str__()
