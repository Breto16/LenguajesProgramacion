suma_lista([], 0).  % La suma de una lista vacía es 0.
suma_lista([X|Resto], S) :-
    suma_lista(Resto, SResto),
    S is X + SResto.

suma_lista_Contar(L, S) :-
    suma_lista(L, S).

% Se Llama a suma_lista_Contar
% Ejemplos:
% suma_lista_Contar([1, 2, 3, 4, 5], 15).     true

% suma_lista_Contar([1, 2, 3, 4, 6], 15).     false