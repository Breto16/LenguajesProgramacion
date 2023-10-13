% Caso base: partir una lista vacía da como resultado dos listas vacías.
partir([], _, [], []).

% Caso 1: el primer elemento es menor o igual al umbral, se coloca en la lista de Menores y se continúa con el resto de la lista.
partir([X|Resto], Umbral, [X|Menores], Mayores) :-
    X =< Umbral,
    partir(Resto, Umbral, Menores, Mayores).

% Caso 2: el primer elemento es mayor al umbral, se coloca en la lista de Mayores y se continúa con el resto de la lista.
partir([X|Resto], Umbral, Menores, [X|Mayores]) :-
    X > Umbral,
    partir(Resto, Umbral, Menores, Mayores).

% Ejemplos

% partir([2, 7, 4, 8, 9, 1], 6, Menores, Mayores).                                Resultado:    Menores = [2, 4, 1],                   Mayores = [7, 8, 9].

% partir([45, 102, 789, 10, 275, 900, 678, 333, 5], 300, Menores, Mayores).      Resultado:    Menores = [45, 102, 10, 275, 5],       Mayores = [789, 900, 678, 333].
% partir([789, 420, 64, 888, 159, 333, 777, 55, 999], 700, Menores, Mayores).    Resultado:    Menores = [420, 64, 159, 333, 55],     Mayores = [789, 888, 777, 999].
