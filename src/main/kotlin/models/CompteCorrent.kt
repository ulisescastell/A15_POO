package models

import interfaces.Liquidacio
import java.util.Date

class CompteCorrent: CompteBancari {
    private var comisioManteniment: Double = 0.0

    constructor() {}

    constructor(dataObertura: Date, nomCompte: Int, saldo: Double, comisioManteniment: Double):super(dataObertura, nomCompte, saldo) {
        this.comisioManteniment = comisioManteniment
    }

    fun getComisioManteniment ():Double {
        return this.comisioManteniment
    }

    fun setComisioManteniment (comisioManteniment: Double){
        this.comisioManteniment = comisioManteniment
    }

    fun retirar() {

    }

    fun cobrarComisio (){

    }

    override fun liquidar(): Double {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return super.toString() + "\nComisio Manteniment = ${this.comisioManteniment}"
    }
}