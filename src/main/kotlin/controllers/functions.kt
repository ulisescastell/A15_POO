package controllers

import GREEN
import RESET
import models.CompteCorrent
import models.CompteEstalvi
import readInt
import readSentence
import java.util.Date

fun menu () {
    println()
    println("------------------------" +
            "\nMenú banc\n" +
            "1. Crear un compte corrent\n" +
            "2. Crear un compte estalvi\n" +
            "3. Ingressar (penseu que hi ha dos tipus de comptes)\n" +
            "4. Consultar saldo\n" +
            "5. Retirar diners d’un compte corrent\n" +
            "6. Liquidar un compte estalvi\n" +
            "7. Sortir del menú\n")
}
fun crearCompteCorrent (compteCorrentList: MutableList<CompteCorrent>) {
    val nomCompte = readInt("Quin nom vols donarli al compte corrent?", "505 Error" )
    compteCorrentList.add(CompteCorrent(Date(), nomCompte, saldo = 0.0, 20.0))
    println("Felicitats, el teu compte corrent amb nom $GREEN$nomCompte$RESET s'ha creat satisfactoriament.")
    println("El teu comtpe actual: ${compteCorrentList.last()}")
}

fun crearCompteEstalvi (compteEstalviList: MutableList<CompteEstalvi>) {
    val nomCompte = readInt("Quin nom vols donarli al compte estalvi?", "505 Error" )
    compteEstalviList.add(CompteEstalvi(Date(), nomCompte, saldo = 0.0, 0.04))
    println("Felicitats, el teu compte estalvi amb nom $GREEN$nomCompte$RESET s'ha creat satisfactoriament.")
    println("El teu comtpe actual: ${compteEstalviList.last()}")
}

fun cercarCompteCorrent (compteCorrentList: MutableList<CompteCorrent>) {
    val cercaCompte = readInt("Introdueix el nombre del compte corrent al qual vols fer l'ingrés:", "505 ERROR")
    if (compteCorrentList.isEmpty()) {
        println("No es pot fer la cerca ja que el teu compte no existeix en el sistema.")
    } else {
        for (compte in compteCorrentList) {
            if (compte.getNomCompte() == cercaCompte) {
                println("Felicitats, si existeix")
            } else {
                println("El compte introduït no existeix")
            }
        }
    }
}

fun cercarCompteEstalvi(compteEstalviList: MutableList<CompteEstalvi>) {
    val cercaCompte = readInt("Introdueix el nombre del compte estalvi al qual vols fer l'ingrés:", "505 ERROR")
    if (compteEstalviList.isEmpty()) {
        println("No es pot fer la cerca ja que el teu compte no existeix en el sistema.")
    } else {
        for (compte in compteEstalviList) {
            if (compte.getNomCompte() == cercaCompte) {
                println("Felicitats, si existeix")
            } else {
                println("El compte introduït no existeix")
            }
        }
    }
}

fun triarCercaCompte (compteEstalviList: MutableList<CompteEstalvi>, compteCorrentList: MutableList<CompteCorrent>) {
    val userCercaCompte = readInt("Introdueix 1 si el teu compte és corrent o 2 si és d'estalvi: ", "505 ERROR", "505 ERROR", 1, 2)
    if (userCercaCompte == 1) {
        cercarCompteCorrent(compteCorrentList)
    } else {
        cercarCompteEstalvi(compteEstalviList)
    }
}

fun


