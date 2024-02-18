package models

import interfaces.Liquidacio
import readFloat
import java.util.Date

abstract class CompteBancari {
    private var dataObertura:Date = Date()
    private var nomCompte: Int = 0
    private var saldo: Double = 0.0

    constructor() {}

    constructor(dataObertura: Date, nomCompte: Int, saldo: Double) {
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

    fun getSaldo (): Double {
        return this.saldo
    }

    fun setDataObertura(dataObertura: Date) {
        this.dataObertura = dataObertura
    }

    fun setNomCompte (nomCompte: Int) {
        this.nomCompte = nomCompte
    }

    fun setSaldo (saldo: Double) {
        this.saldo = saldo
    }
    fun ingressar() {
        val saldoExtra = readFloat("Introdueix la quantitat de doblers a introduïr:", "505 ERROR")
        this.saldo += saldoExtra
    }

    fun consultarSaldo() {
        getSaldo()
    }

    override fun toString(): String {
        return "\nData obertura: ${this.dataObertura}\nNom Compte: ${this.nomCompte}\nSaldo: ${this.saldo}€"
    }
}