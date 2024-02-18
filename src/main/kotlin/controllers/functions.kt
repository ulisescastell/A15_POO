package controllers

import GREEN
import RESET
import models.CompteBancari
import models.CompteCorrent
import models.CompteEstalvi
import readFloat
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

fun comprovarCoincidencia (compteBancariList: MutableList<CompteBancari>, nomCompte: Int): Boolean {
    for (compte in compteBancariList) {
        if (compte.getNomCompte() == nomCompte) {
            println("El nom del compte ja existeix, tria'n un altre")
            return false
        }
    }
    return true
}
fun crearCompteCorrent (compteBancariList: MutableList<CompteBancari>) {
    val nomCompte = readInt("Quin nom vols donarli al compte corrent?", "505 Error" )
    if (comprovarCoincidencia(compteBancariList, nomCompte)) {
        compteBancariList.add(CompteCorrent(Date(), nomCompte, saldo = 0.0, 20.0))
        println("Felicitats, el teu compte corrent amb nom $GREEN$nomCompte$RESET s'ha creat satisfactoriament.")
        println("El teu comtpe actual: ${compteBancariList.last()}")
    }
}
fun crearCompteEstalvi (compteBancariList: MutableList<CompteBancari>) {
    val nomCompte = readInt("Quin nom vols donarli al compte estalvi?", "505 Error" )
    if (comprovarCoincidencia(compteBancariList, nomCompte)) {
        compteBancariList.add(CompteEstalvi(Date(), nomCompte, saldo = 0.0, 0.04))
        println("Felicitats, el teu compte estalvi amb nom $GREEN$nomCompte$RESET s'ha creat satisfactoriament.")
        println("El teu comtpe actual: ${compteBancariList.last()}")
    }
}

fun cercarCompte (compteBancariList: MutableList<CompteBancari>){
    val cercaCompte = readInt("Introdueix el nombre del compte corrent al qual vols fer l'operació:", "505 ERROR")
    if (compteBancariList.isEmpty()) {
        println("No es pot fer la cerca ja que el teu compte no existeix en el sistema.")
    } else {
        for (compte in compteBancariList) {
            if (compte.getNomCompte() == cercaCompte) {
                println("Compte ${compte.getNomCompte()}:" +
                        "\n${compte.toString()}")
                return
            }
        }
        println("El compte introduït no existeix")
    }
}

fun ingressarDoblers(compteBancariList: MutableList<CompteBancari>) {
    cercarCompte(compteBancariList)




}


