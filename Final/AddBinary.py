class Solution(object):
    def addBinary(self,a, b):
        result = []
        carry = 0

        i, j = len(a) - 1, len(b) - 1

        # Recorremos desde el último dígito hacia el inicio
        while i >= 0 or j >= 0 or carry:
            total = carry

            if i >= 0:
                total += int(a[i])
                i -= 1
            if j >= 0:
                total += int(b[j])
                j -= 1

            result.append(str(total % 2))   # el bit actual (0 o 1)
            carry = total // 2              # el carry para la siguiente suma

        # Damos la vuelta al resultado (porque fuimos de derecha a izquierda)
        return ''.join(reversed(result))