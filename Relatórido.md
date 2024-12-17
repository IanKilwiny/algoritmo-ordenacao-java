# RELATÓRIO CONSTRUÇÃO E ANÁLISE DE ALGORITMOS
## Implementação de Algoritmos de Ordenação de complexidade   $O n^{2}$
### Equipe:
- John Emanuel
- Ian Kilwiny
- Marcus Vinícius
- João Vitor

## Bubble Sort simples

*Implementação simples do algoritmo em java:*

``` java
    public Integer[] bubbleSortSimples(Integer nums[]){

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
```
**Tempo de execução:**
```bash
#######BUBBLE SORT SIMPLES############
TEMPO INICIAL: 05:26
TEMPO FINAL: 05:31
###########BUBBLE SORT OTIMIZADO##########
TEMPO INICIAL: 05:31
TEMPO FINAL: 05:31
```
