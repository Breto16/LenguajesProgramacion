persona('Persona3', [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]).
persona('Persona4', [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]).
persona('Persona5', [3, 6, 9, 12, 15, 18, 21, 24, 27, 30]).

coincidencia([], _, 0).
coincidencia([H|T], Lista, Count) :-
    member(H, Lista),
    coincidencia(T, Lista, TempCount),
    Count is TempCount + 1.
coincidencia([H|T], Lista, Count) :-
    \+ member(H, Lista),
    coincidencia(T, Lista, Count).

mayor_exactitud(Nombre, Cromosoma) :-
    persona(Nombre, ListaCromosoma),
    coincidencia(ListaCromosoma, Cromosoma, CountPersona),
    length(Cromosoma, LengthCromosoma),
    CountPersona =:= LengthCromosoma.
