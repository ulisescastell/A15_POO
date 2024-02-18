package models

import PURPLE
import RESET
import interfaces.Liquidacio
import readFloat
import java.util.Date

class CompteCorrent: CompteBancari, Liquidacio {
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
        println("Tens ${getSaldo()} €")
        val retirDoblers = readFloat("Introdueix la quantitat de doblers a retirar:", "505 ERROR")
        this.getSaldo() - retirDoblers
        this.cobrarComisio()
        println("Et queden ${this.getSaldo()} €")
    }

    fun cobrarComisio (){
        if (getSaldo() < 0) {
            println("Tens doblers en negatiu així que se't cobrará una comisió de descobert")
            setSaldo(this.getSaldo()*1.1)
        }
    }

    override fun liquidar(): Double {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return super.toString() + "$PURPLE\nComisio Manteniment: ${this.comisioManteniment}%$RESET"
    }
}