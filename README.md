## About LanguageMapper

LanguageMapper is a library aiming to provide developers with an easy way to add multilingual support to their applications. 
The idea behind the library is to use a template class with constants representing each "language key" (that is, each String from the software that should be translatable) that can be mapped to a desired language file, that way, the software does not hardcode any translatable information and fixing typos don't require recompiling the programme since the language literals are loaded at startup.

## Folder Structure

- `src`: contains the actual library source code
- `src_demo`: contains a demostration on how to use the library on your projects
- `assets`: contains the language files from where demo will read the key literals

## Licence

Copyright 2022 Caputo Ortega, Augusto Franco Bernardo (caputo.com.ar)

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


