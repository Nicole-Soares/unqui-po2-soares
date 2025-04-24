!classDefinition: #TestEmpresa category: #'Empresa-Ejercicio1'!
TestCase subclass: #TestEmpresa
	instanceVariableNames: ''
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Empresa-Ejercicio1'!

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 18:09:33'!
test001_crearEmpresa

	| kfc |
	kfc:= Empresa conNombre: 'kfc' conCuit: 27413536087.
	
	Assert that: kfc nombreDeLaEmpresa isEqualTo: 'kfc'.! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 19:19:54'!
test002_crearEmpleadoPermanente
	
	| daemon |

	daemon:= EmpleadoPermanente conNombre: 'Daemon' conDireccion: 'peru 319' estadoCivil: 'casado' sueldoBasico: (5000 * peso) fechaDeNacimiento: (Date year: 1988 month: 6 day: 18) cantDeHijos: 5 antiguedad: 5.
	
	
	Assert that: daemon edad isEqualTo: 35.! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 18:46:12'!
test003_crearEmpleadoTemporario


	| rhaenyra |
	
	rhaenyra:= EmpleadoTemporario conNombre: 'Rhaenyra' conDireccion: 'peru 319' estadoCivil:'casada' sueldoBasico: (3000 * peso) fechaDeNacimiento: 20/06/1998 fechaDeFin: 26/03/2025 cantHorasExtras: 2.
	
	Assert that: rhaenyra direccionEmpleado isEqualTo: 'peru 319'.

	! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/27/2025 14:04:31'!
test004_empleadoPermanenteIngresaALaEmpresa


	|daemon kfc |
	
	kfc:= Empresa conNombre: 'kfc' conCuit: 27413536087.
	
	daemon:= EmpleadoPermanente conNombre: 'Daemon' conDireccion: 'peru 319' estadoCivil: 'casado' sueldoBasico: (5000 * peso) fechaDeNacimiento: (Date year: 1988 month: 6 day: 18) cantDeHijos: 5 antiguedad: 5.
	
	kfc setListaDeEmpleados: daemon.
	
	Assert that: kfc cantidadDeEmpleados isEqualTo: 1.! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/27/2025 16:00:42'!
test005_empleadoPermanenteSueldoBruto


	|daemon kfc casado |
	
	casado:= Casado new.
	kfc:= Empresa conNombre: 'kfc' conCuit: 27413536087.
	
	daemon:= EmpleadoPermanente conNombre: 'Daemon' conDireccion: 'peru 319' estadoCivil: casado sueldoBasico: (5000 * peso) fechaDeNacimiento: (Date year: 1988 month: 6 day: 18) cantDeHijos: 5 antiguedad: 5.
	
	kfc setListaDeEmpleados: daemon.
	
	Assert that: daemon sueldoBruto isEqualTo: 6000 * peso.! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 11:01:57'!
test006_empleadoTemporalSueldoBruto


	|kfc casado rhaenyra |
	
	casado:= Casado new.
	kfc:= Empresa conNombre: 'kfc' conCuit: 27413536087.
	
	rhaenyra:= EmpleadoTemporario conNombre: 'Rhaenyra' conDireccion: 'peru 319' estadoCivil: casado sueldoBasico: (3000 * peso) fechaDeNacimiento: June /06/1998 fechaDeFin: 26/03/2025 cantHorasExtras: 2.
	
	kfc setListaDeEmpleados: rhaenyra.
	
	Assert that: rhaenyra sueldoBruto isEqualTo: 3080 * peso.! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 11:32:05'!
test007_empleadoPermanenteRetenciones


	|kfc casado daemon |
	
	casado:= Casado new.
	kfc:= Empresa conNombre: 'kfc' conCuit: 27413536087.
	
	daemon:= EmpleadoPermanente conNombre: 'Daemon' conDireccion: 'peru 319' estadoCivil: casado sueldoBasico: (5000 * peso) fechaDeNacimiento: June /18/1998 cantDeHijos: 5 antiguedad: 5.
	
	kfc setListaDeEmpleados: daemon.
	
	Assert that: daemon retenciones isEqualTo: 2275 * peso.! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 11:26:30'!
