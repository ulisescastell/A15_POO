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

    val compteCorrentList: MutableList<CompteCorrent> = mutableListOf()
    val compteEstalviList: MutableList<CompteEstalvi> = mutableListOf()

    do {
        menu()
        val userOption: Int = readInt("Introdueix l'opció: ", "505 ERROR", "505 ERROR", 1, 7)
        when (userOption) {
            1 -> crearCompteCorrent(compteCorrentList)
            2 -> crearCompteEstalvi(compteEstalviList)
            3 -> triarCercaCompte(compteEstalviList, compteCorrentList)
        }
    } while (userOption != 7)
}