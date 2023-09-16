

let n_esimo n lista =
    let indices = [0..(List.length lista - 1)]
    match List.tryFind (fun (_, i) -> i = n) (List.zip lista indices) with
    | Some (x, _) -> x
    | None -> -50000

let indices = [2; 3; 6]
let lista = [1; 2; 3; 4; 5]

let resultados = List.map (fun n -> n_esimo n lista) indices



//Lista de resultados no puede tener int y bool por lo que 
//si es -50000 significa que el indice se pasó de la lista 
//o es equivalente al False del ejemplo que dio el profesor en el documento
printfn "%A" resultados // Debería imprimir [3; 4; -50000]
