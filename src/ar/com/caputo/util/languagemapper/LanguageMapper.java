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


package ar.com.caputo.util.languagemapper;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Set;

import ar.com.caputo.util.languagemapper.exception.LanguageKeyNotFoundException;
import ar.com.caputo.util.languagemapper.component.LangKeyTemplate;
import ar.com.caputo.util.languagemapper.component.Language;
import ar.com.caputo.util.languagemapper.component.LanguageFile;
import ar.com.caputo.util.languagemapper.exception.InvalidLangKeyTemplateException;
import ar.com.caputo.util.languagemapper.exception.LanguageFileNotFoundException;

/**
 * LanguageMapper is a utility aiming to provide a
 * seamless experience with language translation files
 * mapping each {@code .LANG} file from the assets to
 * a template file based on an {@code enum}.
 * The reason behind mapping {@code enum}s is to allow
 * access to the language keys in an easier way so that
 * also helps some IDEs suggest predefined constant values
 * that will be paired with an actual literal at runtime.   
*/
public class LanguageMapper {

    private final Language defaultLanguage = Language.EN_US;

    private final Language language;
    private final String filePath;
    private final Class<? extends Enum<?>> template;
    private final HashMap<String, String> literals = new HashMap<String, String>();


    /**
     * 
     * Sets up the mapper.
     * 
     * @param language A language locale from {@link ar.com.caputo.util.languagemapper.component.Language}. 
                       If null, the default language is used.
     * @param template Must be an {@code enum} implementing {@link ar.com.caputo.util.languagemapper.component.LangKeyTemplate}
     * @param filePath The file path where the {@code .LANG} 
                       files are going to be stored. Default value is {@code /assets/lang/}
     * 
     **/
    public LanguageMapper(Language language, Class<? extends Enum<?>> template, String filePath) {

        this.language = language == null ? this.defaultLanguage : language;
        if (template == null) throw new NullPointerException("template must not be null");
        this.template = template;
        this.filePath = filePath == null ? "assets/lang/" : filePath;
        
        update();

    }
    

    /**
     * 
     *  Pairs the literals from the language file into the
     *  template key values. 
     *  
     * 
     * @return {@code true} when mapping is successful
     * @throws LanguageFileNotFoundException
     * @throws LanguageKeyNotFoundException
     * @throws InvalidLangKeyTemplateException
     * 
     **/
    private boolean map() throws LanguageFileNotFoundException, LanguageKeyNotFoundException, InvalidLangKeyTemplateException  {

        LanguageFile languageFile = new LanguageFile(this.language, this.filePath);

        if(!Set.of(this.template.getInterfaces()).contains(LangKeyTemplate.class)) throw new InvalidLangKeyTemplateException(this.template);

        // Retrieve all fields from the template class and iterate through them.
        for (Field templateField : this.template.getDeclaredFields()) {

            String templateKey = templateField.getName();

            /*
                * Last field is always ENUM$VALUES and does not add
                * any additional information to the template so we
                * stop the iteration since we reached the end of the
                * template enum fields.
            */ 
            if(templateKey.equals("ENUM$VALUES")) return true;

            String literal = languageFile.getData().getProperty(templateKey);

            if(literal == null) throw new LanguageKeyNotFoundException(templateKey);

            this.literals.put(templateKey, literal); 
                
        }

        // If we reach this point it means something
        // happened and we could not finish processing
        // the template
        return false;
        
    }


    /**
     * 
     * Updates the current language map
     * to the latest file version.
     * 
     * @return {@code true} when update is successful
     **/
    public boolean update() {
        try {
            return map();
        } catch (LanguageFileNotFoundException | LanguageKeyNotFoundException | InvalidLangKeyTemplateException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 
     * @return A copy of the language list
     * 
     **/
    public Language[] getLanguages() {
        return Language.values().clone();
    }

    /**
     * 
     * @return The locale for the current language
     * 
     */
    public String getCurrentLanguage() {
        return this.language.name();
    }

    /**
     * 
     * @param <T> A template
     * @param key A value from the template
     * @return The literal value of the specified
               language key for the current mapping
     * 
     **/
    public  <T extends Enum<T>> String get(T key) {
        return literals.get(key.name());
    }

}
