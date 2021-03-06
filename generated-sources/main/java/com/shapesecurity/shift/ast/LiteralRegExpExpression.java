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

public class LiteralRegExpExpression extends Expression implements Node {

    @NotNull
    public final String pattern;

    @NotNull
    public final String flags;

    public LiteralRegExpExpression(@NotNull String pattern, @NotNull String flags) {
        super();
        this.pattern = pattern;
        this.flags = flags;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof LiteralRegExpExpression && this.pattern.equals(
            ((LiteralRegExpExpression) object).pattern) && this.flags.equals(((LiteralRegExpExpression) object).flags);
    }

    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "LiteralRegExpExpression");
        code = HashCodeBuilder.put(code, this.pattern);
        code = HashCodeBuilder.put(code, this.flags);
        return code;
    }

    @NotNull
    public String getPattern() {
        return this.pattern;
    }

    @NotNull
    public LiteralRegExpExpression setPattern(@NotNull String pattern) {
        return new LiteralRegExpExpression(pattern, this.flags);
    }

    @NotNull
    public String getFlags() {
        return this.flags;
    }

    @NotNull
    public LiteralRegExpExpression setFlags(@NotNull String flags) {
        return new LiteralRegExpExpression(this.pattern, flags);
    }

    @Override
    @NotNull
    public Precedence getPrecedence() {
        return Precedence.PRIMARY;
    }

}