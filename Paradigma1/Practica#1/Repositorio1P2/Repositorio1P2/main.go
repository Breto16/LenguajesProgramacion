package main

import (
	"fmt"
	"strings"
)

func Funcion2() {
	/*largo := 5 //Cantidad de *
	extension := largo + largo - 1
	//inicial := 1
	for inicial := 0; inicial <= extension; inicial++ {
		if inicial%2 == 0 {
			//par
			fmt.Print("*")
		} else {
			//impar
			fmt.Print(" ")
		}
	}*/
	tamano := 3

	for i := 0; i < tamano*2-1; i++ {
		espacios := tamano - i - 1
		if espacios < 0 {
			espacios = -espacios
		}
		escribir := tamano*2 - 1 - espacios*2

		for j := 0; j < espacios; j++ {
			fmt.Print(" ")
		}

		for j := 0; j < escribir; j++ {
			fmt.Print("*")
		}

		fmt.Println()
	}

}
func abs(n int) int {
	if n < 0 {
		return -n
	}
	return n
}
func Funcion1(text string) {
	Caracteres := len(text)
	Palabras := strings.Fields(text)
	NPalabras := len(Palabras)
	Lineas := strings.Split(text, "\n")
	NLineas := len(Lineas)

	fmt.Printf("Número de caracteres: %d\n", Caracteres)
	fmt.Printf("Número de palabras: %d\n", NPalabras)
	fmt.Printf("Número de líneas: %d\n", NLineas)
}

func main() {

	text := "Este es un ejemplo de texto\ncon varias líneas\npara contar."
	Funcion1(text)

	Funcion2()
}
