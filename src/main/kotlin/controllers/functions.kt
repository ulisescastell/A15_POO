package controllers

import CYAN
import GREEN
import PURPLE
import RESET
import YELLOW
import com.sun.source.doctree.CommentTree
import models.CompteBancari
import models.CompteCorrent
import models.CompteEstalvi
import readFloat
import readInt
import readSentence
import java.util.Date

fun menu () {
    println()
    println("$CYAN-----------Menú banc-----------\n" +
            "1. Crear un compte corrent\n" +
            "2. Crear un compte estalvi\n" +
            "3. Ingressar\n" +
            "4. Consultar saldo\n" +
            "5. Retirar diners d’un compte corrent\n" +
            "6. Liquidar un compte estalvi\n" +
            "7. Sortir del menú\n$RESET")
}

fun comprovarCoincidencia (compteBancariList: MutableList<CompteBancari>, nomCompte: Int): Boolean {
    for (compte in compteBancariList) {
        if (compte.getNomCompte() == nomCompte) {
            println("${YELLOW}El nom del compte ja existeix, tria'n un altre$RESET")
            return false
        }
    }
    return true
}

fun crearCompteCorrent (compteBancariList: MutableList<CompteBancari>) {
    val nomCompte = readInt("Quin nom vols donarli al compte corrent?", "505 Error" )
    if (comprovarCoincidencia(compteBancariList, nomCompte)) {
        compteBancariList.add(CompteCorrent(Date(), nomCompte, saldo = 0.0, comisioManteniment = 20.0))
        println("${GREEN}Felicitats, el teu compte corrent amb nom $nomCompte$RESET s'ha creat satisfactoriament.")
        println("El teu comtpe actual: $PURPLE${compteBancariList.last()}$RESET")
    }
}

fun crearCompteEstalvi (compteBancariList: MutableList<CompteBancari>) {
    val nomCompte = readInt("Quin nom vols donarli al compte estalvi?", "505 Error" )
    if (comprovarCoincidencia(compteBancariList, nomCompte)) {
        compteBancariList.add(CompteEstalvi(Date(), nomCompte, saldo = 0.0, 0.04))
        println("${GREEN}Felicitats, el teu compte estalvi amb nom $nomCompte$RESET s'ha creat satisfactoriament.")
        println("El teu comtpe actual: $PURPLE${compteBancariList.last()}$RESET")
    }
}

fun cercarCompte (compteBancariList: MutableList<CompteBancari>): CompteBancari?{
    val cercaCompte = readInt("Introdueix el nombre del compte corrent al qual vols fer l'operació:", "505 ERROR")
    if (compteBancariList.isEmpty()) {
        println("${YELLOW}No es pot fer la cerca ja que el teu compte no existeix en el sistema.$RESET")
    } else {
        for (compte in compteBancariList) {
            if (compte.getNomCompte() == cercaCompte) {
                println("Dades del compte:$PURPLE$compte$RESET")
                return compte
            }
        }
        println("${YELLOW}El compte introduït no existeix$RESET")
    }
    return null
}

fun ingressarDoblers(compteBancariList: MutableList<CompteBancari>) {
    val compteIngres = cercarCompte(compteBancariList)
    if (compteIngres != null) {
        val ingresUser = readFloat("Introdueix l'import a ingressar:", "505 ERROR").toDouble()
        compteIngres.setSaldo(ingresUser)
        println(compteIngres)
    } else {
        println("${YELLOW}No es pot fer l'ingrés$RESET")
    }
}

fun consultarSaldo(compteBancariList: MutableList<CompteBancari>) {
    val consultarSaldo = cercarCompte(compteBancariList)
    if (consultarSaldo != null) {
        println("----------------")
        println("${GREEN}Tens ${consultarSaldo.getSaldo()}€$RESET")
    } else {
        println("${YELLOW}No es pot fer la consulta$RESET")
    }
}

fun retirarDiners(compteBancariList: MutableList<CompteBancari>) {
    val quantitatARetirar = cercarCompte(compteBancariList)
    if (quantitatARetirar != null) {
        println("${GREEN}Tens ${quantitatARetirar}€$RESET")
    } else {
        println("${YELLOW}No es pot fer el retir del doblers$RESET")
    }
}


