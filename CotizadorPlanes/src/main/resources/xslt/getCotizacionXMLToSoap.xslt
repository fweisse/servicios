<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:cot="http://osde.com.ar/services/CotizadorPlanes">

	<xsl:template match="/">
		<cot:getCotizacionResponse>
			<cot:Cotizacion>
				<fechaDesde>
					<xsl:value-of select="//FECDES" />
				</fechaDesde>
				<fechaHasta>
					<xsl:value-of select="//FECHAS" />
				</fechaHasta>
				<iva>
					<xsl:value-of select="//PORIVA" />
				</iva>
				<montoAprobado>
					<xsl:value-of select="//MONTAPO" />
				</montoAprobado>
				<precio>
					<xsl:value-of select="//PRECIO" />
				</precio>
				<precioBonificacion>
					<xsl:value-of select="//PRECIO_BONIF" />
				</precioBonificacion>
				<precioTotal>
					<xsl:value-of select="//PRECIO_TOTAL" />
				</precioTotal>
			</cot:Cotizacion>
		</cot:getCotizacionResponse>
	</xsl:template>
</xsl:stylesheet>