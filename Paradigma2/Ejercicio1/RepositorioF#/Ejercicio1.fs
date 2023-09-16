
let DesplazaLista dir n lista =
    let length = List.length lista

    match dir with
    | "izq" ->
        if n >= length then
            List.replicate length 0
        else
            List.init length (fun i ->
                if i + n < length then
                    List.nth lista (i + n)
                else
                    0)
    | "der" ->
        if n >= length then
            List.replicate length 0
        else
            List.init length (fun i ->
                if i >= n then
                    List.nth lista (i - n)
                else
                    0)

// Ejemplo 1: Desplazar hacia la izquierda
let listaInicio = [1; 2; 3; 4; 5]
let resultado1 = DesplazaLista "izq" 3 listaInicio
printfn "Resultado 1: %A" resultado1

// Ejemplo 2: Desplazar hacia la derecha
let resultado2 = DesplazaLista "der" 2 listaInicio
printfn "Resultado 2: %A" resultado2

// Ejemplo 3: Desplazar más allá de la longitud de la lista
let resultado3 = DesplazaLista "izq" 6 listaInicio
printfn "Resultado 3: %A" resultado3