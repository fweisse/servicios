<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:cuen1="http://cuentaDataNet.socio.entities.osde.com.ar"
	xmlns:cuen="http://osde.com.ar/services/cuentadatanetservice"
	exclude-result-prefixes="xsl cuen cuen1">

	  <xsl:output method="xml" encoding="UTF-8" indent="yes" />
 	<!-- <xsl:output method="xml"  indent="yes" /> -->
	<xsl:template match="/">
		<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:ctas="http://www.osde.com.ar/PUB/Ctas_Datanet">
			<soapenv:Header />
			<soapenv:Body>
				<ctas:CtasDatanet_req>
					<I_CONTRATO><xsl:value-of select="//cuen1:nroContrato" /></I_CONTRATO>
					<I_ORDEN><xsl:value-of select="//cuen1:nroOrden" /></I_ORDEN>
					<I_FECHA><xsl:value-of select="//cuen1:fecha" /></I_FECHA>
				</ctas:CtasDatanet_req>
			</soapenv:Body>
		</soapenv:Envelope>
	</xsl:template>
</xsl:stylesheet>