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
import com.shapesecurity.functional.data.ImmutableList;

import org.jetbrains.annotations.NotNull;

public class FunctionBody implements Node, FunctionBodyExpression {

    @NotNull
    public final ImmutableList<Directive> directives;

    @NotNull
    public final ImmutableList<Statement> statements;

    public FunctionBody(@NotNull ImmutableList<Directive> directives, @NotNull ImmutableList<Statement> statements) {
        super();
        this.directives = directives;
        this.statements = statements;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof FunctionBody && this.directives.equals(((FunctionBody) object).directives) &&
               this.statements.equals(((FunctionBody) object).statements);
    }

    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "FunctionBody");
        code = HashCodeBuilder.put(code, this.directives);
        code = HashCodeBuilder.put(code, this.statements);
        return code;
    }

    @NotNull
    public ImmutableList<Directive> getDirectives() {
        return this.directives;
    }

    @NotNull
    public FunctionBody setDirectives(@NotNull ImmutableList<Directive> directives) {
        return new FunctionBody(directives, this.statements);
    }

    @NotNull
    public ImmutableList<Statement> getStatements() {
        return this.statements;
    }

    @NotNull
    public FunctionBody setStatements(@NotNull ImmutableList<Statement> statements) {
        return new FunctionBody(this.directives, statements);
    }

}