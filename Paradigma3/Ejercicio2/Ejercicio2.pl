:- discontiguous subconj/2.

% Caso base: una lista vac�a es subconjunto de cualquier lista.
subconj([], _).

% Verifica si un elemento X est� en la lista.
pertenece(X, [X|_]).
pertenece(X, [_|Resto]) :- pertenece(X, Resto).

% Verifica si todos los elementos de S1 est�n en S.
subconj([X|S1], S) :- pertenece(X, S), subconj(S1, S).

% Ejemplos
% subconj([1, 2], [1, 2, 3, 4]). True
% subconj([5, 6], [1, 2, 3, 4]). False