test008_empleadoTemporalRetenciones

	|kfc casado  rhaenyra |
	
	casado:= Casado new.
	kfc:= Empresa conNombre: 'kfc' conCuit: 27413536087.
	
	rhaenyra:= EmpleadoTemporario conNombre: 'Rhaenyra' conDireccion: 'peru 319' estadoCivil: casado sueldoBasico: (3000 * peso) fechaDeNacimiento: June /06/1998 fechaDeFin: 26/03/2025 cantHorasExtras: 2.
	
	kfc setListaDeEmpleados: rhaenyra.
	
	Assert that: rhaenyra retenciones isEqualTo: 626 * peso.! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 11:51:30'!
test009_empleadoTemporalDescuentoObraSocial


	|kfc casado rhaenyra |
	
	casado:= Casado new.
	kfc:= Empresa conNombre: 'kfc' conCuit: 27413536087.
	
	rhaenyra:= EmpleadoTemporario conNombre: 'Rhaenyra' conDireccion: 'peru 319' estadoCivil: casado sueldoBasico: (3000 * peso) fechaDeNacimiento: June /06/1998 fechaDeFin: 26/03/2025 cantHorasExtras: 2.
	
	kfc setListaDeEmpleados: rhaenyra.
	
	Assert that: rhaenyra descuentoPorObraSocial isEqualTo: 308 * peso.! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 11:52:31'!
test010_empleadoTemporalMontoPorEdad


	|kfc casado rhaenyra |
	
	casado:= Casado new.
	kfc:= Empresa conNombre: 'kfc' conCuit: 27413536087.
	
	rhaenyra:= EmpleadoTemporario conNombre: 'Rhaenyra' conDireccion: 'peru 319' estadoCivil: casado sueldoBasico: (3000 * peso) fechaDeNacimiento: June /06/1998 fechaDeFin: 26/03/2025 cantHorasExtras: 2.
	
	kfc setListaDeEmpleados: rhaenyra.
	
	Assert that: rhaenyra montoPorEdad isEqualTo: 0 * peso.! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 12:19:18'!
test011_empleadoTemporalEdad


	|kfc casado rhaenyra |
	
	casado:= Casado new.
	kfc:= Empresa conNombre: 'kfc' conCuit: 27413536087.
	
	rhaenyra:= EmpleadoTemporario conNombre: 'Rhaenyra' conDireccion: 'peru 319' estadoCivil: casado sueldoBasico: (3000 * peso) fechaDeNacimiento: June/06/1998 fechaDeFin: 26/03/2025 cantHorasExtras: 2.
	
	kfc setListaDeEmpleados: rhaenyra.
	
	Assert that: rhaenyra edad isEqualTo:  27! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 11:24:37'!
test012_empleadoDescuentoPorObraSocial

	|kfc casado rhaenyra |
	
	casado:= Casado new.
	kfc:= Empresa conNombre: 'kfc' conCuit: 27413536087.
	
	rhaenyra:= EmpleadoTemporario conNombre: 'Rhaenyra' conDireccion: 'peru 319' estadoCivil: casado sueldoBasico: (3000 * peso) fechaDeNacimiento: June/06/1998 fechaDeFin: 26/03/2025 cantHorasExtras: 2.
	
	kfc setListaDeEmpleados: rhaenyra.
	
	Assert that: rhaenyra descuentoPorObraSocial isEqualTo: 308 * peso.! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 11:41:39'!
test013_empresaTotalSueldoNetos

	|kfc casado rhaenyra |
	
	casado:= Casado new.
	kfc:= Empresa conNombre: 'kfc' conCuit: 27413536087.
	
	rhaenyra:= EmpleadoTemporario conNombre: 'Rhaenyra' conDireccion: 'peru 319' estadoCivil: casado sueldoBasico: (3000 * peso) fechaDeNacimiento: June/06/1998 fechaDeFin: 26/03/2025 cantHorasExtras: 2.
	
	kfc setListaDeEmpleados: rhaenyra.
	
	Assert that: kfc totalDeSueldosNetos isEqualTo: 2454 * peso.! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 11:42:10'!
