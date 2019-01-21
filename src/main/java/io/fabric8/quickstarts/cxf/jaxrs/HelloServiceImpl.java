/**
 *  Copyright 2005-2016 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package io.fabric8.quickstarts.cxf.jaxrs;

import org.json.JSONObject;
import io.swagger.annotations.Api;

@Api("/sayHello")
public class HelloServiceImpl implements HelloService {

    public String welcome() {
        return "Welcome to the CXF RS Spring Boot application, append /{name} to call the hello service";
    }

    public String sayHello(String a) {
        return "Hello " + a + ", Welcome to CXF RS Spring Boot World!!!";
    }

	@Override
	public String obtenerDatos(String json) {
		String response;
		
		JSONObject jsonObj = new JSONObject(json);
		
		Integer rut = jsonObj.getInt("rut");
		String dv = jsonObj.getString("dv");
		
		if(rut == 17462670) {
			response = "{\n" + 
					"  \"nombre\": \"Carlos\",\n" + 
					"  \"apellido\": \"Estay\",\n" + 
					"  \"origen\": \"SCL\",\n" + 
					"  \"destino\" \"IQQ\",\n" + 
					"  \"asiento\": \"13F\"\n" + 
					"}";
		}else if (rut == 24323450) {
			response = "{\n" + 
					"  \"nombre\": \"Cristian\",\n" + 
					"  \"apellido\": \"Duarte\",\n" + 
					"  \"origen\": \"SCL\",\n" + 
					"  \"destino\" \"IQQ\",\n" + 
					"  \"asiento\": \"14F\"\n" + 
					"}";
		}else {
			response = "{\n" + 
					"  \"nombre\": \"no data\",\n" + 
					"  \"apellido\": \"no data\",\n" + 
					"  \"origen\": \"no data\",\n" + 
					"  \"destino\" \"no data\",\n" + 
					"  \"asiento\": \"no data\"\n" + 
					"}";
		}

		
		return response;
	}
    
}
