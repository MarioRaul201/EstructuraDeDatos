# Representación de un grafo usando un diccionario (lista de adyacencia)
grafo = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': ['F'],
    'F': []
}

# Algoritmo DFS recursivo
def dfs(grafo, nodo, visitados=None):
    if visitados is None:
        visitados = set()
    if nodo not in visitados:
        print(nodo)
        visitados.add(nodo)
        for vecino in grafo[nodo]:
            dfs(grafo, vecino, visitados)

# Llamada de ejemplo
dfs(grafo, 'A')
