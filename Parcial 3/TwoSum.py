from typing import List


class SolutionBruteForce:
    # Solución de fuerza bruta
    def twoSum(self, nums: List[int], target: int) -> list[int]:
        # Recorremos cada elemento
        for i in range(len(nums)):
            # Recorremos los siguientes elementos para evitar duplicados
            for j in range(i + 1, len(nums)):
                # Verificamos si la suma es igual al target
                if nums[i] + nums[j] == target:
                    return [i, j]
                





class SolutionHash:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mapa = {}  # valor -> índice
        
        for i, num in enumerate(nums):
            complemento = target - num
            
            # Si el complemento ya está en el mapa, devolvemos los índices
            if complemento in mapa:
                return [mapa[complemento], i]
            
            # Guardamos el valor actual y su índice
            mapa[num] = i