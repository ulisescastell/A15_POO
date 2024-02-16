package models

import java.util.Date

class CompteCorrent: CompteBancari {
    private var comisioManteniment: Double = 0.0

    constructor() {}

    constructor(dataObertura: Date, nomCompte: Int, saldo: Double, comisioManteniment: Double):super(dataObertura, nomCompte, saldo) {
        this.comisioManteniment = comisioManteniment
    }
}