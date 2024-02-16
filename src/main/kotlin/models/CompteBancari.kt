package models

import java.util.Date

class CompteBancari {
    private var dataObertura:Date = Date()
    private var nomCompte: Int = 0
    private var saldo: Int = 0

    constructor() {}

    constructor(dataObertura: Date, nomCompte: Int, saldo: Int) {
        this.dataObertura = dataObertura
        this.nomCompte = nomCompte
        this. saldo = saldo
    }

    fun getDataObertura(): Date {
        return this.dataObertura
    }

    fun getNomCompte (): Int {
        return this.nomCompte
    }

    fun getSaldo (): Int {
        return this.saldo
    }

    fun setDataObertura(dataObertura: Date) {
        this.dataObertura = dataObertura
    }

    fun setNomCompte (nomCompte: Int) {
        this.nomCompte = nomCompte
    }

    fun setSaldo (saldo: Int) {
        this.saldo = saldo
    }
    fun ingressar() {

    }

    fun consultarSaldo() {

    }

    override fun toString(): String {
        return "Data obertura: ${this.dataObertura}\n Nom Compte: ${this.nomCompte}\n" +
                "  Saldo: ${this.saldo}"
    }
}