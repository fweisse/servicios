<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:s="http://sap.com/xi/WebService/xi2.0"
	exclude-result-prefixes="xsl s">


	<xsl:template match="/">
		<SOAP:Envelope xmlns:SOAP="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:cuen="http://osde.com.ar/services/cuentadatanetservice">
			<xsl:choose>

				<xsl:when test="//SOAP:Fault">
					<SOAP:Body>
						<SOAP:Fault>
							<faultcode>
								<xsl:value-of select="//SOAP:Fault/faultcode" />
							</faultcode>
							<faultstring> <xsl:value-of select="//SOAP:Fault/faultstring" /> </faultstring>
							<faultactor>
								<xsl:value-of select="//SOAP:Fault/faultstring" />
							</faultactor>

							<detail>
								<cuen:CuentaDataNetNoRegistradaException>
									<faultCode>
										<xsl:value-of select="//SOAP:Fault/detail/s:SystemError/code" />
									</faultCode>
									<faultActor>
										<xsl:value-of select="//SOAP:Fault/detail/s:SystemError/text" />
									</faultActor>
									<faultString>
										<xsl:value-of select="//SOAP:Fault/detail/s:SystemError/text" />
									</faultString>
								</cuen:CuentaDataNetNoRegistradaException>
							</detail>
						</SOAP:Fault>
					</SOAP:Body>
				</xsl:when>

				<xsl:otherwise>
					<SOAP:Body>

						<ns1:CtasDatanet_resp
							xmlns:ns1="http://www.osde.com.ar/PUB/Ctas_Datanet/response">
							
							<xsl:for-each select="//E_CUENTA_DATANET">
								<ns1:banco>
									<ns1:codigo>
										<xsl:value-of select="//E_CUENTA_DATANET/CLAVE_BANCO" />
									</ns1:codigo>
									<ns1:nombre>
										<xsl:value-of select="//E_CUENTA_DATANET/NOMBRE_BANCO" />
									</ns1:nombre>
									<ns1:sucursal>
										<ns1:codigo>
											<xsl:value-of select="//E_CUENTA_DATANET/CODIGO_SUCURSAL" />
										</ns1:codigo>
										<ns1:descripcion>
											<xsl:value-of select="//E_CUENTA_DATANET/NOMBRE_SUCURSAL" />
										</ns1:descripcion>
									</ns1:sucursal>
								</ns1:banco>
								<ns1:cbu>
									<xsl:value-of select="//E_CUENTA_DATANET/CBU" />
								</ns1:cbu>
								<ns1:contratoBid>
									<ns1:nroContrato>
										<xsl:value-of select="//E_CUENTA_DATANET/CONTRATO_SOCIO" />
									</ns1:nroContrato>
								</ns1:contratoBid>
								<ns1:cuenta>
									<ns1:numero>
										<xsl:value-of select="//E_CUENTA_DATANET/CUENTA_BANCARIA" />
									</ns1:numero>
									<ns1:tipo>
										<xsl:value-of select="//E_CUENTA_DATANET/TIPO_CUENTA_BANK" />
									</ns1:tipo>
								</ns1:cuenta>
								<ns1:estado>
									<ns1:codigo>
										<xsl:value-of select="//E_CUENTA_DATANET/ESTADO_CUENTA" />
									</ns1:codigo>
									<ns1:descripcion>
										<xsl:value-of select="//E_CUENTA_DATANET/DESCRIPCION" />
									</ns1:descripcion>
								</ns1:estado>
								<ns1:fechaActivacion>
									<xsl:value-of select="//E_CUENTA_DATANET/FECHA" />
								</ns1:fechaActivacion>
								<ns1:interlocutorComercial>
									<xsl:value-of select="//E_CUENTA_DATANET/PARTNER" />
								</ns1:interlocutorComercial>
								<ns1:marcaCuentaReintegro>
									<xsl:value-of select="//E_CUENTA_DATANET/REINTEGRO" />
								</ns1:marcaCuentaReintegro>
								<ns1:nombreTitularCuenta>
									<xsl:value-of select="//E_CUENTA_DATANET/TITULAR_CUENTA" />
								</ns1:nombreTitularCuenta>
								<ns1:nroOrden>
									<xsl:value-of select="//E_CUENTA_DATANET/ORDEN" />
								</ns1:nroOrden>
								<ns1:relacionBancaria>
									<xsl:value-of select="//E_CUENTA_DATANET/REL_BANCARIA" />
								</ns1:relacionBancaria>
								<ns1:tipoCuenta>
									<ns1:codigo>
										<xsl:value-of select="//E_CUENTA_DATANET/TIPO_CUENTA_BANK" />
									</ns1:codigo>
									<ns1:descripcion>
										<xsl:value-of select="//E_CUENTA_DATANET/TIPO_CUENTA" />
									</ns1:descripcion>
								</ns1:tipoCuenta>
								
								</xsl:for-each>

						</ns1:CtasDatanet_resp>
					</SOAP:Body>
				</xsl:otherwise>
			</xsl:choose>

		</SOAP:Envelope>
	</xsl:template>
</xsl:stylesheet>