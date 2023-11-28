from zooAnimales.animal import Animal

class Mamifero(Animal):
    caballos=0
    leones=0
    mamiferos=[]
    
    def __init__(self, nombre, edad, habitat, genero, pelaje, patas):
        super().__init__(nombre, edad, habitat, genero)
        self._patas=patas
        self._pelaje=pelaje
        Mamifero.mamiferos.append(self)
       
    
    @classmethod
    def crearCaballo(cls, nombre, edad, genero):
        Mamifero.caballos+=1
        return cls(nombre, edad, "pradera", genero, True, 4)
    
    @classmethod
    def crearLeon(cls, nombre, edad, genero):
        Mamifero.leones+=1
        return cls(nombre, edad, "selva", genero, True, 4)
    
    def movimiento():
        return "desplazarse"
    
    @classmethod
    def cantidadMamiferos(cls):
        return len(cls.mamiferos)
    
    def getMamiferos(self):
        return self.mamiferos
    
    def setMamiferos(self, mamiferos):
        self.mamiferos=mamiferos

    def getPatas(self):
        return self._patas
    
    def setPatas(self, patas):
        self._patas=patas

    def isPelaje(self):
        return self._pelaje;

    def setPelaje(self, pelaje):
        self._pelaje=pelaje

    def toString(self):
        return self.__str__()
