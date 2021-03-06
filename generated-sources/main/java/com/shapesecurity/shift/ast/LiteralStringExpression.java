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
import com.shapesecurity.shift.ast.operators.Precedence;

import org.jetbrains.annotations.NotNull;

public class LiteralStringExpression extends Expression implements Node {

    @NotNull
    public final String value;

    public LiteralStringExpression(@NotNull String value) {
        super();
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof LiteralStringExpression && this.value.equals(((LiteralStringExpression) object).value);
    }

    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "LiteralStringExpression");
        code = HashCodeBuilder.put(code, this.value);
        return code;
    }

    @NotNull
    public String getValue() {
        return this.value;
    }

    @NotNull
    public LiteralStringExpression setValue(@NotNull String value) {
        return new LiteralStringExpression(value);
    }

    @Override
    @NotNull
    public Precedence getPrecedence() {
        return Precedence.PRIMARY;
    }

}