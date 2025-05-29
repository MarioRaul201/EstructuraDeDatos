class Solution(object):
    def climb_stairs(self,n):
        if n <= 2:
            return n  # Casos base: n = 1 → 1 forma, n = 2 → 2 formas

        first, second = 1, 2      # ways(1), ways(2)

        for i in range(3, n + 1):
            third = first + second               # total formas para llegar a i
            first, second = second, third        # movemos los valores hacia adelante

        return second
