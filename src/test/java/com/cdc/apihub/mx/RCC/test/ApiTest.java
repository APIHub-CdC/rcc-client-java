package com.cdc.apihub.mx.RCC.test;

import com.cdc.apihub.mx.RCC.client.ApiClient;
import com.cdc.apihub.mx.RCC.client.ApiException;
import com.cdc.apihub.mx.RCC.client.ApiResponse;
import com.cdc.apihub.mx.RCC.client.api.RCCApi;
import com.cdc.apihub.mx.RCC.client.interceptor.SignerInterceptor;
import com.cdc.apihub.mx.RCC.client.model.CatalogoEstados;
import com.cdc.apihub.mx.RCC.client.model.CatalogoTipoAsentamiento;
import com.cdc.apihub.mx.RCC.client.model.CatalogoTipoDomicilio;
import com.cdc.apihub.mx.RCC.client.model.DomicilioPeticion;
import com.cdc.apihub.mx.RCC.client.model.PersonaPeticion;
import com.cdc.apihub.mx.RCC.client.model.Respuesta;
import okhttp3.OkHttpClient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;

public class ApiTest {
	
    private final RCCApi api = new RCCApi();

	private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());

	private ApiClient apiClient;
	
	private String usernameCDC = "your_username_otrorgante";
	private String passwordCDC = "your_password_otorgante";
	private String xApiKey = "X_Api_Key";

	private SignerInterceptor interceptor;

	@Before()
	public void setUp() {
		this.apiClient = api.getApiClient();
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
				.readTimeout(30, TimeUnit.SECONDS)
				.addInterceptor(new SignerInterceptor())
				.build();
		apiClient.setHttpClient(okHttpClient);
	}


    @Test
    public void getReporteTest() throws ApiException {

		Integer estatusOK = 200;
		Integer estatusNoContent = 204;

        PersonaPeticion persona = new PersonaPeticion();
        DomicilioPeticion domicilio = new DomicilioPeticion();
		persona.setApellidoPaterno("PRUEBA");
		persona.setApellidoMaterno("CUATRO");
		persona.setPrimerNombre("JUAN");
	    persona.setFechaNacimiento("1980-01-04");
	    persona.setRFC("PUAC800107");
	    persona.setCURP(null);
	    persona.setNacionalidad("MX");
		
		domicilio.setDireccion("INSURGENTES SUR 1007");
		domicilio.setColoniaPoblacion("INSURGENTES SUR");
		domicilio.setDelegacionMunicipio("CIUDAD DE MEXICO");
		domicilio.setCiudad("CIUDAD DE MEXICO");
		domicilio.setEstado(CatalogoEstados.DF);
		domicilio.setCP("11230");
		domicilio.setFechaResidencia(null);
        domicilio.setTipoAsentamiento(CatalogoTipoAsentamiento._28);
        domicilio.setTipoDomicilio(CatalogoTipoDomicilio.C);
		
		persona.setDomicilio(domicilio);
        
        try {
			
			ApiResponse<?> response = api.getGenericReporte(xApiKey, usernameCDC, passwordCDC, persona);
			
			Assert.assertTrue(estatusOK.equals(response.getStatusCode()));
			
			if (estatusOK.equals(response.getStatusCode())) {

				Respuesta responseOK = (Respuesta) response.getData();
				logger.info(responseOK.toString());
					
			}
		} catch (ApiException e) {
			
			if (!estatusNoContent.equals(e.getCode())) {
				logger.info("Response processed by client:"+ e.getResponseBody());
			} else {

				logger.info("The response was a status 204 (NO CONTENT)");
			}

			Assert.assertTrue(estatusOK.equals(e.getCode()));
		}
    }

}