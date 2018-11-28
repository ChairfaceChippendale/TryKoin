package com.ujujzk.trykoin.data

class SimpleGateImpl(val service: SimpleService) : SimpleGate {

    override fun getText() = service.retrieveText()
}