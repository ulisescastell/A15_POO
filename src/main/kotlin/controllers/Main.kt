package org.example.controllers

import models.CompteBancari
import models.CompteCorrent
import models.CompteEstalvi
import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val cb1: CompteBancari = CompteBancari(Date(2004), 101, 2000.4)
    println(cb1)
    val cc1: CompteCorrent = CompteCorrent(Date(), 101, 2000.4, 2.0)
    println(cc1)
    val ce1: CompteEstalvi = CompteEstalvi(Date(), 101, 2000.4, 2.0)
    println(cc1)
}