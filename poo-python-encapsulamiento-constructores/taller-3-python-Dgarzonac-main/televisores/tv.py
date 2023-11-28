class TV:
    _numTV=0
    def __init__(self, marca, estado):
        self.marca = marca
        self.estado = estado
        self.canal = 1
        self.precio = 500
        self.volumen = 1
        self.control = None
        TV._numTV+=1
    
    def canalUp(self):
        if self.estado==True:
            if self.canal < 120:
                self.canal += 1
    
    def canalDown(self):
        if self.estado:
            if self.canal > 1:
                self.canal -= 1
    
    def volumenUp(self):
        if self.estado:
            if self.volumen < 7:
                self.volumen += 1
    
    def volumenDown(self):
        if self.estado:
            if self.volumen > 0:
                self.volumen -= 1

    def turnOn(self):
        self.estado = True

    def turnOff(self):
        self.estado = False
    
    def setMarca(self, marca):
        self.marca = marca
    
    def setPrecio(self, precio):
        self.precio = precio
    
    def setCanal(self, canal):
        if self.estado:
            if canal >= 1 and canal <= 120:
                self.canal = canal    
    
    def setVolumen(self, volumen):
        if self.estado:
            if volumen >= 0 and volumen <= 7:
                self.volumen = volumen
    
    def setControl(self, control):
        self.control = control
    
    def getMarca(self):
        return self.marca
    
    def getPrecio(self):
        return self.precio
    
    def getCanal(self):
        return self.canal
    
    def getVolumen(self):
        return self.volumen
     
    def getEstado(self):
        return self.estado
    
    def getControl(self):
        return self.control
    @classmethod
    def getNumTV(cls):
        return cls._numTV
    @classmethod
    def setNumTV(cls, numTV):
        cls._numTV=numTV 
