/*
 *
 * MIT License
 *
 * Copyright (c) 2022 Caputo Ortega, Augusto Franco Bernardo (caputo.com.ar)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
*/

package ar.com.caputo.util.languagemapper.demo;

import java.text.MessageFormat;

import javax.swing.JOptionPane;

import ar.com.caputo.util.languagemapper.LanguageMapper;
import ar.com.caputo.util.languagemapper.component.Language;

/**
 * This class is an intent to illustrate how to
 * use the {@link LanguageMapper}.
 */
public class App {
    
    private static LanguageMapper mapper;

    public static void main(String[] args) {

        // This will create a mapper for the AppLanguageStrings class
        // and populate the keys with the contents of the EN_GB.LANG
        // file located at the default file path (/assets/lang).
        App.mapper = new LanguageMapper(Language.EN_GB, AppLanguageStrings.class, null);
    
        // Now we salute the user :)
        salute();
        
        // Re-defining the mapper to a different language let us
        // run the same programme but obtain different results
        // without having to modify anything but the LanguageMapper
        // declaration.
        // In this case, all the messages will be displayed in
        // Spanish.
        App.mapper = new LanguageMapper(Language.ES_AR, AppLanguageStrings.class, null);

        // Now we salute the user (in Spanish!) :)
        salute();

    }

    private static void salute() {


        String name;

        do {

            // Simple mapper usage.
            // In this case we only show the literal associated with the
            // specified key.
            name = JOptionPane.showInputDialog(
                                                null,
                                                mapper.get(AppLanguageStrings.PROMPT_ENTER_NAME),
                                                mapper.get(AppLanguageStrings.PROGRAMME_TITLE),
                                                JOptionPane.INFORMATION_MESSAGE);

        } while(name == null || name.isBlank());

        // A more complex mapper usage.
        // In this case we not only show the literal but we also 
        // interact with it inserting a variable (name) on the
        // placeholder (see lang file for details)
        JOptionPane.showMessageDialog(
                                null,
                                MessageFormat.format(
                                    mapper.get(AppLanguageStrings.GREETING),
                                    name),
                                mapper.get(AppLanguageStrings.PROGRAMME_TITLE),
                                JOptionPane.INFORMATION_MESSAGE
                                );

    }

}
