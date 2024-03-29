/*
 * Copyright 2008 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: 30/03/2008 - 19:10:51
 * 
 * ================================================================================
 * 
 * Direitos autorais 2008 JRimum Project
 * 
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode usar
 * esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que
 * haja exigência legal ou acordo por escrito, a distribuição de software sob
 * esta LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER
 * TIPO, sejam expressas ou tácitas. Veja a LICENÇA para a redação específica a
 * reger permissões e limitações sob esta LICENÇA.
 * 
 * Criado em: 30/03/2008 - 19:10:51
 * 
 */


package org.jrimum.domkee;

import org.jrimum.domkee.type.TestAbstractCPRF;
import org.jrimum.domkee.type.TestCNPJ;
import org.jrimum.domkee.type.TestCPF;
import org.jrimum.domkee.type.TestTipoDeMoeda;
import org.jrimum.domkee.type.TestTipoDeTitulo;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses
( 
		{ 
			TestAbstractCPRF.class,
			TestCNPJ.class,
			TestCPF.class,
			TestTipoDeMoeda.class,
			TestTipoDeTitulo.class
		}
)
public class TestSuiteDomkee {

	/*
	 * The class remains completely empty, being used only as a holder for the
	 * above annotations
	 */
}
