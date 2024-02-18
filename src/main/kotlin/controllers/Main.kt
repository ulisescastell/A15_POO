package org.example.controllers

import controllers.*
import models.CompteBancari
import models.CompteCorrent
import models.CompteEstalvi
import readInt
import java.util.*


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val compteList: MutableList<CompteBancari> = mutableListOf()

    do {
        menu()
        val userOption: Int = readInt("Introdueix l'opció: ", "505 ERROR", "505 ERROR", 1, 7)
        when (userOption) {
            1 -> crearCompteCorrent(compteList)
            2 -> crearCompteEstalvi(compteList)
            3 -> ingressarDoblers(compteList)
        }
    } while (userOption != 7)
}