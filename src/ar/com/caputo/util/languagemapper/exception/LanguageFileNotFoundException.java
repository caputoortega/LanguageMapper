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

package ar.com.caputo.util.languagemapper.exception;

import java.text.MessageFormat;

import ar.com.caputo.util.languagemapper.component.Language;

/**
 * This exception is thrown whenever the associated {@code .LANG} file
 * is not available for a specific language region.
 */
public class LanguageFileNotFoundException extends Exception {

    public LanguageFileNotFoundException(Language language) {
        super(MessageFormat.format("The language file for {0} could not be found.", language));
    }
    
}
