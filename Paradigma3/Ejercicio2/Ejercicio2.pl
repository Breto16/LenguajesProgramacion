:- discontiguous subconj/2.

% Caso base: una lista vacía es subconjunto de cualquier lista.
subconj([], _).

% Verifica si un elemento X está en la lista.
pertenece(X, [X|_]).
pertenece(X, [_|Resto]) :- pertenece(X, Resto).

% Verifica si todos los elementos de S1 están en S.
subconj([X|S1], S) :- pertenece(X, S), subconj(S1, S).

% Ejemplos
% subconj([1, 2], [1, 2, 3, 4]). True
% subconj([5, 6], [1, 2, 3, 4]). False