
open System.Text.RegularExpressions

let filtrarSubcadenas (subcadena: string) (lista: string list) =
    let patron = @"\b" + Regex.Escape(subcadena) + @"\b"
    lista |> List.filter (fun str -> Regex.IsMatch(str, patron))

// Ejemplo de uso
let subcadena = "la"
let listaDeCadenas = ["la casa"; "el perro"; "pintando la cerca"; "lampara"; "la panadería"; "manibela"]

let resultado = filtrarSubcadenas subcadena listaDeCadenas
printfn "%A" resultado
