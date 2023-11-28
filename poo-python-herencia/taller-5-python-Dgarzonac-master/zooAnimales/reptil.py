from zooAnimales.animal import Animal

class Reptil(Animal):
    iguanas=0
    serpientes=0
    reptiles=[]
    
    def __init__(self, nombre, edad, habitat, genero, colorEscamas, largoCola):
        super().__init__(nombre, edad, habitat, genero)
        self._colorEscamas=colorEscamas
        self._largoCola=largoCola
        Reptil.reptiles.append(self)
        
    
    @classmethod
    def crearIguana(cls, nombre, edad, genero):
        Reptil.iguanas+=1
        return cls(nombre, edad, "humedal", genero, "verde", 3)
    
    @classmethod
    def crearSerpiente(cls, nombre, edad, genero):
        Reptil.serpientes+=1
        return cls(nombre, edad, "jungla", genero, "blanco", 1)
    
    def movimiento():
        return "reptar"
    
    @classmethod
    def cantidadReptiles(cls):
        return len(cls.reptiles)
    
    def getReptiles(self):
        return self.reptiles
    
    def setReptiles(self, reptiles):
        self.reptiles=reptiles

    def getLargoCola(self):
        return self._largoCola
    
    def setLargoCola(self, largoCola):
        self._largoCola=largoCola
    
    def getColorEscamas(self):
       return self._colorEscamas
    
    def setColorEscamas(self, colorEscamas):
        self._colorEscamas=colorEscamas

    def toString(self):
        return self.__str__()
