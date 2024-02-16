package models

import interfaces.Liquidacio
import java.util.Date

class CompteEstalvi: CompteBancari {
    private var interes: Double = 0.0

    constructor() {}

    constructor(dataObertura: Date, nomCompte: Int, saldo: Double, interes: Double):super(dataObertura, nomCompte, saldo) {
        this.interes = interes
    }

    fun getInteres (): Double {
        return this.interes
    }

    fun setInteres(interes: Double) {
        this.interes = interes
    }

    override fun liquidar (): Double {
        return this.interes
    }

    override fun toString(): String {
        return super.toString() + "\nInteres: ${this.interes}"
    }

}