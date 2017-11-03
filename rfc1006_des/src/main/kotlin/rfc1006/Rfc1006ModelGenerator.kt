package rfc1006

import ee.design.gen.go.DesignGoGenerator
import ee.design.gen.kt.DesignKotlinGenerator
import ee.lang.integ.dPath

fun main(args: Array<String>) {
    generateGo()
}

fun generateGo() {
    var generator = DesignGoGenerator(Rfc1006)
    generator.generate(dPath)
}

