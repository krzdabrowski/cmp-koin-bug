package eu.krzdabrowski.cmpkoinbug.umbrellaios

import org.koin.core.context.startKoin
import org.koin.ksp.generated.module
import eu.krzdabrowski.cmpkoinbug.basicfeaturea.BasicFeatureAModule as basicFeatureAModule
import eu.krzdabrowski.cmpkoinbug.basicfeatureb.BasicFeatureBModule as basicFeatureBModule

private val featureModules = listOf(
    basicFeatureAModule.module,
    basicFeatureBModule.module
)

fun initKoin() {
    startKoin {
        modules(featureModules)
    }
}
