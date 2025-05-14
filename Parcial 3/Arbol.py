


class Nodo:
    def __init__(self, clave):
        self.clave = clave
        self.izquierdo = None
        self.derecho = None

class ArbolBinarioBusqueda:
    def __init__(self):
        self.raiz = None

    def insertar(self, clave):
        if self.raiz is None:
            self.raiz = Nodo(clave)
        else:
            self._insertar_rec(self.raiz, clave)

    def _insertar_rec(self, nodo, clave):
        if clave < nodo.clave:
            if nodo.izquierdo is None:
                nodo.izquierdo = Nodo(clave)
            else:
                self._insertar_rec(nodo.izquierdo, clave)
        elif clave > nodo.clave:
            if nodo.derecho is None:
                nodo.derecho = Nodo(clave)
            else:
                self._insertar_rec(nodo.derecho, clave)
        # Si la clave ya existe, no se inserta (evita duplicados)

    def buscar(self, clave):
        return self._buscar_rec(self.raiz, clave)

    def _buscar_rec(self, nodo, clave):
        if nodo is None:
            return False
        if clave == nodo.clave:
            return True
        elif clave < nodo.clave:
            return self._buscar_rec(nodo.izquierdo, clave)
        else:
            return self._buscar_rec(nodo.derecho, clave)

# Ejemplo de uso:
arbol = ArbolBinarioBusqueda()
arbol.insertar(50)
arbol.insertar(30)
arbol.insertar(70)
arbol.insertar(20)
arbol.insertar(40)

print("¿Existe 30?:", arbol.buscar(30))  # True
print("¿Existe 60?:", arbol.buscar(60))  # False
