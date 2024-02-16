package org.example.controllers

import controllers.crearCompteCorrent
import controllers.crearCompteEstalvi
import models.CompteBancari
import models.CompteCorrent
import models.CompteEstalvi
import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val compteCorrentList: MutableList<CompteCorrent> = mutableListOf()
    val compteEstalviList: MutableList<CompteEstalvi> = mutableListOf()

    println(crearCompteCorrent(compteCorrentList))
    println(crearCompteEstalvi(compteEstalviList))
}