test014_empresaTotalSueldoBruto

	|kfc casado rhaenyra |
	
	casado:= Casado new.
	kfc:= Empresa conNombre: 'kfc' conCuit: 27413536087.
	
	rhaenyra:= EmpleadoTemporario conNombre: 'Rhaenyra' conDireccion: 'peru 319' estadoCivil: casado sueldoBasico: (3000 * peso) fechaDeNacimiento: June/06/1998 fechaDeFin: 26/03/2025 cantHorasExtras: 2.
	
	kfc setListaDeEmpleados: rhaenyra.
	
	Assert that: kfc totalDeSueldosBrutos isEqualTo: 3080 * peso.! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 11:42:50'!
test015_empresaTotalDeRetenciones

	|kfc casado rhaenyra |
	
	casado:= Casado new.
	kfc:= Empresa conNombre: 'kfc' conCuit: 27413536087.
	
	rhaenyra:= EmpleadoTemporario conNombre: 'Rhaenyra' conDireccion: 'peru 319' estadoCivil: casado sueldoBasico: (3000 * peso) fechaDeNacimiento: June/06/1998 fechaDeFin: 26/03/2025 cantHorasExtras: 2.
	
	kfc setListaDeEmpleados: rhaenyra.
	
	Assert that: kfc totalDeRetenciones isEqualTo: 626 * peso.! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 14:20:35'!
test016_empresaLiquidacionDeHaberes

	|kfc casado rhaenyra haberRhaenyra unHaber |
	
	casado:= Casado new.
	kfc:= Empresa conNombre: 'kfc' conCuit: 27413536087.
	
	rhaenyra:= EmpleadoTemporario conNombre: 'Rhaenyra' conDireccion: 'peru 319' estadoCivil: casado sueldoBasico: (3000 * peso) fechaDeNacimiento: June/06/1998 fechaDeFin: 26/03/2025 cantHorasExtras: 2.
	
	kfc setListaDeEmpleados: rhaenyra.
	kfc liquidarSueldos.
	
	haberRhaenyra := ReciboDeHaberes crearUnReciboDelEmpleado: rhaenyra.
	unHaber:={haberRhaenyra}asBag.
	
	Assert isTrue: (haberRhaenyra esIgualA: (kfc listaDeHaberes anyOne )).
	"Assert that: kfc listaDeHaberes first isEqualTo: unHaber first."! !

!TestEmpresa methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 14:41:03'!
test017_crearEmpleadoContratado
	
	| lucerys soltero |

	soltero:= EstadoCivil new.
	lucerys:= EmpleadoContratado  conNombre: 'Lucerys'  conDireccion: 'peru 319'   estadoCivil: soltero sueldoBasico: (5000 * peso)  fechaDeNacimiento: June/19/2000  numeroDeContrato: 2 medioDePago: 'cheque'.
	
	
	Assert that: lucerys edad isEqualTo: 25.! !


!classDefinition: #Concepto category: #'Empresa-Ejercicio1'!
Object subclass: #Concepto
	instanceVariableNames: 'nombreConcepto importeDelConcepto'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Empresa-Ejercicio1'!

!Concepto methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 20:45:34'!
importeDelConcepto

	^importeDelConcepto.! !

!Concepto methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 20:45:03'!
initializeConNombre: nombre conImporte: importe

	nombreConcepto:= nombre.
	importeDelConcepto:= importe.! !

!Concepto methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 20:45:18'!
nombreConcepto

	^nombreConcepto! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'Concepto class' category: #'Empresa-Ejercicio1'!
Concepto class
	instanceVariableNames: ''!

!Concepto class methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 20:44:38'!
conNombre:nombre conImporte: importe

	^ self new initializeConNombre: nombre conImporte: importe.! !


!classDefinition: #Empleado category: #'Empresa-Ejercicio1'!
Object subclass: #Empleado
	instanceVariableNames: 'nombreDelEmpleado direccionEmpleado estadoCivilDelEmpleado sueldoBasicoDelEmpleado fechaDeNacimientoDelEmpleado listaDeConceptos'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Empresa-Ejercicio1'!

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/27/2025 22:27:21'!
aportesJubilatorios

	self subclassResponsibility .! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 11:49:30'!
descuentoPorObraSocial

	^(((10 * peso) * self sueldoBruto) / (100 * peso )).! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 18:34:26'!
direccionEmpleado

	^direccionEmpleado.! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 18:31:01'!
