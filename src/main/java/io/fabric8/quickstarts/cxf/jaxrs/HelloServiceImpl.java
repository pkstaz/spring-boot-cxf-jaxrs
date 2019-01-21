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
			response = "{" + 
					"  \"nombre\": \"Carlos\"," + 
					"  \"apellido\": \"Estay\"," + 
					"  \"origen\": \"SCL\"," + 
					"  \"destino\": \"IQQ\"," + 
					"  \"asiento\": \"13F\"" + 
					"}";
		}else if (rut == 24323450) {
			response = "{" + 
					"  \"nombre\": \"Cristian\"," + 
					"  \"apellido\": \"Duarte\"," + 
					"  \"origen\": \"SCL\"," + 
					"  \"destino\": \"IQQ\"," + 
					"  \"asiento\": \"14F\"" + 
					"}";
		}else {
			response = "{" + 
					"  \"nombre\": \"no data\"," + 
					"  \"apellido\": \"no data\"," + 
					"  \"origen\": \"no data\"," + 
					"  \"destino\": \"no data\"," + 
					"  \"asiento\": \"no data\"" + 
					"}";
		}

		
		return response;
	}
    
}
