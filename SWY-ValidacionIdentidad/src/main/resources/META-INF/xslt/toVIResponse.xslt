<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:val1="http://validacionidentidad.entities.osde.ar" xmlns:s="http://sap.com/xi/WebService/xi2.0"
	xmlns:val="http://osde.com.ar/services/atencion/validacionidentidad"
	exclude-result-prefixes="val1 xsl">

	<xsl:template match="/ | @* | node()">

		<xsl:copy>
			<xsl:apply-templates select="@* | node()" />
		</xsl:copy>

	</xsl:template>

</xsl:stylesheet>

