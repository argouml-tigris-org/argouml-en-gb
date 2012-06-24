/* $Id$
 *******************************************************************************
 * Copyright (c) 2012 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Linus Tolke
 *******************************************************************************
 */

package org.argouml.i18n;

import java.util.Collection;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestEnGbKeys extends CheckKey {
    @Parameters
    public static Collection<Object[]> getAllKeys() {
	return CheckKey.getKeysFor(
		new Locale("en", "gb"),
		new CheckKey.IgnoredKey() {
		    public boolean ignore(String theKey,
					  Locale theLocale,
					  ResourceBundle theLabels,
					  ResourceBundle theRootLabels) {
			return theKey.matches("aboutbox..*")
                               || theKey.matches("checklist..*")
                               || theKey.matches("message..*")
                               || theKey.matches("parsing..*")
                               || theKey.matches("profile..*")
                               || theKey.matches("wfr..*")
                               || theKey.matches("cpp..*");
		    }
		}
		);
    }

    public TestEnGbKeys(String theKey, Locale theLocale,
		        ResourceBundle theLabels,
		        ResourceBundle theRootLabels) {
	super(theKey, theLocale, theLabels, theRootLabels);
    }
}
