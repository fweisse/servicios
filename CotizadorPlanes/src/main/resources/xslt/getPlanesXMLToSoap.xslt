<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"	
	xmlns:cot="http://osde.com.ar/services/CotizadorPlanes"
	xmlns:ns1="http://www.osde.com.ar/PUB/PlanesComercialesSocio/response"
	exclude-result-prefixes="xsl ns1">
	<xsl:template match="/ns1:PLANES_COMERCIALES_SOCIO_Resp">
		<cot:getPlanesResponse>
			<cot:PlanCotizador>
				<xsl:for-each select="E_PLANES">
					<list xsi:type="cot:planCotizador">
						<xsl:variable name="prefijoPlan">
							<xsl:value-of select="PREFIJO"></xsl:value-of>
						</xsl:variable>
						<xsl:variable name="numeroPlan">
							<xsl:value-of select="PLAN"></xsl:value-of>
						</xsl:variable>
						<id>
							<xsl:value-of select="$prefijoPlan" />
							<xsl:value-of select="$numeroPlan" />
						</id>
						<numero>
							<xsl:value-of select="$numeroPlan" />
						</numero>
						<prefijoPlan>
							<xsl:value-of select="$prefijoPlan" />
						</prefijoPlan>
					</list>
				</xsl:for-each>
				<totalResults>
					<xsl:value-of select="count(E_PLANES)" />
				</totalResults>
				<truncated>false</truncated>
			</cot:PlanCotizador>
		</cot:getPlanesResponse>
	</xsl:template>
</xsl:stylesheet>