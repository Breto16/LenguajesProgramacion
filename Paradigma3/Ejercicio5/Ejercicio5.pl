:- discontiguous sub_cadenas/3.
% Caso base: si la lista est� vac�a, la lista filtrada tambi�n est� vac�a.
sub_cadenas(_, [], []).

% Verifica si una cadena contiene una subcadena.
contiene_subcadena(Cadena, Subcadena) :-
    sub_string(Cadena, _, _, _, Subcadena).

% Si la cadena contiene la subcadena, se agrega a la lista filtrada.
sub_cadenas(Subcadena, [Cadena|Resto], [Cadena|Filtradas]) :-
    contiene_subcadena(Cadena, Subcadena),
    sub_cadenas(Subcadena, Resto, Filtradas).

% Si la cadena no contiene la subcadena, se omite y se contin�a con el resto de la lista.
sub_cadenas(Subcadena, [_|Resto], Filtradas) :-
    sub_cadenas(Subcadena, Resto, Filtradas).

% Ejemplos
% sub_cadenas("los", ["los ni�os juegan", "en el parque", "los p�jaros cantan"], Filtradas).       Filtradas = ["los ni�os juegan", "los p�jaros cantan"].

% sub_cadenas("la", ["la casa", "el perro", "pintando la cerca"], Filtradas).                      Filtradas = ["la casa", "pintando la cerca"].
