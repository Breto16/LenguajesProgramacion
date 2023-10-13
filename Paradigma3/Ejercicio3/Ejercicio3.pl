% Caso base: la lista vacía aplanada es una lista vacía.
aplanar([], []).

% Caso 1: Si el primer elemento de la lista es una lista, aplanamos esa lista y concatenamos el resultado con el resto de la lista.
aplanar([X|Resto], L2) :-
    is_list(X),  % Verifica si X es una lista.
    aplanar(X, XAplanada),
    aplanar(Resto, RestoAplanado),
    append(XAplanada, RestoAplanado, L2).

% Caso 2: Si el primer elemento de la lista no es una lista, lo agregamos a la lista resultante y continuamos con el resto de la lista.
aplanar([X|Resto], [X|RestoAplanado]) :-
    \+ is_list(X),  % Verifica si X no es una lista.
    aplanar(Resto, RestoAplanado).

% Ejemplos
% aplanar([a, [b, [c, d]], [e, [f, [g]]]], L2).             Resultado    L2 = [a, b, c, d, e, f, g].

% aplanar([[[1, 2], [3, 4]], [5, 6], [7, 8]], L2).          Resultado    L2 = [1, 2, 3, 4, 5, 6, 7, 8].

% aplanar([1, [2, 3, [4, 5]], [6, [7, 8]]], L2).            Resultado    L2 = [1, 2, 3, 4, 5, 6, 7, 8].
