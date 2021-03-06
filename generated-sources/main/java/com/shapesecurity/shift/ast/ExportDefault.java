// Generated by src/generate-spec-java.js 

/*
 * Copyright 2015 Shape Security, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shapesecurity.shift.ast;

import com.shapesecurity.functional.data.HashCodeBuilder;

import org.jetbrains.annotations.NotNull;

public class ExportDefault extends ExportDeclaration implements Node {

    @NotNull
    public final FunctionDeclarationClassDeclarationExpression body;

    public ExportDefault(@NotNull FunctionDeclarationClassDeclarationExpression body) {
        super();
        this.body = body;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof ExportDefault && this.body.equals(((ExportDefault) object).body);
    }

    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "ExportDefault");
        code = HashCodeBuilder.put(code, this.body);
        return code;
    }

    @NotNull
    public FunctionDeclarationClassDeclarationExpression getBody() {
        return this.body;
    }

    @NotNull
    public ExportDefault setBody(@NotNull FunctionDeclarationClassDeclarationExpression body) {
        return new ExportDefault(body);
    }

}