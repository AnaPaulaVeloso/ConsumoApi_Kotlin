package br.edu.fatecpg

import com.google.gson.Gson
import java.util.Scanner

fun main() {

    val sc = Scanner(System.`in`)

    print("Entre com um cep : ")
    var cep = sc.nextLine()

    val consumo = Consumo()
    val gson = Gson()
    
    val json = consumo.buscaEndereco(cep)
    println(json)
    val enderecoFatecPg= gson.fromJson(json, Endereco::class.java)
    println(enderecoFatecPg)
    println(consumo)

}