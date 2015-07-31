<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:cot="http://osde.com.ar/services/CotizadorPlanes">
	<xsl:template match="TiposGrupoFamiliar_Resp">
		<cot:getEsquemaFamiliarResponse>
			<cot:EsquemaFamiliar>
				<xsl:for-each select="E_DESCR/item">
					<list xsi:type="cot:esquemaFamiliar">
						<codigoTipoEsquemaFamiliar>
							<xsl:value-of select="TIPGF" />
						</codigoTipoEsquemaFamiliar>
						<descripcionEsquemaFamiliar>
							<xsl:value-of select="DESCR" />
						</descripcionEsquemaFamiliar>
					</list>
				</xsl:for-each>
				<totalResults>
					<xsl:value-of select="count(E_DESCR/item)" />
				</totalResults>
				<truncated>false</truncated>
			</cot:EsquemaFamiliar>
		</cot:getEsquemaFamiliarResponse>
	</xsl:template>
</xsl:stylesheet>