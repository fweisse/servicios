<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:val1="http://validacionidentidad.entities.osde.ar" xmlns:s="http://sap.com/xi/WebService/xi2.0"
	xmlns:val="http://osde.com.ar/services/atencion/validacionidentidad"
	exclude-result-prefixes="val1 xsl">

	<xsl:output method="xml" encoding="UTF-8" indent="yes"
		omit-xml-declaration="yes" />

	<xsl:template match="/">
		<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
			<soapenv:Header />
			<soapenv:Body>
				<envelope>
					<header>
						<message>ConsultaEmpresasGenerica2CCG</message>
					</header>
					<body>
						<IPARAMETROS>
							<IC_UF>
								<xsl:value-of select="//val1:sujetoActividad/val1:nroInterlocutor" />
							</IC_UF>
							<CON_UF />
						</IPARAMETROS>
					</body>
				</envelope>
			</soapenv:Body>
		</soapenv:Envelope>
	</xsl:template>

</xsl:stylesheet>

