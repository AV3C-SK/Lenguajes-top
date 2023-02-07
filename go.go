package main

import (
    "fmt"
)

func main() {
    var name string
    fmt.Print("Please enter your name: ")
    fmt.Scanf("%s", &name)
    fmt.Printf("Hello, %s!\n", name)
}