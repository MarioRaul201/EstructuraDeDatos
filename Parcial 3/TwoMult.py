from typing import List


class SolutionBruteForce:
    # Solución de fuerza bruta
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # Recorremos cada elemento
        for i in range(len(nums)):
            # Recorremos los siguientes elementos para evitar duplicados
            for j in range(i + 1, len(nums)):
                # Verificamos si la suma es igual al target
                if nums[i] * nums[j] == target:
                    return [i, j]
                


sbf= SolutionBruteForce()
r= sbf.twoSum([2, 7, 11, 15], 14)
print(r)
                