edad
    "Retorna la diferencia de años (sin precisión de mes/día)"

	"Date today year"
    ^ (Date today yearNumber ) - (self fechaDeNacimientoDelEmpleado year number).! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 18:34:53'!
estadoCivilDelEmpleado

	^estadoCivilDelEmpleado.! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 18:35:34'!
fechaDeNacimientoDelEmpleado

	^fechaDeNacimientoDelEmpleado.! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 12:27:02'!
initializeconNombre: nombreEmpleado conDireccion: direccion estadoCivil: estadoCivil sueldoBasico: sueldo fechaDeNacimiento: fecha


	nombreDelEmpleado:= nombreEmpleado.
	direccionEmpleado:= direccion.
	estadoCivilDelEmpleado:= estadoCivil.
	sueldoBasicoDelEmpleado:=sueldo.
	fechaDeNacimientoDelEmpleado:= fecha.
	listaDeConceptos:= Set new.! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 20:32:47'!
listaDeConceptos

	^listaDeConceptos.! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 20:39:36'!
llenarListaDeConceptos

	self subclassResponsibility .! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 18:34:05'!
nombreDelEmpleado

	^nombreDelEmpleado.! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 11:08:12'!
obraSocial

	self subclassResponsibility .! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 11:22:42'!
retenciones

	^(self obraSocial + self aportesJubilatorios) .! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 12:25:47'!
setListaDeConceptos: concepto

	 self listaDeConceptos add:concepto.! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 18:35:16'!
sueldoBasicoDelEmpleado

	^sueldoBasicoDelEmpleado.
	! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 18:48:50'!
sueldoBruto

	self subclassResponsibility .! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 19:43:41'!
sueldoNeto

	^ self sueldoBruto - self retenciones.! !


!classDefinition: #EmpleadoContratado category: #'Empresa-Ejercicio1'!
Empleado subclass: #EmpleadoContratado
	instanceVariableNames: 'numeroDeContrato medioDePago'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Empresa-Ejercicio1'!

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 14:29:05'!
initializeconNombre: nombreEmpleado conDireccion: direccion estadoCivil: estadoCivil sueldoBasico: sueldo fechaDeNacimiento: fecha numeroDeContrato: numContrato medioDePago: medioPago

	self initializeconNombre: nombreEmpleado conDireccion: direccion estadoCivil: estadoCivil sueldoBasico: sueldo fechaDeNacimiento: fecha.
	numeroDeContrato:= numContrato.
	medioDePago:= medioPago.! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 16:31:01'!
llenarListaDeConceptos

	self setListaDeConceptos: (Concepto conNombre:'Obra Social' conImporte: (self obraSocial)). 
	self setListaDeConceptos: (Concepto conNombre:'Sueldo Basico' conImporte: (self sueldoBasicoDelEmpleado)). 
	self setListaDeConceptos: (Concepto conNombre:'Gastos Administrativos Contractuales' conImporte: (self retenciones )). 
	
	! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 14:29:38'!
medioDePago

	^medioDePago.! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 14:29:24'!
numeroDeContrato

	^numeroDeContrato.! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 16:28:26'!
obraSocial

	^0 * peso.! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 16:21:28'!
retenciones

	^ 50 * peso .! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 14:30:47'!
setMedioDePago: medio

	medioDePago:= medio.! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 14:30:19'!
setNumeroDeContrato: numero

	numeroDeContrato:= numero.! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 14:45:42'!
sueldoBruto

	^self sueldoBasicoDelEmpleado.! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'EmpleadoContratado class' category: #'Empresa-Ejercicio1'!
EmpleadoContratado class
	instanceVariableNames: ''!

!EmpleadoContratado class methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 14:39:12'!
conNombre: nombreEmpleado conDireccion: direccion estadoCivil: estadoCivil sueldoBasico: sueldo fechaDeNacimiento: fecha numeroDeContrato: numContrato medioDePago: medioPago

	^self new initializeconNombre: nombreEmpleado conDireccion: direccion  estadoCivil:  estadoCivil sueldoBasico:  sueldo fechaDeNacimiento:  fecha numeroDeContrato:  numContrato medioDePago: medioPago! !


!classDefinition: #EmpleadoPermanente category: #'Empresa-Ejercicio1'!
Empleado subclass: #EmpleadoPermanente
	instanceVariableNames: 'cantidadDeHijosDelEmpleado antiguedadDelEmpleado'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Empresa-Ejercicio1'!

