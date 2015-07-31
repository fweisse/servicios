<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:val1="http://validacionidentidad.entities.osde.ar"
	xmlns:wss="http://wsServices.services.ccg.osde.com.ar/">
	
	<xsl:output method="xml" encoding="UTF-8" indent="yes" omit-xml-declaration="yes" />
	
	<xsl:template match="/">
		<soapenv:Envelope>
			<soapenv:Header/>
			<soapenv:Body>
				<wss:buscarNoSocio>
					<documento>
						<xsl:value-of select="//val1:sujetoActividad/val1:numeroDocumento" />
					</documento>
				</wss:buscarNoSocio>
			</soapenv:Body>
		</soapenv:Envelope>
	</xsl:template>
	
</xsl:stylesheet>