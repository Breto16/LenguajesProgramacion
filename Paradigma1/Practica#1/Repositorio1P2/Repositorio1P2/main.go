package main

import (
	"fmt"
	"strings"
)

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
func IniciarF2() {
	entrada := 0
	for entrada%2 == 0 {
		fmt.Print("Ingrese un número para la funcion 2, debe ser siempre impar: ")
		fmt.Scan(&entrada)
	}
	2
	cantidad := (entrada + 1) / 2
	Funcion2(cantidad)
}
func Funcion2(entrada int) {

	tamano := entrada

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
func rotar(lista []interface{}, nRotaciones int, direccion int) {
	largo := len(lista)

	if largo == 0 {
		return
	}

	nRotaciones = nRotaciones % largo

	if direccion == 0 { // Rotación a la izquierda
		copy(lista, append(lista[nRotaciones:], lista[:nRotaciones]...))
	} else if direccion == 1 { // Rotación a la derecha
		copy(lista, append(lista[largo-nRotaciones:], lista[:largo-nRotaciones]...))
	}
}
type calzado struct {
	modelo string
	precio float64
	talla  int
	stock  int
}

var inventario []calzado

func agregarZapato(modelo string, precio float64, talla int, stock int) {
	zapato := calzado{modelo, precio, talla, stock}
	inventario = append(inventario, zapato)
}

func venderZapato(modelo string, talla int) {
	for i, zapato := range inventario {
		if zapato.modelo == modelo && zapato.talla == talla {
			if zapato.stock > 0 {
				inventario[i].stock--
				fmt.Printf("Venta realizada: Zapato %s talla %d vendido\n", modelo, talla)
				return
			} else {
				fmt.Printf("No hay stock disponible para el zapato %s talla %d\n", modelo, talla)
				return
			}
		}
	}
	fmt.Printf("El zapato %s talla %d no se encuentra en el inventario\n", modelo, talla)
}
func main() {

	texto := "Este es un ejemplo de texto\ncon varias líneas\npara contar."
	fmt.Print(texto)
	fmt.Println()
	Funcion1(texto)
	IniciarF2()

	listaInicio := []interface{}{"a", "b", "c", "d", "e", "f", "g", "h"}
	fmt.Println("Secuencia Original =", listaInicio)
	nRotaciones := 4
	direccion := 0 // 0 para izquierda, 1 para derecha
	listaFinal := make([]interface{}, len(listaInicio))
	copy(listaFinal, listaInicio)
	rotar(listaFinal, nRotaciones, direccion)
	fmt.Println("Secuencia final rotada =", listaFinal)

	//Ejercicio Zapatos
	agregarZapato("Nike", 50000, 42, 5)
	agregarZapato("Adidas", 60000, 40, 3)
	agregarZapato("Puma", 45000, 38, 7)

	// Realizar ventas de zapatos
	venderZapato("Nike", 42)
	venderZapato("Adidas", 40)
	venderZapato("Puma", 38)
	venderZapato("Nike", 42)
	venderZapato("Nike", 42)
	venderZapato("Puma", 38)
	venderZapato("Reebok", 39) // Zapato no existente en inventario
	venderZapato("Adidas", 40) // Agotado el stock de Adidas talla 40

	// Imprimir inventario restante
	fmt.Println("\nInventario restante:")
	for _, zapato := range inventario {
		fmt.Printf("Modelo: %s, Talla: %d, Stock: %d\n", zapato.modelo, zapato.talla, zapato.stock)
	}
}
