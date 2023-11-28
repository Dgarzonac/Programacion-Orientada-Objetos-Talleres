from deportista import Deportista
from persona import Persona
class Futbolista(Persona, Deportista):
    _listaFutbolistas = []
    def __init__(self, nombre, edad, altura, sexo, añosPracticando, golesMarcados, tarjetasRojas, piernaHabil):
        Persona.__init__(self, nombre, edad, altura, sexo)
        Deportista.__init__(self, "Futbol", añosPracticando)
        self._golesMarcados = golesMarcados
        self._tarjetasRojas = tarjetasRojas
        self._piernaHabil= piernaHabil
        Futbolista._listaFutbolistas.append(self)
        
    def getGolesMarcados(self):
        return self._golesMarcados

    def getTarjetasRojas(self):
        return self._tarjetasRojas
    
    def getPiernaHabil(self):
        return self._piernaHabil
    
    def getListaFutbolistas(self):
        return self._listaFutbolistas

    def setListaFutbolistas(self, listaFutbolistas):
        self._listaFutbolistas = listaFutbolistas
    
    def __str__(self):
        return f"Mi nombre es {self.getNombre()} soy profesional en el deporte {self.getDeporte()} Tengo {self.getEdad()} años de edad y llevo {self.getAñosPracticando()} años en el deporte"
    