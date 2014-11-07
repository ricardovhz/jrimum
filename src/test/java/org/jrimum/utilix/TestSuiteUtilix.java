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

package org.jrimum.utilix;

import org.jrimum.utilix.text.TestField;
import org.jrimum.utilix.text.TestFiller;
import org.jrimum.utilix.text.TestStrings;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 
 * <p>
 * Classe responsável pela execução do conjunto de testes do projeto
 * <em>Utilix</em>
 * </p>
 * 
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L.</a>
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
@RunWith(Suite.class)
@Suite.SuiteClasses( { 
	TestObjects.class
	, TestCollections.class
	, TestField.class
	, TestFiller.class
	, TestDates.class
	, TestStrings.class })
public class TestSuiteUtilix {
	/*
	 * The class remains completely empty, being used only as a holder for the
	 * above annotations
	 */
}