!EmpleadoPermanente methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 18:40:37'!
antiguedadDelEmpleado

	^antiguedadDelEmpleado.! !

!EmpleadoPermanente methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 11:11:09'!
aportesJubilatorios

	^ ((15 * peso) * self sueldoBruto)  / (100 * peso ).! !

!EmpleadoPermanente methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 18:40:25'!
cantidadDeHijosDelEmpleado

	^cantidadDeHijosDelEmpleado.! !

!EmpleadoPermanente methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 19:33:03'!
initializeconNombre: nombreEmpleado conDireccion: direccion estadoCivil: estadoCivil sueldoBasico: sueldo fechaDeNacimiento: fecha cantDeHijos: cantHijos antiguedad: antiguedad

	self initializeconNombre: nombreEmpleado conDireccion: direccion estadoCivil: estadoCivil sueldoBasico: sueldo fechaDeNacimiento: fecha.
	cantidadDeHijosDelEmpleado:= cantHijos.
	antiguedadDelEmpleado:= antiguedad.! !

!EmpleadoPermanente methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 20:49:28'!
llenarListaDeConceptos

	self setListaDeConceptos: (Concepto conNombre:'Obra Social' conImporte: (self obraSocial)). 
	self setListaDeConceptos: (Concepto conNombre:'Sueldo Basico' conImporte: (self sueldoBasicoDelEmpleado)). 
	self setListaDeConceptos: (Concepto conNombre:'Salario Familiar' conImporte: (self salarioFamiliar)).! !

!EmpleadoPermanente methodsFor: 'as yet unclassified' stamp: 'ns 3/27/2025 18:18:43'!
montoPorAntiguedad

	^(50 * self antiguedadDelEmpleado) * peso.! !

!EmpleadoPermanente methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 11:04:10'!
montoPorEstadoCivil

	^(self estadoCivilDelEmpleado monto).! !

!EmpleadoPermanente methodsFor: 'as yet unclassified' stamp: 'ns 3/27/2025 18:17:39'!
montoPorHijo

	^ (150 * self cantidadDeHijosDelEmpleado )* peso.! !

!EmpleadoPermanente methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 11:09:15'!
obraSocial


	^ (self descuentoPorObraSocial + self montoPorHijo) .
	! !

!EmpleadoPermanente methodsFor: 'as yet unclassified' stamp: 'ns 3/27/2025 18:20:04'!
salarioFamiliar

	^(self montoPorHijo + self montoPorAntiguedad + self montoPorEstadoCivil ).! !

!EmpleadoPermanente methodsFor: 'as yet unclassified' stamp: 'ns 3/27/2025 17:58:10'!
sueldoBruto

	^((self sueldoBasicoDelEmpleado) + (self salarioFamiliar))! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'EmpleadoPermanente class' category: #'Empresa-Ejercicio1'!
EmpleadoPermanente class
	instanceVariableNames: ''!

!EmpleadoPermanente class methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 18:41:49'!
conNombre: nombreEmpleado conDireccion: direccion estadoCivil: estadoCivil sueldoBasico: sueldo fechaDeNacimiento: fecha cantDeHijos: cantHijos antiguedad: antiguedad

	
	^self new initializeconNombre: nombreEmpleado conDireccion: direccion estadoCivil: estadoCivil sueldoBasico: sueldo fechaDeNacimiento: fecha cantDeHijos: cantHijos antiguedad: antiguedad! !


!classDefinition: #EmpleadoTemporario category: #'Empresa-Ejercicio1'!
Empleado subclass: #EmpleadoTemporario
	instanceVariableNames: 'cantHorasExtrasDelEmpleado fechaDeFinDelEmpleado'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Empresa-Ejercicio1'!

!EmpleadoTemporario methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 11:25:53'!
aportesJubilatorios

"10% de su sueldo bruto + $5 por cada hora extra"

	^((10 * peso )* self sueldoBruto / (100 * peso)) + ((5 * self cantHorasExtrasDelEmpleado) * peso)! !

!EmpleadoTemporario methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 18:40:50'!
cantHorasExtrasDelEmpleado

	^cantHorasExtrasDelEmpleado.! !

