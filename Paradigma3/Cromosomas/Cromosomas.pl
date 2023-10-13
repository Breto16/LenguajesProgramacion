% Predicado que calcula el porcentaje de exactitud entre dos cromosomas.
porcentaje_exactitud([], [], 100).
porcentaje_exactitud([X|Sujeto], [X|Candidato], Porcentaje) :-
    porcentaje_exactitud(Sujeto, Candidato, PorcentajeRestante),
    Porcentaje is PorcentajeRestante + 10.
porcentaje_exactitud([_|Sujeto], [_|Candidato], Porcentaje) :-
    porcentaje_exactitud(Sujeto, Candidato, Porcentaje).

% Base de Datos de Personas (nombre, cromosoma).
persona('Persona1', [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]).
persona('Persona2', [1, 2, 3, 4, 5, 11, 7, 8, 9, 10]).
persona('Persona3', [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]).
persona('Persona4', [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]).
persona('Persona5', [3, 6, 9, 12, 15, 18, 21, 24, 27, 30]).
persona('Persona6', [4, 8, 12, 16, 20, 24, 28, 32, 36, 40]).
persona('Persona7', [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]).
persona('Persona8', [6, 12, 18, 24, 30, 36, 42, 48, 54, 60]).
persona('Persona9', [7, 14, 21, 28, 35, 42, 49, 56, 63, 70]).
persona('Persona10', [8, 16, 24, 32, 40, 48, 56, 64, 72, 80]).

% Predicado para verificar si la persona tiene la mayor exactitud.
mayor_exactitud(Persona, Cromosoma) :- 
    persona(Persona, CromosomaPersona),
    porcentaje_exactitud(CromosomaPersona, Cromosoma, Porcentaje),
    forall((persona(OtraPersona, OtroCromosoma), OtraPersona \= Persona),
           (porcentaje_exactitud(OtroCromosoma, Cromosoma, OtroPorcentaje),
            Porcentaje >= OtroPorcentaje)).

% Consulta de ejemplo.
% ¿'Persona3' tiene el cromosoma más similar a [3, 6, 9, 12, 15, 18, 21, 24, 27, 30]?
?- mayor_exactitud('Persona3', [3, 6, 9, 12, 15, 18, 21, 24, 27, 30]).
