<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  	xmlns:cot="http://osde.com.ar/services/CotizadorPlanes"
  	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
  	exclude-result-prefixes="xsl cot soapenv">

	<xsl:template match="//cot:getCotizacion">
		<envelope>
         <header/>
         <body>
	         <FILSERV><xsl:value-of select="cot:codigoFilialServicio"/></FILSERV>
	         <CAPSERV><xsl:value-of select="cot:codigoCapServicio"/></CAPSERV>
	         <PPLANPRES><xsl:value-of select="cot:codigoCap"/></PPLANPRES>
	         <PLANPRES><xsl:value-of select="cot:prefijoPlanaPresupuestar"/></PLANPRES>
	         <TIPSOC><xsl:value-of select="cot:tipoSocio"/></TIPSOC>
	         <TIPGF><xsl:value-of select="cot:tipoEsquemaFamiliar"/></TIPGF>
	         <CANT_ADIC_JR1><xsl:value-of select="cot:cantidadHijosMenoresDirecto"/></CANT_ADIC_JR1>
	         <CANT_ADIC_JR2><xsl:value-of select="cot:cantidadHijosMayoresDirecto"/></CANT_ADIC_JR2>
	         <CANT_ADIC><xsl:value-of select="cot:cantidadHijosMonotributista"/></CANT_ADIC>
	         <FECVAL><xsl:value-of select="cot:fechaValorizacion"/></FECVAL>
	         <MONREMIMP><xsl:value-of select="cot:remuneracion"/></MONREMIMP>
      </body>
      </envelope>
	</xsl:template>
</xsl:stylesheet>