!EmpleadoTemporario methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 18:41:01'!
fechaDeFinDelEmpleado

	^fechaDeFinDelEmpleado.! !

!EmpleadoTemporario methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 12:34:34'!
initializeconNombre: nombreEmpleado conDireccion: direccion estadoCivil: estadoCivil sueldoBasico: sueldo fechaDeNacimiento: fecha fechaDeFin: fechaFin cantHorasExtras: cantidad

	self initializeconNombre: nombreEmpleado conDireccion: direccion estadoCivil: estadoCivil sueldoBasico: sueldo fechaDeNacimiento: fecha.
	cantHorasExtrasDelEmpleado:= cantidad.
	fechaDeFinDelEmpleado:= fechaFin.! !

!EmpleadoTemporario methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 20:50:38'!
llenarListaDeConceptos

	self setListaDeConceptos: (Concepto conNombre:'Obra Social' conImporte: (self obraSocial)). 
	self setListaDeConceptos: (Concepto conNombre:'Sueldo Basico' conImporte: (self sueldoBasicoDelEmpleado)). 
	self setListaDeConceptos: (Concepto conNombre:'Horas Extras' conImporte: (self montoPorHorasExtras )).! !

!EmpleadoTemporario methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 11:10:49'!
montoPorEdad

"$25 si supera los 50 años "


	^(self edad > 50)
	ifTrue: [ (25 * peso )]
	ifFalse: [ (0 * peso)].
! !

!EmpleadoTemporario methodsFor: 'as yet unclassified' stamp: 'ns 3/27/2025 18:23:41'!
montoPorHorasExtras

	^ (40 * self cantHorasExtrasDelEmpleado) * peso.! !

!EmpleadoTemporario methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 11:25:18'!
obraSocial
"10% de su sueldo bruto + $25 si supera los 50 años "

	^ ((self descuentoPorObraSocial) + (self montoPorEdad)). ! !

!EmpleadoTemporario methodsFor: 'as yet unclassified' stamp: 'ns 3/27/2025 18:22:46'!
sueldoBruto

	^(self sueldoBasicoDelEmpleado) + (self montoPorHorasExtras).! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'EmpleadoTemporario class' category: #'Empresa-Ejercicio1'!
EmpleadoTemporario class
	instanceVariableNames: ''!

!EmpleadoTemporario class methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 18:36:19'!
conNombre: nombreEmpleado conDireccion: direccion estadoCivil: estadoCivil sueldoBasico: sueldo fechaDeNacimiento: fecha fechaDeFin: fechaFin cantHorasExtras: cantidad


	^ self new initializeconNombre: nombreEmpleado conDireccion: direccion estadoCivil: estadoCivil sueldoBasico: sueldo fechaDeNacimiento: fecha fechaDeFin: fechaFin cantHorasExtras: cantidad! !


!classDefinition: #Empresa category: #'Empresa-Ejercicio1'!
Object subclass: #Empresa
	instanceVariableNames: 'nombreDeLaEmpresa cuitDeLaEmpresa listaDeEmpleados listaDeHaberes'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Empresa-Ejercicio1'!

!Empresa methodsFor: 'as yet unclassified' stamp: 'ns 3/27/2025 14:05:05'!
cantidadDeEmpleados

	^self listaDeEmpleados size.! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 20:39:09'!
crearReciboDelEmpleado: empleado

	empleado llenarListaDeConceptos.
	self setlistaDeHaberes:(ReciboDeHaberes crearUnReciboDelEmpleado: empleado)! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 16:57:16'!
cuitDeLaEmpresa
	
	^cuitDeLaEmpresa.! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 14:19:05'!
initializeInstanciaConNombre: nombre conCuit: numero

	nombreDeLaEmpresa:= nombre.
	cuitDeLaEmpresa:= numero.
	listaDeEmpleados:= Set new.
	listaDeHaberes:= Set new.! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 12:19:41'!
liquidarSueldos

	
	self listaDeEmpleados do:[: empleado | (self crearReciboDelEmpleado: empleado)].! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 16:57:44'!
listaDeEmpleados
	
	^listaDeEmpleados.! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 16:57:58'!
listaDeHaberes

	^listaDeHaberes.! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 16:56:55'!
