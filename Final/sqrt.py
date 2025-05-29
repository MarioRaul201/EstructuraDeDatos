class Solution(object):
    def my_sqrt(self,x):
    # Caso base: si x es 0 o 1, su raíz cuadrada entera es el mismo número
        if x < 2:
            return x

    # Inicializamos los extremos del rango de búsqueda
        left, right = 0, x

    # Búsqueda binaria: buscamos el valor cuyo cuadrado sea menor o igual a x
        while left <= right:
            mid = (left + right) // 2       # Calculamos el punto medio
            square = mid * mid              # Calculamos el cuadrado de mid

            if square == x:
                return mid                  # Si encontramos el cuadrado exacto, lo devolvemos
            elif square < x:
                left = mid + 1              # Buscamos en la mitad derecha
            else:
                right = mid - 1             # Buscamos en la mitad izquierda

    # Al terminar, right será el mayor número cuyo cuadrado es menor o igual a x
        return right
