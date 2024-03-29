/*
 * Copyright 2011 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: 14/04/2011 - 14:49:07
 * 
 * ================================================================================
 * 
 * Direitos autorais 2011 JRimum Project
 * 
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode usar
 * esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que
 * haja exigência legal ou acordo por escrito, a distribuição de software sob
 * esta LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER
 * TIPO, sejam expressas ou tácitas. Veja a LICENÇA para a redação específica a
 * reger permissões e limitações sob esta LICENÇA.
 * 
 * Criado em: 14/04/2011 - 14:49:07
 * 
 */

package org.jrimum.bopepo.pdf;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Teste da classe PdfDocMix.
 * 
 * @author <a href="mailto:romulomail@gmail.com">Rômulo Augusto</a>
 *
 * @version 0.2.3
 * 
 * @since 0.2
 */
public class TestPdfDocMix {
	
	private static final byte[] BYTES = "COM_BYTES".getBytes(); 

	PdfDocMix doc = null;
	
	
	
	@Test
	public void seCriaComTemplateEmBytes(){
	
		doc = PdfDocMix.createWithTemplate(BYTES);
		
		assertNotNull(doc);
	}
}