nombreDeLaEmpresa

	^nombreDeLaEmpresa.! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'ns 3/27/2025 13:51:09'!
setListaDeEmpleados: empleado

	self listaDeEmpleados add: empleado.! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 16:07:22'!
setListaDeHaberes: unHaber

	self listaDeHaberes  add: unHaber.! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 11:45:21'!
setlistaDeHaberes: unHaber

	self listaDeHaberes  add: unHaber.! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 18:35:23'!
totalDeRecibos

	^ listaDeHaberes size.! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 12:36:02'!
totalDeRetenciones

	^ self listaDeEmpleados sum:[: empleado | empleado retenciones ].! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 12:35:32'!
totalDeSueldosBrutos

	^ self listaDeEmpleados sum:[: empleado | empleado sueldoBruto ].! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 12:35:14'!
totalDeSueldosNetos

	^ self listaDeEmpleados sum:[: empleado | empleado sueldoNeto ].! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'Empresa class' category: #'Empresa-Ejercicio1'!
Empresa class
	instanceVariableNames: ''!

!Empresa class methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 18:09:46'!
conNombre: nombre conCuit: numero

	^self new initializeInstanciaConNombre: nombre conCuit: numero.! !

!Empresa class methodsFor: 'as yet unclassified' stamp: 'ns 3/26/2025 16:42:30'!
initializeClaseConNombre: nombre conCuit: numero

	^self new initializeInstanciaConNombre: nombre conCuit: numero.! !


!classDefinition: #EstadoCivil category: #'Empresa-Ejercicio1'!
Object subclass: #EstadoCivil
	instanceVariableNames: ''
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Empresa-Ejercicio1'!

!EstadoCivil methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 11:04:24'!
monto

	self subclassResponsibility .! !


!classDefinition: #Casado category: #'Empresa-Ejercicio1'!
EstadoCivil subclass: #Casado
	instanceVariableNames: ''
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Empresa-Ejercicio1'!

!Casado methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 11:04:38'!
monto

	^100 * peso.! !


!classDefinition: #Soltero category: #'Empresa-Ejercicio1'!
EstadoCivil subclass: #Soltero
	instanceVariableNames: ''
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Empresa-Ejercicio1'!

!Soltero methodsFor: 'as yet unclassified' stamp: 'ns 3/28/2025 11:04:52'!
monto

	^0 * peso.! !


!classDefinition: #ReciboDeHaberes category: #'Empresa-Ejercicio1'!
Object subclass: #ReciboDeHaberes
	instanceVariableNames: 'nombreDelEmpleado dirección fechaDeEmisión sueldoBruto sueldoNeto desgloceDeConceptos'
	classVariableNames: 'DesgloceDeConceptos Dirección FechaDeEmisión NombreDelEmpleado SueldoBruto SueldoNeto'
	poolDictionaries: ''
	category: 'Empresa-Ejercicio1'!

!ReciboDeHaberes methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 12:57:22'!
esIgualA: otroRecibo
    ^ self nombreDelEmpleado = otroRecibo nombreDelEmpleado
        ! !

!ReciboDeHaberes methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 12:56:22'!
initializeCrearUnReciboDelEmpleado: empleado

	 nombreDelEmpleado:= empleado nombreDelEmpleado.
	 dirección:= empleado direccionEmpleado. 
        fechaDeEmisión:= Date today.
        sueldoBruto:= empleado sueldoBruto.
        sueldoNeto:= empleado sueldoNeto.
       desgloceDeConceptos := empleado listaDeConceptos .
"esto es un renglón por cada concepto que aplique en la conformación del sueldo bruto y retenciones aplicadas, siempre informando el monto de cada ítem."! !

!ReciboDeHaberes methodsFor: 'as yet unclassified' stamp: 'ns 3/30/2025 12:56:36'!
nombreDelEmpleado
	^nombreDelEmpleado.! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'ReciboDeHaberes class' category: #'Empresa-Ejercicio1'!
ReciboDeHaberes class
	instanceVariableNames: ''!

!ReciboDeHaberes class methodsFor: 'as yet unclassified' stamp: 'ns 3/29/2025 11:46:09'!
crearUnReciboDelEmpleado: empleado

	^self new initializeCrearUnReciboDelEmpleado: empleado.! !
