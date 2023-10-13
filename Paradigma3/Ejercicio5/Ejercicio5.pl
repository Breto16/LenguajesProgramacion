:- discontiguous sub_cadenas/3.
% Caso base: si la lista está vacía, la lista filtrada también está vacía.
sub_cadenas(_, [], []).

% Verifica si una cadena contiene una subcadena.
contiene_subcadena(Cadena, Subcadena) :-
    sub_string(Cadena, _, _, _, Subcadena).

% Si la cadena contiene la subcadena, se agrega a la lista filtrada.
sub_cadenas(Subcadena, [Cadena|Resto], [Cadena|Filtradas]) :-
    contiene_subcadena(Cadena, Subcadena),
    sub_cadenas(Subcadena, Resto, Filtradas).

% Si la cadena no contiene la subcadena, se omite y se continúa con el resto de la lista.
sub_cadenas(Subcadena, [_|Resto], Filtradas) :-
    sub_cadenas(Subcadena, Resto, Filtradas).

% Ejemplos
% sub_cadenas("los", ["los niños juegan", "en el parque", "los pájaros cantan"], Filtradas).       Filtradas = ["los niños juegan", "los pájaros cantan"].

% sub_cadenas("la", ["la casa", "el perro", "pintando la cerca"], Filtradas).                      Filtradas = ["la casa", "pintando la cerca"].
