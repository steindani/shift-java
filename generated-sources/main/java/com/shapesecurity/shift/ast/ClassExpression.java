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
import com.shapesecurity.functional.data.Maybe;
import com.shapesecurity.shift.ast.operators.Precedence;

import org.jetbrains.annotations.NotNull;

public class ClassExpression extends Expression implements Node, Class {

    @NotNull
    public final Maybe<BindingIdentifier> name;

    @NotNull
    public final Maybe<Expression> _super;

    @NotNull
    public final ImmutableList<ClassElement> elements;

    public ClassExpression(@NotNull Maybe<BindingIdentifier> name,
                           @NotNull Maybe<Expression> _super,
                           @NotNull ImmutableList<ClassElement> elements) {
        super();
        this.name = name;
        this._super = _super;
        this.elements = elements;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof ClassExpression && this.name.equals(((ClassExpression) object).name) &&
               this._super.equals(((ClassExpression) object)._super) && this.elements.equals(
            ((ClassExpression) object).elements);
    }

    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "ClassExpression");
        code = HashCodeBuilder.put(code, this.name);
        code = HashCodeBuilder.put(code, this._super);
        code = HashCodeBuilder.put(code, this.elements);
        return code;
    }

    @NotNull
    public Maybe<BindingIdentifier> getName() {
        return this.name;
    }

    @NotNull
    public ClassExpression setName(@NotNull Maybe<BindingIdentifier> name) {
        return new ClassExpression(name, this._super, this.elements);
    }

    @NotNull
    public Maybe<Expression> getSuper() {
        return this._super;
    }

    @NotNull
    public ClassExpression setSuper(@NotNull Maybe<Expression> _super) {
        return new ClassExpression(this.name, _super, this.elements);
    }

    @NotNull
    public ImmutableList<ClassElement> getElements() {
        return this.elements;
    }

    @NotNull
    public ClassExpression setElements(@NotNull ImmutableList<ClassElement> elements) {
        return new ClassExpression(this.name, this._super, elements);
    }

    @Override
    @NotNull
    public Precedence getPrecedence() {
        return Precedence.PRIMARY;
    }

}