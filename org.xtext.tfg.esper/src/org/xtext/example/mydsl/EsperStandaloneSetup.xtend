/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class EsperStandaloneSetup extends EsperStandaloneSetupGenerated {

	def static void doSetup() {
		new EsperStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
